package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    WebDriver driver;//declared WebDriver

    public HomePage(WebDriver driver){//constructor for declaring webDriver
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);//takes all FindBy initialized webElements
    }
//    @FindBy(className = "product_label")
//    public WebElement headerText;

//    @FindBy(xpath ="//a[text()='User-Mgt']")
//    public WebElement userMgtBtn;
//
//    method clickNavBtn is below instead of it:


    public String[] navButtons = {"Home", "Inputs", "Selectors", "Select-class", "Alert", "Pop-Up", "Multiple-window",
            "Tables", "Calendar", "iFrames", "Action-class","JS-Executor","Synchronization", "Files", "User-Mgt"};

    public void clickNavBtn(String buttonName){
    click(driver.findElement(By.linkText(buttonName)));
}
}

