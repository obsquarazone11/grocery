package elementrepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageExpense {
WebDriver driver;
public  ManageExpense(WebDriver driver)
{
	this.driver=driver;
	
		PageFactory.initElements(driver,this);
	
}
@FindBy(xpath="//i[@class='nav-icon fas fa-money-bill-alt']")
WebElement manageex;
@FindBy(xpath="//div/nav/ul/li[2]/ul[2]/li/a/p")
WebElement manageexp;
@FindBy(xpath="//a[@class=\'btn btn-rounded btn-primary\']")
WebElement search;
@FindBy(xpath="//a[@class=\'btn btn-rounded btn-danger\']")
WebElement neww;
@FindBy(xpath="//table/tbody/tr[1]/td[9]/a[1]/i")
WebElement changebutton;
@FindBy(xpath="//input[@class='form-control date']")
WebElement datepicker;
@FindBy(xpath="//button[@class='btn btn-danger']")
WebElement update;
@FindBy(xpath="//input[@type='file']")
WebElement choosefile;
@FindBy(xpath="//section/div[2]/div/div")
WebElement msg;
public void clickManageEx()
{
	manageex.click();
	manageexp.click();
}
public String searchButtonColorCheck()
{
	clickManageEx();
	
	return search.getCssValue("color"); //#1f2d3d;//class="btn btn-rounded btn-danger"
	}

public String newButtonTextCheck() throws InterruptedException
{
	Thread.sleep(3000);
	clickManageEx();
	
	return neww.getText(); //#1f2d3d;//class="btn btn-rounded btn-danger"
	}

public String calenderfunction(String exyr,String exmonth,String exdate)
{
	clickManageEx();
	changebutton.click();
	datepicker.click();
	 while(true)
     {
     String monthyr=driver.findElement(By.xpath("//div[2]/div[1]/table/thead/tr[2]/th[2]")).getText();
     String arr[]=monthyr.split(" ");
     String month=arr[0];
     String year=arr[1];
     if(month.equalsIgnoreCase(exmonth) && year.equalsIgnoreCase(year))
     		break;
     else
     driver.findElement(By.xpath("//div[2]/div[1]/table/thead/tr[2]/th[3]")).click();
     }
     List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='table-condensed']/tbody/tr/td"));
		for(WebElement ele:alldates)
		{
			String date=ele.getText();
			if(date.equalsIgnoreCase(exdate))
			{
				ele.click();
			}
		}

driver.navigate().refresh();
	return datepicker.getText();	

}
public String imageUpload(String s) throws InterruptedException
{
	clickManageEx();
	changebutton.click();
	
	choosefile.sendKeys(s);
	Thread.sleep(3000);
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("scroll(0, 250)"); // if the element is on bottom.
	jse.executeScript("arguments[0].click();", update);
	//update.click();
	
	return msg.getText();
}
}