package shopworkflow;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Cart;
import testcommonutils.BaseTest;

public class CartTest  extends BaseTest{

	@Test(priority = 1)
	public void test1() throws InterruptedException {
		System.out.println("Testing cart");
		Cart.clickCartTab();
		
		Thread.sleep(5000);

	}
	
	@Test
	public void getAllCartQty() {
		Assert.assertEquals(Cart.checkTotalCartQty(), 0);
	}
	
	@Test
	public void deleteCartProducts() {
		
	}
	
	@Test
	public void checkCartProductQty() {
		
	}
	
	@Test
	public void checkCartProductPrice() {
		
	}
	
	@Test
	public void continueToShoppingSummary() {
		
	}
	
	@Test
	public void  increaseQtyOfProduct1() {
		
	}
}
