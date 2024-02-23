package parallel;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.factory.FactoryTest;
import com.utilities.PropertyReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks
{
	private FactoryTest factorytest;
	private WebDriver driver;
	private PropertyReader prop_reader;
	Properties prop;
	
	@Before(order=0)
	public void getProperty() throws IOException
	{
		prop=new Properties();
		prop_reader= new PropertyReader();
		prop=prop_reader.init_prop();
	}
	
	@Before(order=1)
	public void LaunchBrowser()
	{
		factorytest =new FactoryTest();
		driver=factorytest.init_driver(prop.getProperty("browser"));
	}
	
	@After(order =0)
	public void quitBrowser()
	{
		driver.quit();
	}
	
	@After(order =1)
	public void teardown(Scenario sc)
	{
		if(sc.isFailed())
		{
			String screnshot_name=sc.getName().replaceAll("", "_");
			byte[] srcpath=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES); 
			sc.attach(srcpath, "image/png", screnshot_name);
		}
	}
}
