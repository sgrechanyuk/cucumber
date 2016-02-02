package org.sergii.cucumber.step;

import cucumber.api.java.en.When;

import static org.junit.Assert.fail;

public class SimpleStep {

    @When("I have a (.*)")
    public void testMe(String a){
        if (a.contains("2")){
            fail("Expected smth another, were 2");
        }
        System.out.println(a);
    }

}
