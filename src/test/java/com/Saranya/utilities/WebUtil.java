package com.Saranya.utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class WebUtil {

public static WebDriver driver;

public static WebDriver initWebDriver() throws IOException {

    driver = new ChromeDriver();
    driver.get(ConfigUtil.getPropValue("base_url"));
    driver.manage().window().maximize();
    return driver;
}

public static byte[] takeScreenShot(){
    TakesScreenshot takesScreenshot = ((TakesScreenshot)driver );
    return takesScreenshot.getScreenshotAs(OutputType.BYTES);
}

public static void closeDriver(){
    driver.close();
    driver.quit();
}
}
