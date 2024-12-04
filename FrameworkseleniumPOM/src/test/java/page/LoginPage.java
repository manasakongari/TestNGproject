package page;

import org.openqa.selenium.By;

import base.testbase;

public class LoginPage extends testbase{
	public LoginPage()
	{
		super();
	}
	By username = By.xpath("//input[@name=\"username\"]");
	By password = By.xpath("//input[@name=\"password\"]");
	By loginbutton = By.xpath("//button[@type=\"submit\"]");
	public void login(String usernametext, String passwordtext)
	{
		Driver.findElement(username).sendKeys(usernametext);
		Driver.findElement(password).sendKeys(passwordtext);
		Driver.findElement(password).click();
	}

}
