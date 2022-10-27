package utilities;

	import java.util.ArrayList;
import java.util.List;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.Select;

	public class GeneralUtilities {

		public String getElementText(WebElement element) {
			String text = element.getText();
			return text;
		}

		public boolean isClickable(WebElement element) {
			boolean status = element.isEnabled();
			return status;
		}
		public boolean isSelectable(WebElement element) {
			boolean status = element.isSelected();
			return status;
		}

		public void sendKey(WebElement element, String s) {
			element.sendKeys(s);
		}
public String getCss(WebElement element,String att)
{
	return element.getAttribute(att);
}
		public String getToolTip(WebElement element) {
			return element.getAttribute("title");
		}

		public void getClickElement(WebElement element) {
			element.click();
		}

		public void mediumDelay(int x) throws InterruptedException {
			Thread.sleep(x);
		}

		public void selectFuncbyindex(WebElement element, int index) {
			Select select = new Select(element);
			select.selectByIndex(index);

		}

		public void selectFuncbyValue(WebElement element, String value) {
			Select select1 = new Select(element);
			select1.selectByValue(value);

		}

		public String selectFuncbyVisibletext(WebElement element, String visisbletext) {
			Select select = new Select(element);
			select.selectByVisibleText(visisbletext);
			WebElement selectedValue = select.getFirstSelectedOption();
		return (selectedValue.getText());

		}

		public String FirstSelectedOption(WebElement element) {
			Select select1 = new Select(element);
			String firstoption = select1.getFirstSelectedOption().getText();
			return (firstoption);
		}

		public List getAllOptions(Select s) {

			List<WebElement> op = s.getOptions();

			return op;

		}
		List<String> list=new ArrayList<String>();
		public List addList(String s)
		{
			
			list.add(s);
			return list;
		}
		
			

	}


