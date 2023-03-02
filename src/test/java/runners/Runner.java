package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/features",//features folder path
        glue = "stepdefinitions",//stepdefinitions path
        tags = "@rental_odev",
        dryRun = false,//test case çalıştırılmadan false yapılmalı; java kodu yazılmamış step var mı diye hızlıca tarar.
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        monochrome=true
)

public class Runner {
}
    //Bu sinif Test caseleri RUN etmek icin kullanilir
    //Ve konfigurasyonlar icin kullanilir
    //Runner class, features file lar ile stepdefinitions ları birbirine bağlar
