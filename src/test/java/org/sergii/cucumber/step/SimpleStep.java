package org.sergii.cucumber.step;

import cucumber.api.java.en.When;

public class SimpleStep {

    @When("I have a (.*)")
    public void testMe(String a){
        System.out.println(a);
    }

}
