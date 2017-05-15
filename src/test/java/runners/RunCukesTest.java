package runners;

import org.apache.log4j.PropertyConfigurator;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",
		glue = "step_definitions",
		plugin = {"pretty", "html:target/cucumber-html-report"},
		tags = {"@wip"}
		)
public class RunCukesTest{
	public RunCukesTest(){
		PropertyConfigurator.configure(System.getProperty("user.dir") + "/src/test/resources/log4j.properties");
	}
}