package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementrepository.LoginPage;
import elementrepository.MobileSlider;

public class ManageMobileSilder extends BaseClass{
  LoginPage lp;
  MobileSlider ms;


 @Test public void textVerification() { lp=new LoginPage(driver);
lp.presteps(); ms=new MobileSlider(driver); String actual=ms.getTitle();

 String exp="List Mobile Sliders"; Assert.assertEquals(actual,exp,"Tittle mismatch"); }

@Test public void statusVerification() { lp=new LoginPage(driver);
 lp.presteps(); ms=new MobileSlider(driver); String actual=ms.statusCheck();
 System.out.println(actual); String exp="Active";
 Assert.assertEquals(actual,exp,"status mismatch"); }

	@Test
	public void imageVerrification() throws InterruptedException
	{
		lp=new LoginPage(driver);
		lp.presteps();
		ms=new MobileSlider(driver);
		  String path = System.getProperty("user.dir") + "//src//main//resources//images//Screenshot (2).png"; 
		  boolean actual=ms.imageCheck(path); 
		  boolean expected=true;
				  Assert.assertEquals(actual,expected,"image is not found at the given location");
				 
		
	}
	@Test
	public void wrongImageVerrification() throws InterruptedException
	{
		lp=new LoginPage(driver);
		lp.presteps();
		ms=new MobileSlider(driver);
		  String path = System.getProperty("user.dir") + "//src//main//resources//images//TestPlan (1).docx"; 
		  String actual=ms.wrongimageCheck(path); 
		  String expected="Image is addedd";
				  Assert.assertEquals(actual,expected,"image is not addedd at the given location");
				 
		
	}
	}

