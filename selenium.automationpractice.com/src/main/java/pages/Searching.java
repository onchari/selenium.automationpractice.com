package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import myutilities.AutomationUtils;

public class Searching extends BasePage {

	static By searchField = By.cssSelector("input#search_query_top");
	static By searchBtn = By.cssSelector("button.button-search");
	static By result = By.className("ac_results");
	static By searchResult = By.xpath("//*[@class='ac_results']/ul/li");
	
	
	public Searching(WebDriver webDriver) {
		super(webDriver);
	}
	
	public static WebElement getSearchTextBoxField() {
		return AutomationUtils.waitForPresenceOfAutoElement(searchField);
	}
	
	public static WebElement getSearchBtn() {
		return AutomationUtils.waitForElementToBeClickable(searchBtn);
	}
	
	public static String getSearchPageTitle() {
		return driver.getTitle();
	}
	
	public static List<WebElement> getAllSearchResults() {
		return AutomationUtils.waitForPresenceOfElements(searchResult);
	}
	
	public static WebElement getSingleSearchResult(int res) {
		By singleRes = By.xpath("//*[@class='ac_results']/ul/li["+ res +"]");
		return AutomationUtils.waitForVisibilityOfAutoElement(singleRes);
	}
	
	public static boolean verifySearchSuggestion(String search) {
		boolean result = false;
		getSearchTextBoxField().sendKeys(search);
		List<WebElement> elements = getAllSearchResults();
		
		for (WebElement webElement : elements) {
			System.out.println(webElement.getText());
			if(webElement.getText().toLowerCase().contains(search)) {
				result = true;
			}
		}
		return result;
	}
	
	public static void clickSearchResult(int result) {
		getSingleSearchResult(result).click();
	}
	
	

}
