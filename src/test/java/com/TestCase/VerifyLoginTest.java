package com.TestCase;

import com.Pages.AddNewCustomer;
import com.Pages.LoginPage;

import org.testng.annotations.Test;

public class VerifyLoginTest extends TestBase
{
    @Test
    public void loginTest(){

        driver.get(baseURL);
        LoginPage login = new LoginPage(driver);
        login.setUserName(username);
        logger.info("username entered successfully");
        login.setPassword(password);
        logger.info("Password entered successfully");
        login.clickSubmit();
        logger.info("submit successfully");


       // AddNewCustomer add = new AddNewCustomer(driver);
        //add.clickNewCustomer();


    }


}
