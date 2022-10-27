package elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBardPage {
	WebDriver driver;
	public DashBardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//li[@ class='breadcrumb-item']//a[@href='https://groceryapp.uniqassosiates.com/admin/home']")
	WebElement home;
	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	WebElement logname;
	@FindBy(xpath = "//a[@data-widget='pushmenu'")
	WebElement pushdownmenu;
	
	public String gettingCssvalue() 
	{
		home.click();
	return home.getCssValue("color");
	
}
	public String verrifyprofile()
	{
		logname.click();
		return logname.getText();
	}
}
