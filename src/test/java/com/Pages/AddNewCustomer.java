package com.Pages;

import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.rmi.registry.Registry;

public class AddNewCustomer {

    WebDriver driver;
    public AddNewCustomer(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[2]/a")
    WebElement customerLink;

    @FindBy(xpath = "//input[@name='name']")
    WebElement custName;

    @FindBy(name ="rad1")
    WebElement radioChk;

    @FindBy(name ="dob")
    WebElement custDob;

    @FindBy(name ="addr")
    WebElement custAddr;

    @FindBy(name = "city")
    WebElement custCity;

    @FindBy(name ="state")
    WebElement custState;

    @FindBy(name ="pinno")
    WebElement custPino;

    @FindBy(name ="telephoneno")
    WebElement custTelephoneo;

    @FindBy(name ="emailid")
    WebElement custEmailid;

    @FindBy(name ="password")
    WebElement custPassword;

    @FindBy(name ="sub")
    WebElement custSubmit;

    @FindBy(xpath = "//p[contains(text(),'Customer Registered Successfully!!!')]")
    WebElement RegsiterMessage;

    public void clickCustomer()
    {
        customerLink.click();
    }
    public void SetcustomerName(String cname)
    {
        custName.sendKeys(cname);
    }
    public void clickRadio()
    {
        radioChk.click();
    }
    public void dateOfBirth(String mm,String dd,String yy)
    {
      custDob.sendKeys(mm);
      custDob.sendKeys(dd);
      custDob.sendKeys(yy);
    }
    public void customerAddress(String cadd)
    {
        custAddr.sendKeys(cadd);
    }
    public void customerCity(String ccity)
    {
        custCity.sendKeys(ccity);
    }
    public void customerState(String cstate)
    {
        custState.sendKeys(cstate);
    }
    public void customerPin(String cpin)
    {
        custPino.sendKeys(cpin);
    }
    public void customerTelephone(String ctelephone)
    {
        custTelephoneo.sendKeys(ctelephone);
    }

    public String Randomstr(){

        RandomStringUtils.randomAlphabetic(8);
        return Randomstr();
    }
    public void customerEmail(String cemail)
    {
        custEmailid.sendKeys(new RandomString() +"@gmail.com");
    }
    public void customerPassword(String cpassword)
    {
        custPassword.sendKeys(cpassword);
    }
    public void customerSubmit()
    {
        custSubmit.click();
    }

    public String GetRegisterMessage(){
        return RegsiterMessage.getText();
    }
}
