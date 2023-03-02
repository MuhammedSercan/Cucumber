package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    //Hooks her bir Scenario dan ya da Scenario Outline dan önce veya sonra çalışmasını istediğimiz metodlar içerir.
    //@Before ve @After metotlarını içerir
    //Raporlama işlemi ekran görüntüsüyle birlikte hooks yardımıyla yapılır.

    @Before
    public void setUpScenarios(){
        System.out.println("Before Metotu");
    }

    @After
    public void tearDownScenarios(Scenario scenario){
        System.out.println("After Metotu");
        //Eger bir Scenario FAIL edeerse, ekran görüntüsünü al ve rapora ekle
        if(scenario.isFailed()){
            final byte[] failedScreenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            //ekran görüntüsü,          dosya tipi,          ekran görüntüsünün ismi
            scenario.attach(failedScreenshot,"image/png","failed_scenario"+scenario.getName());
            Driver.closeDriver();
        }


    }



}
