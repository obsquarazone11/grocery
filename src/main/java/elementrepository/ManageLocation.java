package elementrepository;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ManageLocation {
	WebDriver driver;
	public ManageLocation (WebDriver driver)
	{
		this.driver=driver;
		
			PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//ul/li[9]/a/p")
	WebElement manageloc;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Location/edit?edit=502&page_ad=1']")
			WebElement edit;
	@FindBy(id="country_id")
	WebElement dropdp;
	@FindBy(id="st_id")
	WebElement dropdownp;
	@FindBy(id="location")
	WebElement loc;
	@FindBy(xpath="//button[@class='btn btn-danger']")
	WebElement update;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement alert;
	@FindBy(xpath="//table/tbody/tr[20]/td[4]")
	WebElement amt;
	@FindBy(xpath="//table/tbody/tr[2]/td[5]/a/span")
	WebElement status;
	public String stateEdition()
	{
		manageloc.click();
		edit.click();
		dropdp.click();
		Select s=new Select(dropdp);
		s.selectByVisibleText("United Kingdom");
		Select s1=new Select(dropdownp);
		s1.selectByVisibleText("Bristol");
		loc.clear();
		loc.sendKeys("kerala");
		update.click();
		return alert.getText();
}
	public String amoundverrification()
	{
		manageloc.click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 250)");
		return amt.getText();
	}
	public String statusVerrification()
	{
		manageloc.click();
		return status.getText();
	}
}

