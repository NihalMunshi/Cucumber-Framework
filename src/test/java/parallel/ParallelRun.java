package parallel;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/Appfeatures"},
		glue = {"parallel"},
		tags="not @skip",
		monochrome =true,
		plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/","rerun:target/failedtest.txt"})




public class ParallelRun extends AbstractTestNGCucumberTests
{
	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
	
}
