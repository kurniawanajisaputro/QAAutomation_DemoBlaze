package com.juaracoding.soalautomation.impl;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 31/10/2024 2:53
@Last Modified 31/10/2024 2:53
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
import io.cucumber.java.en_scouse.An;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import static com.juaracoding.soalautomation.util.GlobalFunction.delay;

public class CheckOutTesting {
    public WebDriver driver;
    private static ExtentTest extentTest;
    private CartPage cartPage;
    private CheckoutPage checkoutPage;
    private HomePage homePage;
    private ItemPage itemPage;
    private LoginPage loginPage;
    private SignUpPage signUpPage;

    public CheckOutTesting(){
        this.driver = LoginOutlineHooks.driver;
        homePage = new HomePage(driver);
        checkoutPage = new CheckoutPage(driver);
        extentTest = LoginOutlineHooks.extentTest;
    }

    @When("Test007 Validasi CheckOut Page")
    public void test007_validasi_checkout_page(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String CheckOutPageValidation = checkoutPage.CheckOutPageValidation();
        Assert.assertEquals(CheckOutPageValidation,"Place order");
    }
    @And("^Test007 Input TextField (.*) Yang Valid One")
    public void test007_input_textfield_username_yang_valid_one(String name){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        checkoutPage.SetTxtinputName(name);
        extentTest.log(LogStatus.PASS, "Test001 Input TextField <username> Yang Valid One");
    }
    @And("^Test007 Input TextField (.*) Yang Valid Two")
    public void test007_input_textfield_password_yang_valid_two(String country){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        checkoutPage.SetTxtinputCountry(country);
        extentTest.log(LogStatus.PASS, "Test007 Input TextField <password> Yang Valid One");
    }
    @And("^Test007 Input TextField (.*) Yang Valid Three")
    public void test007_input_textfield_password_yang_valid_three(String city){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        checkoutPage.SetTxtinputCity(city);
        extentTest.log(LogStatus.PASS, "Test007 Input TextField <city> Yang Valid One");
    }
    @And("^Test007 Input TextField (.*) Yang Valid Four")
    public void test007_input_textfield_password_yang_valid_four(String creditcard){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        checkoutPage.SetTxtinputCard(creditcard);
        extentTest.log(LogStatus.PASS, "Test007 Input TextField <creditcard> Yang Valid One");
    }
    @And("^Test007 Input TextField (.*) Yang Valid Five")
    public void test007_input_textfield_password_yang_valid_five(String month){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        checkoutPage.SetTxtinputMonth(month);
        extentTest.log(LogStatus.PASS, "Test007 Input TextField <creditcard> Yang Valid One");
    }
    @And("^Test007 Input TextField (.*) Yang Valid Six")
    public void test007_input_textfield_password_yang_valid_six(String year){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        checkoutPage.SetTxtinputYear(year);
        extentTest.log(LogStatus.PASS, "Test007 Input TextField <creditcard> Yang Valid One");
    }
    @And("Test007 Click Button purchase")
    public void test007_click_button_purchase(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        checkoutPage.SetBtnPurchase();
        extentTest.log(LogStatus.PASS, "Test007 Click Button Purchase");
    }
    @And("Test007 Klik Ok Pop Up")
    public void test007_klik_ok_pop_up() {
        delay(Constants.TIMEOUT_DELAY);
        delay(3);
        driver.switchTo().alert().accept();
    }
    @And("Test007 Validasi website")
    public void test007_validasi_website(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String HomePageValidation = homePage.homePageValidation();
        Assert.assertEquals(HomePageValidation,"PRODUCT STORE");
    }
    @Then("Test007 Click Button Log Out")
    public void test007_click_button_log_out(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        homePage.setBtnLogOut();;
        extentTest.log(LogStatus.PASS, "Test007 Click Button Log Out");
    }
}
