package page;

import org.openqa.selenium.By;

import base.testbase;

public class PimPage extends testbase {
	By employeename = By.xpath("//div[@class=\"oxd-autocomplete-text-input oxd-autocomplete-text-input--active\"]//input");
	By pimnav = By.linkText("PIM");
	
	void searchemployee()
	{
		Driver.findElement(employeename).sendKeys("abc");
	}
	public void navigatepim()
	{
		Driver.findElement(pimnav).click();
	}

}
