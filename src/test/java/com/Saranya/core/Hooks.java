package com.Saranya.core;

import com.Saranya.utilities.WebUtil;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Hooks extends TestContext {

    @Before("@web")
    public void beforeScenario(Scenario scenario) throws IOException {
        driver = WebUtil.initWebDriver();
    }

    @After("@web")
    public void afterScenario(Scenario scenario)
    {
         WebUtil.closeDriver();
    }

    @AfterStep("@web")
    public void afterStep(Scenario scenario)
    {
        scenario.attach(WebUtil.takeScreenShot(),"image/png",scenario.getName()+".png");
    }
}
