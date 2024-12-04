package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testbase {
	
	protected WebDriver Driver ;
	String url=("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	protected testbase() {
		
	Driver = new ChromeDriver();
	Driver.get(url);
	Driver.manage().window().maximize();
Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
}
