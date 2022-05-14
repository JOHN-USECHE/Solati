package co.com.proyectosolati.stepdefinitons;


import co.com.proyectosolati.model.SoliData;
import co.com.proyectosolati.tasks.OpenSo;
import co.com.proyectosolati.tasks.Solatiadd;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
public class solatiStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^John quiere registrar sus datos en la pagina solati$")
    public void johnQuiereRegistrarSusDatosEnLaPaginaSolati() {
        OnStage.theActorCalled("John").wasAbleTo(OpenSo.thepage());

    }

    @When("^El usuario ingresa los datos requeridos por el sistema$")
    public void elUsuarioIngresaLosDatosRequeridosPorElSistema(List<SoliData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(Solatiadd.thePage(data));
    }

    @Then("^El registro estara completo cuando vea el boton guardar datos\\.$")
    public void elRegistroEstaraCompletoCuandoVeaElBotonGuardarDatos() {


    }
}
