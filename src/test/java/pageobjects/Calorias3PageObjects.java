package pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;


@DefaultUrl("https://es.calcuworld.com/deporte-y-ejercicio/calculadora-de-calorias-quemadas/")

public class Calorias3PageObjects extends PageObject {
    public void diligenciardatos(String actividad, String peso, String tiempo) {
        WebElementFacade eleccion = find(By.name("exercise"));
        eleccion.selectByValue(actividad);

        WebElementFacade pesos = find(By.xpath("//*[@id=\"appendedInput\"]"));
        pesos.type(peso);

        WebElementFacade tiempos = find(By.name("minutes"));
        tiempos.type(tiempo);

        WebElement btn = find(By.xpath("//*[@id=\"post-621\"]/div/form/div[2]/span/a"));
        btn.click();

        JavascriptExecutor jse = (JavascriptExecutor)this.getDriver();
        jse.executeScript("window.scrollBy(0,250)");

    }

    public void obtenerresultado(String resultado, String evidencia) {

        WebElement result = find(By.id("calories"));
        String calorias = result.getText();

        calorias.contentEquals(resultado);

        TakesScreenshot captura = (TakesScreenshot)this.getDriver();
        File archivo = captura.getScreenshotAs(OutputType.FILE);
        File desti = new File("C:\\Users\\bacevedo.INTERNO\\Desktop/" + evidencia +".png");
        try {
            FileUtils.copyFile(archivo,desti);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
