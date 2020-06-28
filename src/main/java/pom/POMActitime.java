package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMActitime {
	//Declaration
			@FindBy(id="username") //findelements(locatorname="locatorvalue")
			private WebElement usernametextfield;
			
			@FindBy(xpath="//input[@name='pwd']")
			private WebElement passwordtextfield;
			

			
			@FindBy(id="loginButton")
			private WebElement loginButton;
			
			@FindBy(xpath="//a[.='Forgot your password?']")
			private WebElement forgotPasswordLink;
			
			@FindBy(id="logoutLink")
			private WebElement logoutLink1;
			
		//Initialization
			
			public POMActitime(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			
		//utilization
			public 	void loginMethod() 
			{
			usernametextfield.sendKeys("admin");
			passwordtextfield.sendKeys("manager");

			loginButton.click();
			}
			
			public void forgotpasswordMethod() 
			{
			forgotPasswordLink.click();	
			}
			public void logoutLinkClickMethod()
			{

				logoutLink1.click();	
			}
			public void loginMethod1() 
			{
			usernametextfield.sendKeys("adm");
			passwordtextfield.sendKeys("pass");
			loginButton.click();
				
			}

}
