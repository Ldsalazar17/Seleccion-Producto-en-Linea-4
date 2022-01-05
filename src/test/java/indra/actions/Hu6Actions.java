package indra.actions;

import indra.models.Hu6Datos;
import indra.pages.BasePage;
import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Hu6Actions extends BasePage {
    public Hu6Actions(WebDriver driver) {
        super(driver);
    }

    public void usuarioIniciaSesion( Hu6Datos hu6Datos) {
        //getBotonLogin().waitUntilVisible();
        getBotonLogin().click();
        getIngresarNombre().waitUntilPresent();
        enter(hu6Datos.getUsuario()).into(getIngresarNombre());
        enter(hu6Datos.getContrasena()).into(getIngresaContrasena());
        getIngresarCuenta().click();
    }

    public void hacerclicEnMyAccount(){
        getBotonMyAccount().waitUntilPresent();
        getBotonMyAccount().click();
    }
    public  void seleccionarMyAccont(){
        getMyAccount().click();

    }
    public void validarInformacionCuenta(Hu6Datos hu6Datos){
         getNombreUsuario().waitUntilPresent();
        getPais().waitUntilPresent();
        getNumeroTelefono().waitUntilPresent();
        MatcherAssert.assertThat("nombrey apellido son iguales",
                getNombreUsuario().getText(), Matchers.equalTo(hu6Datos.getNombreApellido()));

      MatcherAssert.assertThat("el nombre del pais es igual"
                ,getPaisUsuario().getText(),Matchers.equalTo(hu6Datos.getPais()));
      MatcherAssert.assertThat("el nuermo de telefono esta presente",
                getNumeroTelefono().getText(),Matchers.equalTo(hu6Datos.getNumerotelefono()));

    }

    public void validadInformacionEnvio(Hu6Datos hu6Datos){
        getNombreEnvio().waitUntilPresent();
        getPaisEnvio().waitUntilPresent();
        getNumeroTelefonoEnvio().waitUntilPresent();
        MatcherAssert.assertThat("nombrey apellido son iguales para el envio",
                getNombreEnvio().getText(), Matchers.equalTo(hu6Datos.getNombreApellido()));

        MatcherAssert.assertThat("el nombre del pais es igual para el envio"
                ,getPaisEnvio().getText(),Matchers.equalTo(hu6Datos.getPais()));
        MatcherAssert.assertThat("el nuermo de telefono esta presente en la seccion envio",
                getNumeroTelefonoEnvio().getText(),Matchers.equalTo(hu6Datos.getNumerotelefono()));

}



}