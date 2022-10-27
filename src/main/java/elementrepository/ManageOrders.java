package elementrepository;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.GeneralUtilities;

public class ManageOrders {
	WebDriver driver;
	GeneralUtilities gu=new GeneralUtilities();
	
public ManageOrders(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
@FindBy(xpath="//div/nav/ul/li[3]/a/p")
WebElement morders;
@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")
WebElement search;

@FindBy(id="pt")
WebElement dropdwn;
@FindBy(id="st")
WebElement dropdwn2;

@FindBy(xpath="//button[@class='btn btn-danger btn-fix']")
WebElement search2;

@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']/tbody/tr/td[5]")
List<WebElement> columndata;
public List dropdwnvalue()
{
	gu.getClickElement(morders);
	gu.getClickElement(search);
	gu.getClickElement(dropdwn2);
	Select s=new Select(dropdwn2);
	List<WebElement> ops1=gu.getAllOptions(s);
	return ops1;
}

public List paymentModeSelection() throws InterruptedException
{
	//morders.click();
	gu.getClickElement(morders);
	//search.click();  
	gu.getClickElement(search);
	//dropdwn.click();
	gu.getClickElement(dropdwn);
	gu.selectFuncbyVisibletext(dropdwn, "Bank");
	//Select s=new Select(dropdwn);
	//s.selectByVisibleText("Bank");
//search2.click(); 
	  gu.getClickElement(search2);
return columndata;
}
public List<String> getList()
{
	List<String> li=new ArrayList();

gu.addList("Paid");
gu.addList("UnPaid");
gu.addList("Delivered");
gu.addList("Out for Delivery");

	return li;
}
public String listSelectedvalue(String s)
{
	gu.getClickElement(morders);
	gu.getClickElement(search);
	gu.selectFuncbyVisibletext(dropdwn2, s);
	String selected=gu.FirstSelectedOption(dropdwn2);
	gu.getClickElement(search2);
	
	return selected;
}
}