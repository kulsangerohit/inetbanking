package com.TestCase;

import com.Pages.AddNewCustomer;
import com.Pages.LoginPage;

import org.testng.Assert;
import org.testng.annotations.Test;



public class CustomerTest extends TestBase {
    @Test(priority = 1)
    public void addNewCustomer() throws InterruptedException {
        driver.get(baseURL);
        LoginPage login = new LoginPage(driver);
        login.setUserName(username);
        logger.info("username entered successfully");
        login.setPassword(password);
        logger.info("Password entered successfully");
        login.clickSubmit();
        logger.info("submit successfully");
        //  Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void createNewcustomer() {
        AddNewCustomer ac = new AddNewCustomer(driver);
        ac.clickCustomer();
        ac.SetcustomerName("raja");
        ac.clickRadio();
        ac.dateOfBirth("12", "25", "1995");
        ac.customerAddress("20 Bhadunk");
        ac.customerCity("pune");
        ac.customerState("Maharastra");
        ac.customerPin("123654");
        ac.customerTelephone("147852369");
        ac.customerEmail("raja222@gmail.com");
        ac.customerPassword("1234569");
        ac.customerSubmit();

        String AcutalTitle = driver.getTitle();
        Assert.assertEquals(AcutalTitle, "");


    }
    @Test(priority = 3)
    public void verifyCustomerCreation(){
        AddNewCustomer ac = new AddNewCustomer(driver);
        Assert.assertEquals(ac.GetRegisterMessage(),"Customer Registered Successfully!!!");
    }
}















