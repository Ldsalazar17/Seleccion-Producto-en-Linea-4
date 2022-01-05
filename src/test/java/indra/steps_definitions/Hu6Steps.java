package indra.steps_definitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import indra.actions.Hu6Actions;
import indra.models.Hu6Datos;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class Hu6Steps {

    @Managed
    WebDriver driver;
    Hu6Actions hu6Actions = new Hu6Actions(driver);

    @Given("^que el usuario se encuentra logueado$")
    public void queElUsuarioSeEncuentraLogueado(List<Hu6Datos> hu6DatosList) {
        hu6Actions.open();
        hu6Actions.usuarioIniciaSesion(hu6DatosList.get(0));
    }

    @When("^el usuario hace click en my Account$")
    public void elUsuarioHaceClickEsMyAccount() {
        hu6Actions.hacerclicEnMyAccount();
        hu6Actions.seleccionarMyAccont();
    }

    @Then("^deberia poder ver la informacion de la cuenta$")
    public void deberiaPoderVerLaInformacionDeLaCuenta(List<Hu6Datos> hu6DatosList) {
        hu6Actions.validarInformacionCuenta(hu6DatosList.get(0));
    }

    @Then("^deberia poder ver la informacion del detalle del envio$")
    public void deberiaPoderVerLaInformacionDelDetalleDelEnvio(List<Hu6Datos> hu6Datos) {
        hu6Actions.validadInformacionEnvio(hu6Datos.get(0));
    }



    @Then("^deberia poder ver un boton de editar la informacion$")
    public void deberiaPoderVerUnBotonDeEditarLaInformacion() {

    }

    @Then("^deberia poder editar la informacion$")
    public void deberiaPoderEditarLaInformacion() {
    }




}
