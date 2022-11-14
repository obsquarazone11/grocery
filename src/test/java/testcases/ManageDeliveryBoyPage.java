package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import elementrepository.DeliveryBoyPage;
import elementrepository.LoginPage;

public class ManageDeliveryBoyPage extends BaseClass {
	LoginPage lp;
	DeliveryBoyPage dp;

	@Test
	public void verifyingResetButtonColor() {
		lp = new LoginPage(driver);
		lp.presteps();
		dp = new DeliveryBoyPage(driver);
		String actual = dp.rebuttonColorCheck();
		String expected = "rgba(255, 193, 7, 1)";
		Assert.assertEquals(actual, expected, Constant.bgcolorerrormsg);

	}

	@Test(groups = { "SmokeTest" })
	public void passwordToolTipValidation() throws InterruptedException {
		lp = new LoginPage(driver);
		lp.presteps();
		dp = new DeliveryBoyPage(driver);
		String actual = dp.tooltipValidation();

		String expected = "Show Details";

		Assert.assertEquals(actual, expected, Constant.titleErrormsg);

	}

	@Test(groups = { "SmokeTest" })
	public void searchnameVallidation() {
		lp = new LoginPage(driver);
		lp.presteps();
		dp = new DeliveryBoyPage(driver);
		String actual = dp.nameVallidation();

		String expected = "Megha";

		Assert.assertEquals(actual, expected, Constant.nameerrormsg);
	}

	@Test
	public void manageSearchButtonClickable() {
		lp = new LoginPage(driver);
		lp.presteps();
		dp = new DeliveryBoyPage(driver);
		boolean actual = dp.searchbuttonClickable();
		boolean exp = true;
		Assert.assertEquals(actual, exp, Constant.ClickError);
	}
}