package elementrepository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.collect.Table.Cell;

import utilities.GeneralUtilities;

public class PushNotificationPage {
	WebDriver driver;
	GeneralUtilities gu=new GeneralUtilities();
public PushNotificationPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

//@FindBy(xpath="//nav/ul/li[7]/a/p")
@FindBy(xpath="//p[contains(text(),'Push Notifications')]")
WebElement pnotification;
@FindBy(xpath="//button[@class='btn btn-block-sm btn-info']")
WebElement send;
@FindBy(id="title")
WebElement title;
@FindBy(id="description")
WebElement desc;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
WebElement message;
public void clickpnotification()
{
	pnotification.click();
	//gu.getClickElement(pnotification);
	}

public String textverrification() throws InterruptedException
{
	clickpnotification();
	Thread.sleep(3000);
	//return pnotification.getText();
	return gu.getElementText(pnotification);
	}
public String bgcolorverrification()
{
	clickpnotification();
	//return send.getCssValue("background-color");
	return gu.getCss(send,"background-color");
}


 public String messageVerrification(String s,String s1) throws
 InterruptedException { clickpnotification(); //title.sendKeys(s);
  gu.sendKey(title,"sample"); //desc.sendKeys(s1);
 gu.sendKey(desc,"sample desc"); //send.click(); gu.getClickElement(send);
  Thread.sleep(3000); return message.getText(); 
  //return gu.getElementText(message);
 }
public String excelmessageVerrification() throws IOException
{
	String path = System.getProperty("user.dir") + "//src//main//resources//Excelfiles//Sample.xlsx";
	FileInputStream file = new FileInputStream(new File(path));
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	XSSFSheet sheet = workbook.getSheetAt(0);
	int noofrows=sheet.getLastRowNum();

	for( int  row=1;row<=noofrows;row++)
	{
		XSSFRow current_row=sheet.getRow(row);
		String first=current_row.getCell(0).getStringCellValue();
	String first2=current_row.getCell(1).getStringCellValue();
	
	clickpnotification();
	title.sendKeys(first);
	desc.sendKeys(first2);
	send.click();
	
	 
		
}

	return 	message.getText();

}
public String titleVerrification()
{
	String title=driver.getTitle();
	return title;
}
}