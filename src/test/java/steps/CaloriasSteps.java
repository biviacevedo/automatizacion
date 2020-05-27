package steps;

import net.thucydides.core.annotations.Step;
import pageobjects.Calorias3PageObjects;


public class CaloriasSteps {

    Calorias3PageObjects calorias3PageObjects;
    @Step
    public void abrirpagina() {
        calorias3PageObjects.open();
    }

    @Step
    public void diligenciardatos(String actividad, String peso, String tiempo) {
        calorias3PageObjects.diligenciardatos(actividad,peso,tiempo);

    }

    @Step
    public void obtenerresultado(String resultado, String evidencia) {
        calorias3PageObjects.obtenerresultado(resultado,evidencia);
    }
}


