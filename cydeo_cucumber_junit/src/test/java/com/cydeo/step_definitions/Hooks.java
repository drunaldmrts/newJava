package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/*
In the class we will be able to pass pre- & post- conditions to each scenario and step
 */
public class Hooks {

    // import from io.cucumber.java  not from junit
    @Before (order = 0)
    public void setupScenario(){

        System.out.println("===Setting up browser using cucumber @Before");
    }

    @Before (value = "@login",order = 1)
    public void setupScenarioForLogin(){

        System.out.println("=== this will only apply to scenarios with @login tag");
    }

    @After
    public void teardownScenario(Scenario scenario){

        if(scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        Driver.closeDriver();

        //System.out.println("===Closing browser using cucumber @After");
       // System.out.println("===Scenario ended/ Take a screenshot if the test failed");
    }

    @BeforeStep
    public void setupStep(){
        System.out.println("------------applying setup using @BeforeStep");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("------------applying teardown using @AfterStep");
    }

}
