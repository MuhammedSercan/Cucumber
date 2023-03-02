package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RentalOdevPage;
import utilities.Driver;

public class RentalOdevStepDefinitons {

    RentalOdevPage rentalOdevPage = new RentalOdevPage();


    @Given("kullanıcı {string} gider")
    public void kullanıcı_gider(String string) {
        Driver.getDriver().get(string);
    }
    @When("kullanıcı login sayfasına gider")
    public void kullanıcı_login_sayfasına_gider() {
        rentalOdevPage.login.click();
    }
    @When("kullanıcı email {string} girer")
    public void kullanıcı_email_girer(String string) {
        rentalOdevPage.email.sendKeys(string);
    }
    @When("kullanıcı sifre {string} girer")
    public void kullanıcı_sifre_girer(String string) {
        rentalOdevPage.sifre.sendKeys(string);
    }
    @When("kullanıcı login butonuna tıklar")
    public void kullanıcı_login_butonuna_tıklar() {
        rentalOdevPage.loginButton.click();
    }








}
