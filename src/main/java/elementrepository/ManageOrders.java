package elementrepository;


import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
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
	List<String> li2=new ArrayList();
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


public List paymentModeSelection() throws InterruptedException
{
	//morders.click();
	gu.getClickElement(morders);
	//search.click();  
	gu.getClickElement(search);
	//dropdwn.click();
	gu.getClickElement(dropdwn);
	gu.selectFuncbyVisibletext(dropdwn,"Bank");
	//Select s=new Select(dropdwn);
	//s.selectByVisibleText("Bank");
//search2.click(); 
	  gu.getClickElement(search2);
return columndata;
}
public List<String> getList()
{
	List<String> li=new ArrayList();
	//li.add("Paid");
	//li.add("Ppaid");
	//li.add("unPaid");
	//li.add("Delivered");
	//li.add("Out for Delivery");
	gu.addList("Select");
gu.addList("Paid");
gu.addList("UnPaid");
gu.addList("Delivered");
gu.addList("Out For Delivery");
System.out.println(li);
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
public  List<String> strlistvalue()
{
	
	gu.getClickElement(morders);
	gu.getClickElement(search);
	gu.getClickElement(dropdwn2);
	Select s=new Select(dropdwn2);
	 List <WebElement> op = s.getOptions();
	 for(WebElement str:op)
	 {
		 String str1=str.getText();
		 li2.add(str1);
	 }
	 return li2;
}
public boolean listSortedcheck()
{
	gu.getClickElement(morders);
	gu.getClickElement(search);
	gu.getClickElement(dropdwn2);
	Select s=new Select(dropdwn2);
	 List <WebElement> options = s.getOptions();
	 ArrayList orglist=new ArrayList();
	 ArrayList templist=new ArrayList();
	 for(WebElement op:options)
	 {
		 orglist.add(op.getText());
		 templist.add(op.getText());
	 }
Collections.sort(templist);
if(orglist.equals(templist))
{
	return true;
}
else
{
	return false;
}

}
}
