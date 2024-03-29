package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class GoogleStepDefinitions {

    GooglePage googlePage = new GooglePage();

    @Given("kullanici google gider")
    public void kullanici_google_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
    }

    @When("kullanici iphone için arama yapar")
    public void kullanici_iphone_için_arama_yapar() {
        googlePage.searchBox.sendKeys("iPhone", Keys.ENTER);
    }

    @Then("sonuclarda iphone oldugunu dogrular")
    public void sonuclarda_iphone_oldugunu_dogrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("iPhone"));
    }

    @Then("close the application")
    public void close_the_application() {
        Driver.closeDriver();
    }

    @When("kullanıcı tesla için arama yapar")
    public void kullanıcı_tesla_için_arama_yapar() {
        googlePage.searchBox.sendKeys("tesla",Keys.ENTER);
    }
    @Then("sonuçlarda tesla olduğunu doğrular")
    public void sonuçlarda_tesla_olduğunu_doğrular() {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("tesla"));
    }

    @When("kullanici {string} için arama yapar")
    public void kullanici_için_arama_yapar(String string) {
        googlePage.searchBox.sendKeys(string,Keys.ENTER);
    }

    @Then("sonuclarda {string} içerdiğini dogrular")
    public void sonuclarda_içerdiğini_dogrular(String string) {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(string));
    }






}
