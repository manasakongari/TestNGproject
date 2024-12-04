package test;

import org.testng.annotations.Test;

import page.PimPage;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.devtools.v124.page.Page;
import org.testng.annotations.AfterClass;

public class pimpageTest {
	 PimPage pimpage;
  @Test
  public void navigatetopim() {
	  pimpage.navigatepim();
	  System.out.println("navigate to pim");
  }
  @BeforeClass
  public void beforeClass() {
	  pimpage = new  PimPage();
	  System.out.println("object created for pim page");
  }

  @AfterClass
  public void afterClass() {
  }

}
