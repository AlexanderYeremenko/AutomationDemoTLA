package tests;

import base.BaseTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.HomePage;
import pages.UserMgtPage;

import java.lang.reflect.Method;


public class UserMgtPageTest extends BaseTest {
//    HomePage homePage;//declared 3 objects
    UserMgtPage userMgtPage;
    CommonPage commonPage;


    @BeforeMethod(alwaysRun = true)
    public void setUp(Method method, ITestResult result) {
        super.setUp(method, result);//called setUp method from BaseTest which will call from parent by using SUPER
//        homePage = new HomePage(getDriver());
        userMgtPage = new UserMgtPage(getDriver());// initializing three objects
        commonPage = new CommonPage(getDriver());
        commonPage.clickNavBtn("User-Mgt");

    }
    @Test(description = "Verifying title of User Mgnt page")
    public void verifyUsMgTitle(){
//    homePage.clickNavBtn("User-Mgt");
    Assert.assertEquals(getDriver().getTitle(), "Register New User");
    screenShot.takeScreenshotAndLog();
    }

    @Test(description= "Validating <Login> and <Access> Btns")
    public void verifyLoginAccessDB_buttons(){
//    homePage.clickNavBtn("User-Mgt"); went to home page
     Assert.assertTrue(userMgtPage.accessDbBtn.isDisplayed());
     Assert.assertTrue(userMgtPage.loginBtn.isDisplayed());
     screenShot.takeScreenshotAndLog();
    }
@Test(description = "Testing RegistrationForm fields")
    public void verifyRgtForm(){
        for(String field:userMgtPage.registrationFormFields){
            Assert.assertTrue(commonPage.findById(field).isDisplayed());
            extentTest.log(LogStatus.PASS, commonPage.findById(field).getAttribute("name")+ " - was displayed");
        }
        screenShot.takeScreenshotAndLog();
}
@Test(description="Verifying table has no data initially", expectedExceptions = NoSuchElementException.class)
    public void verifyTableContentZero(){

        extentTest.log(LogStatus.PASS,"Table was empty");
        screenShot.takeScreenshotAndLog();
        userMgtPage.tableRow.isDisplayed();

}
}
