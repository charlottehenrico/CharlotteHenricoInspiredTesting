package tests;

import frameWork.BasePageFrameWork;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pageObjectsTakeAlot.HomePage;

public class SearchForItemsInSearchBarTests extends BasePageFrameWork {
  //Initiate Page Object Classes
  BasePageFrameWork base = new BasePageFrameWork();
  HomePage home = new HomePage();

  @AfterClass
  public void cleanUpAfterTest() {
    cleanUp();
  }

  @Test(priority=1, alwaysRun = true)
  public void shouldDisplayItemWhenSearchedOnExactPhrase() throws InterruptedException {
    String itemName = "Laconic Gear Double Rifle Bag Backpack";
    String expectedItemName ="/laconic-gear-double-rifle-bag-backpack-black";
    home.enterTextInSearchBar(itemName);
    home.clickSearchIcon();
    //Verify here
    String actualItemName = home.getTextFromItemDisplayed();
    Assert.assertEquals(expectedItemName,actualItemName,"The item searched for is displayed");
    Reporter.log( "The searched item is returned");
    System.out.println("SearchForItemsInSearchBarTests: shouldDisplayItemWhenSearchedOnExactPhrase passed");
  }
}
