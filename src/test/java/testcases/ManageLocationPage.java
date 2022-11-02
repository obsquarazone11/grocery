package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementrepository.LoginPage;
import elementrepository.ManageLocation;

public class ManageLocationPage extends BaseClass {
	LoginPage lp;
	ManageLocation mp;

	
	  @Test public void manageState()
	  { 
		  lp = new LoginPage(driver); lp.presteps();
	  mp = new ManageLocation(driver); String actual = mp.stateEdition();
	System.out.println(actual);
	  String expected="×\n"
	  		+ "Alert!\n"
	  		+ "Location Created Successfully";
	 Assert.assertEquals(actual, expected, "error happend"); }
	 
  @Test
  public void amountVerrification()
  {
	  lp=new LoginPage(driver);
	  lp.presteps();
	  mp=new ManageLocation(driver);
	  String actual=mp.amoundverrification();
	  System.out.println(actual);
	  String exp="₹100";
	  Assert.assertEquals(actual, exp,"error happend");
  }
  @Test
  public void manageStatusVerrification()
  {
	  lp=new LoginPage(driver);
	  lp.presteps();
	  mp=new ManageLocation(driver);
	  String actual=mp.statusVerrification();
	  System.out.println(actual);
	  String exp="Active";
	  Assert.assertEquals(actual, exp,"error happend");
  }
  }

