package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Mphasis Training\\Selenium workspace\\Phase_2_Cucumberproject\\src\\test\\java\\features\\AmazonPages.feature",

                  glue = { "steps" }, dryRun = false, plugin = { "pretty", "html:target/cucumberreprt.html" },
                  
                  tags="@all")
public class TestRunner1 {

}
