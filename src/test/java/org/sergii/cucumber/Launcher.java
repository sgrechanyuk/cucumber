package org.sergii.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(format = {"junit:cucumber/cucumber.xml"}, features = {"src/test/resources/feature/my.feature"})
public class Launcher {
}
