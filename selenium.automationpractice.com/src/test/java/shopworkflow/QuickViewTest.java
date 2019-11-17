package shopworkflow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.HomePage;
import testcommonutils.BaseTest;

public class QuickViewTest extends BaseTest {

	
	
	@Test
	public void quickViewTest() throws InterruptedException {
		HomePage.quickViewFor();
	}
	
}
