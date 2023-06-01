package com.TestCase;

import com.uitilites.ReadConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;


public class TestBase {

    ReadConfig readconfig = new ReadConfig();
    public String baseURL = readconfig.getApplicationURL();
    public String username = readconfig.getUsername();
    public String password = readconfig.getPassword();
    public static WebDriver driver;

    Logger logger;

    @BeforeClass
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rohit_K\\OneDrive\\Desktop\\NetBanking\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        logger = LogManager.getLogger(TestBase.class);
        logger.info("chrome is sucessfully open");
    }


    @AfterClass
    public void teardown()
    {
       // driver.quit();
        logger.info("chrome terminated sucessfuly");
    }
}