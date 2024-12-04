package test;

import org.testng.annotations.Test;

import page.LoginPage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class LoginPageTest {
	LoginPage loginpage;
  @Test
  public void f() {
	  loginpage.login("admin", "admin123");
	  System.out.println("user loggedin");
  }
  @BeforeClass
  public void beforeClass() {
	  loginpage = new LoginPage();
  }

  @AfterClass
  public void afterClass() {
  }

}
