package com.Saranya.pages;

import com.Saranya.core.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalculatorPage extends TestContext {


    public void iAmOnCalculatorPage() {


    }


    public void iEnterNumber(int number) {
        driver.findElement(By.xpath("//span[@onclick='r("+number+")']")).click();
    }


    public void iClickOnOperator(String operator) {
        driver.findElement(By.xpath("//span[@onclick=\"r('"+operator+"')\"]")).click();
    }



    public String iVerifyTheResultAs(int expectedResult) {

        String actualResult = driver.findElement(By.id("sciOutPut")).getText().trim();
        return actualResult;
    }

}
