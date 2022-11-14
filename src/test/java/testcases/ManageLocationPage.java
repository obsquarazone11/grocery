package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import elementrepository.LoginPage;
import elementrepository.ManageLocation;

public class ManageLocationPage extends BaseClass {
	LoginPage lp;
	ManageLocation mp;

	@Test
	public void manageState() {
		lp = new LoginPage(driver);
		lp.presteps();
		mp = new ManageLocation(driver);
		String actual = mp.stateEdition();

		String expected = "×\n" + "Alert!\n" + "Location Created Successfully";
		Assert.assertEquals(actual, expected, Constant.titleErrormsg);
	}

	@Test
	public void managelistTittleVerrification() {
		lp = new LoginPage(driver);
		lp.presteps();
		mp = new ManageLocation(driver);
		String actual = mp.listTittleVerrification();

		String exp = "List Locations";
		Assert.assertEquals(actual, exp, Constant.titleErrormsg);
	}
}
