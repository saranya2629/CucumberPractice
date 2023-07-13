package com.Saranya.pages;

import com.Saranya.core.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FractionCalculatorPage extends TestContext {


    public void i_am_on_fraction_calculator_page() {
    }



    public void i_enter_and(String num1, String den1) {

        WebElement inp1 = driver.findElement(By.xpath("//input[@id=\"t1\"]"));
        inp1.clear();
        inp1.sendKeys(num1);
        WebElement inp2 = driver.findElement(By.xpath("//input[@id=\"b1\"]"));
        inp2.clear();
        inp2.sendKeys(den1);


    }


    public void i_also_enter_and(String num2, String den2) {
        WebElement inp1 = driver.findElement(By.xpath("//input[@id=\"t2\"]"));
        inp1.clear();
        inp1.sendKeys(num2);
        WebElement inp2 = driver.findElement(By.xpath("//input[@id=\"b2\"]"));
        inp2.clear();
        inp2.sendKeys(den2);
    }


    public void iSelectOperator(String operator) {
        WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"op\"]"));
        Select select = new Select(dropdown);
        select.selectByValue(operator);

    }


    public void iClickOnCalculateButton() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/table[1]/tbody/tr[4]/td/input[2]")).click();
    }



    public String i_verify_the_displayed() {
        System.out.println("verify");
        return driver.findElement(By.xpath("//*[@id=\"content\"]/p[2]")).getText();
    }


}
