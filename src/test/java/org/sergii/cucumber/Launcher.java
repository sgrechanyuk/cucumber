package org.sergii.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty"}, features = {"src/test/resources/feature/my.feature"})
public class Launcher {
}
