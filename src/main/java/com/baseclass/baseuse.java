package com.baseclass;

import com.baseclass.utilities.propertiesutils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class baseuse {
    public static WebDriver driver;
    public static void initmethod(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        Properties prop= propertiesutils.loadalltheproperties();
        String url= prop.getProperty("url");
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
    }
    public static void finalmethod(){
        driver.close();
    }
}