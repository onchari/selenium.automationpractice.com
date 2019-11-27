package productsearching;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Searching;
import testcommonutils.BaseTest;

public class SearchingTest extends BaseTest {
	@Test(priority = 1)
	public void searchingForProduct() throws InterruptedException {
		Searching.getSearchTextBoxField().sendKeys("printed");
		Searching.getSearchBtn().click();
		Assert.assertEquals(Searching.getSearchPageTitle(), "Search - My Store");
	}
	
	@Test(priority = 2)
	public void searchSuggestionResults() {
		Assert.assertTrue(Searching.verifySearchSuggestion("printed"));	
	}
	
	@Test(priority = 3)
	public void clickSingleSearchResult() {
		Searching.clickSearchResult(1);
	}
}
