package tests;


import frameWork.BasePageFrameWork;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pageObjectsTakeAlot.AddToCartPage;
import pageObjectsTakeAlot.HomePage;

public class shouldAddSelectedItemToCart extends BasePageFrameWork {

  //Initiate Page Object Classes
  BasePageFrameWork base = new BasePageFrameWork();
  AddToCartPage addToCart = new AddToCartPage();
  HomePage home = new HomePage();

  @AfterClass
  public void cleanUpAfterTest() {
    cleanUp();
  }

  @Test(priority = 1, alwaysRun = true)
  public void shouldAddItemToCart() throws InterruptedException {
    String itemName = "Laconic Gear Double Rifle Bag Backpack";
    String expectedItemName ="/laconic-gear-double-rifle-bag-backpack-black";
    home.enterTextInSearchBar(itemName);
    home.clickSearchIcon();
    //Verify here
    String actualItemName = addToCart.getTextFromItemInCart();
    Assert.assertEquals(expectedItemName, actualItemName, "The item added is displayed in the cart");
    Reporter.log("The item is added to the cart");
    System.out.println("shouldAddSelectedItemToCart: shouldAddItemToCart passed");
    //Could also verify on the total in cart if more time
  }
}
