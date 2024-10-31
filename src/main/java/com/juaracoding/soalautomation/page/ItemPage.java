package com.juaracoding.soalautomation.page;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 30/10/2024 19:01
@Last Modified 30/10/2024 19:01
Version 1.0
*/
import com.juaracoding.soalautomation.connection.Constants;
import com.juaracoding.soalautomation.connection.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class ItemPage {
    private WebDriver driver;

    @FindBy(xpath = "//h2[@class='name']")
    private WebElement logoCartPage;

    @FindBy(xpath = "//a[@class='btn btn-success btn-lg']")
    private WebElement btnAddtoCart;
    @FindBy(xpath = "//li[@class='nav-item active']//a[@class='nav-link']")
    private WebElement btnHome;



    public ItemPage() {
        this.driver= DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    public ItemPage(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    public String ItemPageValidation(){
        return logoCartPage==null?"":logoCartPage.getText();
    }

    public void AddtoCart(){
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnAddtoCart)).click();
    }
    public void Home(){
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnHome)).click();
    }
}
