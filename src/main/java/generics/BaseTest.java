package generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConstant
{
	public WebDriver driver;
@BeforeMethod
public void openApp()
{
	System.setProperty(gecko_key, gecko_value);
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get(url);
	
}
@AfterMethod
public void closeApp()
{
	driver.quit();
}
	

}
