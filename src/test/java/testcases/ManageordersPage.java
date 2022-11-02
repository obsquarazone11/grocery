package testcases;

import java.util.ArrayList;
import java.util.List ;
import java.time.Duration;

import org.apache.commons.math3.analysis.function.Exp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import elementrepository.LoginPage;
import elementrepository.ManageOrders;
@Test
public class ManageordersPage extends BaseClass {

	LoginPage lp;
	ManageOrders mo;

	 
	
	  @Test
	  public void payamentSelection() throws InterruptedException
	  {
		  lp = new LoginPage(driver);

			lp.presteps();
			mo = new ManageOrders(driver);
			List<WebElement>actual=mo.paymentModeSelection();
			 String expected="Bank";
			 for(int i=0;i<actual.size();i++)
			 Assert.assertEquals(actual.get(i).getText(),expected,"SelectError");
	  }
	 
	  @DataProvider (name = "data-provider")
		public Object[][] dpMethod(){
			return new Object[][]{{"Select" }, { "Paid2" } ,{"Delivered"}};
		}

	  @Test(dataProvider="data-provider")
	  public void chkElementsStatus(String value)
	  {
		  lp=new LoginPage(driver);
		  lp.presteps();
		  mo=new ManageOrders (driver);
		  List<String>expected=mo.getList();
		  String actual=mo.listSelectedvalue(value);
		  System.out.println(actual);
		  for(int i=0;i<expected.size();i++)
		  {
				 Assert.assertEquals(actual,expected.get(i),"Selection Error");
		  
		  
	  }
		System.out.println("Hai");

}
	 @Test(groups={"SmokeTest"})
	 // @Test
	  public void listcompare()
	  {
		  lp=new LoginPage(driver);
		  lp.presteps();
		  mo=new ManageOrders (driver);
		  List<String>actual=mo.getList();
		  //System.out.println(actual);
		  
		 List<String>exp=mo.strlistvalue();
		 System.out.println(exp);

		
			  if(actual.size()==exp.size())
			  { 
				  for(int i=0;i<exp.size();i++)
				  {
			  Assert.assertEquals(actual.get(i),exp.get(i),"list is not matching");
			  }
			  }
	  }
			 
			
			//@Test(groups={"SmokeTest"})
			 public void listsortingchecking()
			 {
				 lp=new LoginPage(driver);
				  lp.presteps();
				  mo=new ManageOrders (driver);
				  boolean actual=mo.listSortedcheck();
				  boolean exp=false;
				  Assert.assertEquals(actual,exp,"list is not sorted");
				  
}
}