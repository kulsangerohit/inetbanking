package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    //Driver Initialization
    WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //Webelement
   @FindBy(name ="uid")
    WebElement userId;

    @FindBy(name ="password")
    WebElement userPassword;

    @FindBy(name ="btnLogin")
    WebElement btnLogin;


    //Action method

    public void setUserName(String uname)
    {
        userId.sendKeys(uname);

    }
    public void setPassword(String pwd)
    {
        userPassword.sendKeys(pwd);
    }
    public void clickSubmit()
    {
        btnLogin.click();
    }
}
