package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserMgtPage extends BasePage {
    WebDriver driver;//initialize WebDriver

    public UserMgtPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
   @FindBy(id="login-btn")
   public WebElement loginBtn;

   @FindBy(id="access-db-btn")
   public WebElement accessDbBtn;

   public String[] registrationFormFields = {"Firstname", "Lastname", "Email", "Phonenumber", "Select-role"};

   public WebElement findById(String id){
   return driver.findElement(By.id(id));
   }

    @FindBy(xpath = "//table[@id='list-table']/tbody/tr")
    public WebElement tableRow;


}
