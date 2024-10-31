package com.juaracoding.soalautomation.impl;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 31/10/2024 0:05
@Last Modified 31/10/2024 0:05
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
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.NoAlertPresentException;

public class SignUpTesting {
    public WebDriver driver;
    private static ExtentTest extentTest;
    private CartPage cartPage;
    private CheckoutPage checkoutPage;
    private HomePage homePage;
    private ItemPage itemPage;
    private LoginPage loginPage;
    private SignUpPage signUpPage;

    public SignUpTesting(){
        this.driver = LoginOutlineHooks.driver;
        homePage = new HomePage(driver);
        signUpPage = new SignUpPage(driver);
        extentTest = LoginOutlineHooks.extentTest;
    }

    @When("Test001 Membuka Halaman Website")
    public void test001_membuka_halaman_login(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        this.driver.get(Constants.URL_LOGIN);
        extentTest.log(LogStatus.PASS, "Test001 Membuka Website");
    }
    @And("Test001 Click Button SignUp")
    public void test001_click_signup(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        homePage.setBtnsignup();
        extentTest.log(LogStatus.PASS, "Test001 Click Button SignUp");
    }
    @And("Test001 Validasi SignUp")
    public void test001_validasi_signup(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String SignUpValidation = signUpPage.SignUpValidation();
        Assert.assertEquals(SignUpValidation,"Sign up");
    }
    @And("^Test001 Input TextField (.*) Yang Valid One")
    public void test001_input_textfield_username_yang_valid_one(String username){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        signUpPage.setTxtUsername(username);
        extentTest.log(LogStatus.PASS, "Test001 Input TextField <username> Yang Valid One");
    }
    @And("^Test001 Input TextField (.*) Yang Valid Two")
    public void test001_input_textfield_password_yang_valid_one(String password){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        signUpPage.setTxtPassword(password);
        extentTest.log(LogStatus.PASS, "Test001 Input TextField <password> Yang Valid One");
    }
    @And("Test001 Validasi Form Sign UP")
    public void test001_validasi_form_sign_up(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String FormValidation = signUpPage.FormValidation();
        Assert.assertEquals(FormValidation,"");
    }
    @And("Test001 Click Button SignUp Form")
    public void test001_click_button_signup(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        signUpPage.BtnsignUp();
        extentTest.log(LogStatus.PASS, "Test001 Click Button SignUp");
    }
    @And("Test001 Pop Out Sign Up Berhasil")
    public void test001_pop_out_sign_up_berhasil(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        driver.switchTo().alert().accept();
    }
    @Then("Test001 Validasi website")
    public void test001_validasi_website(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String HomePageValidation = homePage.homePageValidation();
        Assert.assertEquals(HomePageValidation,"\n" +
                "      PRODUCT STORE");
    }
}
