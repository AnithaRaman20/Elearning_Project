package test;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="feature_files\\ElearningNoData.feature", glue= "stepdefinitions")
public class TestRunner {
}
