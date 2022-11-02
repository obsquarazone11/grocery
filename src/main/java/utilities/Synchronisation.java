package utilities;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronisation {
	
public void implicitWait(WebDriver driver,int time)
{
	driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

}
public void pageLoadWait(WebDriver driver,int time)
{
	driver.manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);

}
public void Elementvisible(WebDriver driver, String location) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(location)));

}

public void clickElement(WebDriver driver, String target) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(target)));
}


}
