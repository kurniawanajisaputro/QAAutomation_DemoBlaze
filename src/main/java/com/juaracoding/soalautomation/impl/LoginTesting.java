package com.juaracoding.soalautomation.impl;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 31/10/2024 2:52
@Last Modified 31/10/2024 2:52
Version 1.0
*/
import com.juaracoding.soalautomation.connection.Constants;
import com.juaracoding.soalautomation.page.SignUpPage;
import com.juaracoding.soalautomation.page.CartPage;
import com.juaracoding.soalautomation.page.CheckoutPage;
import com.juaracoding.soalautomation.page.LoginPage;
import com.juaracoding.soalautomation.page.ItemPage;
import com.juaracoding.soalautomation.page.HomePage;
import com.juaracoding.soalautomation.util.GlobalFunction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class LoginTesting {
    public WebDriver driver;
    private static ExtentTest extentTest;
    private CartPage cartPage;
    private CheckoutPage checkoutPage;
    private HomePage homePage;
    private ItemPage itemPage;
    private LoginPage loginPage;
    private SignUpPage signUpPage;
    public LoginTesting(){
        this.driver = LoginOutlineHooks.driver;
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        extentTest = LoginOutlineHooks.extentTest;
    }
    @When("Test002 Validasi website")
    public void test002_validasi_website(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String HomePageValidation = homePage.homePageValidation();
        Assert.assertEquals(HomePageValidation,"nava");
    }
    @And("Test002 Click Button Log In")
    public void test002_click_button_log_in(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        homePage.setBtnlogin();
        extentTest.log(LogStatus.PASS, "Test002 Click Button Log In");
    }
    @And("Test002 Validasi Log In")
    public void test002_validasi_log_in(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String LoginInValidation = loginPage.LoginInValidation();
        Assert.assertEquals(LoginInValidation,"Log In");
    }
    @And("^Test002 Input TextField (.*) Yang Valid One")
    public void test002_input_textfield_username_yang_valid_one(String username){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.setTxtUsername(username);
        extentTest.log(LogStatus.PASS, "Test002 Input TextField <username> Yang Valid One");
    }
    @And("^Test002 Input TextField (.*) Yang Valid Two")
    public void test002_input_textfield_password_yang_valid_one(String password){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.setTxtPassword(password);
        extentTest.log(LogStatus.PASS, "Test002 Input TextField <password> Yang Valid One");
    }
    @And("Test002 Click Button Login Form")
    public void test002_click_button_log_in_form(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.Btnlogin();
        extentTest.log(LogStatus.PASS, "Test002 Click Button Login Form");
    }
    @Then("Test003 Validasi website")
    public void test003_validasi_website(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String HomePageValidation = homePage.homePageValidation();
        Assert.assertEquals(HomePageValidation,"nava");
    }
}
