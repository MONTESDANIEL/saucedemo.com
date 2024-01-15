package saucedemo.com.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.Transpose;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import saucedemo.com.enums.TxtBtn;
import saucedemo.com.enums.TxtProduct;
import saucedemo.com.model.DataSaucedemo;
import saucedemo.com.questions.QuestionBtn;
import saucedemo.com.questions.QuestionProducto;
import saucedemo.com.tasks.Login;
import saucedemo.com.tasks.ProductSelection;
import java.util.Map;
import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class StepdefinitionsSucedemo {
    @Before
    public void prepararEscenario() {
        setTheStage(new OnlineCast());
        theActorCalled("Daniel");
    }
    @Given("El usuario accede al sitio web saucedemo.com")
    public void elUsuarioAccedeAlSitioWebSaucedemoCom() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.saucedemo.com/"));
    }
    @When("Se realiza el login")
    public void seRealizaElLogin(DataSaucedemo datos) {
        theActorInTheSpotlight().attemptsTo(Login.elFormulario(datos));
    }
    @And("Se filtra, selecciona y agrega el producto al carrito")
    public void seFiltraSeleccionaYAgregaElProductoAlCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(ProductSelection.productSelection());
    }
    @Then("Se verifica la realizacion del proceso")
    public void seVerificaLaRealizacionDelProceso() {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(QuestionBtn.value(), equalTo(TxtBtn.TXT_BTN.getMesaje())),
                GivenWhenThen.seeThat(QuestionProducto.value(), equalTo(TxtProduct.TXT_PRODUCT.getMesaje()))
        );
    }

    @DataTableType
    public DataSaucedemo datosSaucedemo(@Transpose Map<String, String> entry){
        return new DataSaucedemo(
                entry.get("struser"),
                entry.get("strpassw")
        );

    }
}
