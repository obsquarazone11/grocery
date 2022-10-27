package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class Synchronisation {
	
public void implicitWait(WebDriver driver,int time)
{
	driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

}
public void pageLoadWait(WebDriver driver,int time)
{
	driver.manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);

}
}
