package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import elementrepository.LoginPage;
import elementrepository.ManageExpense;


public class ManageExpensePage extends BaseClass{
	
	LoginPage lp;
	ManageExpense mp;
	/*
	 * @Test public void manageResetButtonColorCheck() { lp=new LoginPage(driver);
	 * lp.presteps(); mp=new ManageExpense(driver); String actual=
	 * mp.searchButtonColorCheck(); System.out.println(actual); String
	 * expected="rgba(255, 255, 255, 1)";
	 * Assert.assertEquals(actual,expected,Constant.bgcolorerrormsg); }
	 * 
	 * @Test public void manageNewButtonTextCheck() throws InterruptedException {
	 * lp=new LoginPage(driver); lp.presteps(); mp=new ManageExpense(driver);
	 * Thread.sleep(4000); String actual= mp.newButtonTextCheck();
	 * System.out.println(actual); String expected="New";
	 * Assert.assertEquals(actual,expected,Constant.titleErrormsg); }
	 */
	
	  @Test 
	  public void callenderHandling() { lp=new LoginPage(driver);
	  lp.presteps(); mp=new ManageExpense(driver); String
	  actual=mp.calenderfunction("2022","July","20"); String expected="21/22/3";
	  Assert.assertEquals(actual,expected,"no match"); }
	
	@Test(groups= {"SmokeTest"})
	public void imageHandling() throws InterruptedException {
		lp=new LoginPage(driver);
		 lp.presteps(); 
		 mp=new ManageExpense(driver);
			
			  String path = System.getProperty("user.dir") +
			  "//src//main//resources//images//Screenshot (2).png"; String
			  actual=mp.imageUpload(path); 
			  String expected="image added";
			  Assert.assertEquals(actual,expected,"no match");
			  
			 
}
}