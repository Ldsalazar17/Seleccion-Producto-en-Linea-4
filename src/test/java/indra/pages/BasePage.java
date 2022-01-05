package indra.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


    @DefaultUrl("https://advantageonlineshopping.com/#/")
    public class BasePage extends PageObject {
        public BasePage(WebDriver driver) {
            super(driver);
            }

        @FindBy(xpath = "//a[@id='hrefUserIcon']")
        private WebElementFacade botonLogin;

        @FindBy(xpath = "//input[@name='username']")
        private WebElementFacade ingresarNombre;

        @FindBy(xpath = "//input[@name='password']")
        private WebElementFacade ingresaContrasena;

       // @FindBy(xpath = "//input[@name='remember_me']")
        //private WebElementFacade recordarUsuario;

        @FindBy(xpath = "//button[@id='sign_in_btnundefined']")
        private WebElementFacade IngresarCuenta;

        @FindBy(xpath = "//span[contains(@class,'hi-user containMiniTitle ng-binding')]")
        private WebElementFacade botonMyAccount;

        @FindBy(xpath = "//label[@class='option roboto-medium ng-scope'][contains(.,'My account')]")
        private WebElementFacade MyAccount;

        @FindBy(xpath = "//label[@class='option roboto-medium ng-scope'][contains(.,'My account')]")
        private WebElementFacade myAccountUsuario;

        @FindBy(xpath = "(//label[@class='ng-binding'][contains(.,'Prueba Daniela')])[1]")
        private WebElementFacade nombreUsuario;

        @FindBy(xpath = "(//label[@class='ng-binding'][contains(.,'United States')])[1]")
        private WebElementFacade paisUsuario;

        @FindBy(xpath = "(//label[@class='ng-binding'][contains(.,'3003333333')])[1]")
        private WebElementFacade telefonoUsuario;

        public WebElementFacade getNombreUsuario() {
            return nombreUsuario;
        }

        public WebElementFacade getPaisUsuario() {
            return paisUsuario;
        }

        public WebElementFacade getTelefonoUsuario() {
            return telefonoUsuario;
        }

        @FindBy(xpath = "//a[@href='#/accountDetails']")
        private WebElementFacade editarUsuario;

        @FindBy(xpath = "//a[@class='link ng-scope']")
        private WebElementFacade cambiarPassword;

        @FindBy(xpath = "//input[@name='old_passwordAccountDetails']")
        private WebElementFacade editarContrasenaActual;

        @FindBy(xpath = "//input[@name='new_passwordAccountDetails']")
        private WebElementFacade editarContrasenaNueva;

        @FindBy(xpath = "//input[@name='confirm_new_passwordAccountDetails']")
        private WebElementFacade ConfirmarContrasenaNueva;

        @FindBy(xpath = "//input[@name='addressAccountDetails']")
        private WebElementFacade Direccion;

        @FindBy(xpath = "//button[@id='save_btnundefined']")
        private WebElementFacade Guardar;

        @FindBy(xpath = "(//label[contains(@class,'ng-binding')])[6]")
        private WebElementFacade pais;

        @FindBy(xpath = "(//label[contains(@class,'ng-binding')])[9]")
        private WebElementFacade numeroTelefono;

        @FindBy(xpath = "(//label[contains(@class,'ng-binding')])[17]")
        private WebElementFacade nombreEnvio;

        @FindBy(xpath = "(//label[contains(@class,'ng-binding')])[20]")
        private WebElementFacade paisEnvio;

        @FindBy(xpath = "(//label[contains(@class,'ng-binding')])[23]")
        private WebElementFacade numeroTelefonoEnvio;

        public WebElementFacade getNombreEnvio() {
            return nombreEnvio;
        }

        public WebElementFacade getPaisEnvio() {
            return paisEnvio;
        }

        public WebElementFacade getNumeroTelefonoEnvio() {
            return numeroTelefonoEnvio;
        }

        public WebElementFacade getPais() {
            return pais;
        }

        public WebElementFacade getNumeroTelefono() {
            return numeroTelefono;
        }

        public WebElementFacade getDireccion() {
            return Direccion;
        }

        public WebElementFacade getBotonLogin() {
            return botonLogin;
        }

        public WebElementFacade getIngresarNombre() {
            return ingresarNombre;
        }

        public WebElementFacade getIngresaContrasena() {
            return ingresaContrasena;
        }

        /**public WebElementFacade getRecordarUsuario() {
            return recordarUsuario;
        }*/

        public WebElementFacade getIngresarCuenta() {
            return IngresarCuenta;
        }

        public WebElementFacade getBotonMyAccount() {
            return botonMyAccount;
        }

        public WebElementFacade getMyAccount() {
            return MyAccount;
        }

        public WebElementFacade getMyAccountUsuario() {
            return myAccountUsuario;
        }

        public WebElementFacade getEditarUsuario() {
            return editarUsuario;
        }

        public WebElementFacade getCambiarPassword() {
            return cambiarPassword;
        }

        public WebElementFacade getEditarContrasenaActual() {
            return editarContrasenaActual;
        }

        public WebElementFacade getEditarContrasenaNueva() {
            return editarContrasenaNueva;
        }

        public WebElementFacade getConfirmarContrasenaNueva() {
            return ConfirmarContrasenaNueva;
        }

        public WebElementFacade getGuardar() {
            return Guardar;
        }
    }
