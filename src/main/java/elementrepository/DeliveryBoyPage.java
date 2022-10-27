package elementrepository;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;
public class DeliveryBoyPage {
WebDriver driver;

	public DeliveryBoyPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//li[@class='nav-item']//a[@href='https://groceryapp.uniqassosiates.com/admin/list-deliveryboy']")
	WebElement manageDboy;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-warning']")
	WebElement resetbutton;
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']/tbody/tr[1]/td[7]/div/a\r\n")
			WebElement password;
	//@FindBy(xpath="//table/tbody/tr[1]/td[7]/div/a/i[@class='fa fa-angle-double-down']")
	//WebElement password;
	@FindBy(xpath="//table/tbody/tr[2]/td/div/div/span")
	WebElement showpassword;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")
	WebElement searchbutton;
	@FindBy(id="ut")
	WebElement email;
	@FindBy(xpath="//button[@class='btn btn-block-sm btn-danger']")
	
	WebElement searchbutton2;
	@FindBy(xpath="//table/tbody/tr[1]/td[1]")
	WebElement searchname;
	public String rebuttonColorCheck()
{
		manageDboy.click();
		
return resetbutton.getCssValue("background-color");
		}
	public String tooltipValidation() throws InterruptedException
	{
			manageDboy.click();
			Thread.sleep(3000);
			//password.click();
	return  password.getAttribute("title");
			}
	public String nameVerification()
	{
			manageDboy.click();
			password.click();
			showpassword.click();
	return  showpassword.getText();
			}
	public String nameVallidation()
	{
		manageDboy.click();
		searchbutton.click();
		email.sendKeys("megha.123@gmail.com");
		searchbutton2.click();
		return searchname.getText();
	}
}
