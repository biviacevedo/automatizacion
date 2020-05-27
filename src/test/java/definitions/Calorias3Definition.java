package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.CaloriasSteps;

public class Calorias3Definition {

    @Steps
    CaloriasSteps caloriasSteps;

    @Given("^se encuentra en la pagina de calcular calorias$")
    public void seEncuentraEnLaPaginaDeCalcularCalorias() {
        caloriasSteps.abrirpagina();

    }

    @When("^se escoge una \"([^\"]*)\", se ingresa el (\\d+), (\\d+)$")
    public void seEscogeUnaSeIngresaEl(String actividad, String peso, String tiempo) {
        caloriasSteps.diligenciardatos(actividad,peso,tiempo);

    }

    @Then("^se obtienen las calorias \"([^\"]*)\", se guarda la \"([^\"]*)\"$")
    public void seObtienenLasCaloriasSeGuardaLa(String resultado, String evidencia) {
        caloriasSteps.obtenerresultado(resultado,evidencia);

    }


}
