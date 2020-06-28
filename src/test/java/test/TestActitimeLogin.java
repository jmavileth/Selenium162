package test;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import generics.BaseTest;
import pom.POMActitime;


public class TestActitimeLogin extends BaseTest {
	@Test
	public void login()
	{
		POMActitime login = new POMActitime(driver);
		login.loginMethod();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Enter Time"));
		login.logoutLinkClickMethod();
	}

}
