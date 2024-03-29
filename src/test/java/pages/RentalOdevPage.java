package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RentalOdevPage {

    public RentalOdevPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='btn btn-primary btn-sm']")
    public WebElement login;

    @FindBy(xpath = "//*[@id='formBasicEmail']")
    public WebElement email;

    @FindBy(xpath = "//*[@id='formBasicPassword']")
    public WebElement sifre;


    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement loginButton;

    @FindBy(xpath = "(//*[@class='nav-link'])[1]")
    public WebElement home;





}
