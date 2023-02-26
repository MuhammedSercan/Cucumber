package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablesPage;
import utilities.Driver;

public class DataTablesStepDefinitions {

    DataTablesPage dataTablesPage = new DataTablesPage();
    @Given("kullanici {string} gider")
    public void kullanici_gider(String string) {
        Driver.getDriver().get(string);
    }

    @When("kullanıcı new butonuna tıklar")
    public void kullanıcı_new_butonuna_tıklar() {
        //dataTablesPage.newButon.click();
        Driver.waitAndClick(dataTablesPage.newButon,10);
        //dinamik olarak 10 saniyeye kadar elementin tıklanması için bekler.
    }
    @When("kullanıcı firstname {string} girer")
    public void kullanıcı_firstname_girer(String string) {
        //dataTablesPage.firstName.sendKeys(string);
        Driver.waitAndSendText(dataTablesPage.firstName,string,10);
        //firstName e yazı yazabilmek için 10 saniyeye kadar dinamik olarak bekler
    }
    @When("kullanıcı lastname {string} girer")
    public void kullanıcı_lastname_girer(String string) {
        dataTablesPage.lastName.sendKeys(string);
    }
    @When("kullanıcı positions {string} girer")
    public void kullanıcı_positions_girer(String string) {
        dataTablesPage.position.sendKeys(string);
    }
    @When("kullanıcı office {string} girer")
    public void kullanıcı_office_girer(String string) {
        dataTablesPage.office.sendKeys(string);
    }
    @When("kullanıcı extension {string} girer")
    public void kullanıcı_extension_girer(String string) {
        dataTablesPage.extension.sendKeys(string);
    }
    @When("kullanıcı start_date {string} girer")
    public void kullanıcı_start_date_girer(String string) {
        dataTablesPage.startDate.sendKeys(string);
    }
    @When("kullanıcı salary {string} girer")
    public void kullanıcı_salary_girer(String string) {
        dataTablesPage.salary.sendKeys(string);
    }
    @When("kullanıcı create butonuna basar")
    public void kullanıcı_create_butonuna_basar() {
        dataTablesPage.create.click();
    }

    @When("kullanıcı firstname ile {string} arar")
    public void kullanıcı_firstname_ile_arar(String string) {
        dataTablesPage.search.sendKeys(string);
    }
    @Then("firstname {string} in oluştuğunu test et")
    public void firstname_in_oluştuğunu_test_et(String string) {
        Driver.wait(2);
        Assert.assertTrue(Driver.waitAndGetText(dataTablesPage.name,5).contains(string));
        //Assert.assertTrue(dataTablesPage.name.getText().contains(string));
    }


}
