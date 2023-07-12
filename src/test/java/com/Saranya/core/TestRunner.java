package com.Saranya.core;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = {"src/test/java/com/Saranya/features"},glue = "steps",plugin ="json:test-output/Cucumber.json" )
public class TestRunner extends AbstractTestNGCucumberTests {
    @DataProvider
    @Override
    public Object[][] scenarios()
    {
        return super.scenarios();
    }
}
