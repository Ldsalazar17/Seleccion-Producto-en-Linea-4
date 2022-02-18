package indra.steps_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import indra.actions.AdvantageActions;
import indra.models.ProductoLineaDatos;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class ProductoLineaSteps {

    @Managed
    WebDriver driver;
    AdvantageActions advantageActions = new AdvantageActions(driver);

    @Given("^el usuario se encuentre en la pagina principal$")
    public void elUsuarioSeEncuentreEnLaPaginaPrincipal() {
        advantageActions.open();

    }


    @When("^que el usuario se encuentra logueado$")
    public void queElUsuarioSeEncuentraLogueado(List<AdvantageActions> advantageActions) {
        advantageActions.open();
        advantageActions.usuarioIniciaSesion(advantageActions.get(0));
    }

    @When("^el usuario hace click en my Account$")
    public void elUsuarioHaceClickEsMyAccount() {
        advantageActions.hacerclicEnMyAccount();
        advantageActions.seleccionarMyAccont();
    }

    @Then("^deberia poder ver la informacion de la cuenta$")
    public void deberiaPoderVerLaInformacionDeLaCuenta(List<AdvantageActions> advantageActions) {
        advantageActions.validarInformacionCuenta(productoLineaDatosList.get(0));
    }


}
