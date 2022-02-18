package indra.actions;

import indra.models.ProductoLineaDatos;
import indra.pages.BasePage;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class AdvantageActions extends BasePage {
    public AdvantageActions(WebDriver driver) {
        super(driver);
    }

    public void usuarioIniciaSesion( ProductoLineaDatos productoLineaDatos) {
        //getBotonLogin().waitUntilVisible();
        getBotonLogin().click();
        getIngresarNombre().waitUntilPresent();
        enter(productoLineaDatos.getUsuario()).into(getIngresarNombre());
        enter(productoLineaDatos.getContrasena()).into(getIngresaContrasena());
        getIngresarCuenta().click();
    }

    public void hacerclicEnMyAccount(){
        getBotonMyAccount().waitUntilPresent();
        getBotonMyAccount().click();
    }
    public  void seleccionarMyAccont(){
        getMyAccount().click();

    }
    public void validarInformacionCuenta(ProductoLineaDatos productoLineaDatos){
         getNombreUsuario().waitUntilPresent();
        getPais().waitUntilPresent();
        getNumeroTelefono().waitUntilPresent();
        MatcherAssert.assertThat("nombrey apellido son iguales",
                getNombreUsuario().getText(), Matchers.equalTo(productoLineaDatos.getNombreApellido()));

      MatcherAssert.assertThat("el nombre del pais es igual"
                ,getPaisUsuario().getText(),Matchers.equalTo(productoLineaDatos.getPais()));
      MatcherAssert.assertThat("el nuermo de telefono esta presente",
                getNumeroTelefono().getText(),Matchers.equalTo(productoLineaDatos.getNumerotelefono()));

    }





}