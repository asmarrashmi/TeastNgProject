package stepDefination;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\java\\FeatureFile",
		glue="stepDefination")
public class TestRunner {

}
