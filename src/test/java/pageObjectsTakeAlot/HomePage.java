package pageObjectsTakeAlot;

import frameWork.BasePageFrameWork;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

public class HomePage extends BasePageFrameWork {

  //Method: click and enter text in the search bar
  public void enterTextInSearchBar(String itemName) throws InterruptedException {
    clickElement(By.cssSelector("input[name='search']"));
    enterText(By.cssSelector("input[name='search']"),itemName);
  }

  //Method:click the search icon after text is added
  public void clickSearchIcon(){
    clickElement(By.cssSelector(".search-icon"));
    this.driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
  }

  // Method: Get text from the item displayed
  public String getTextFromItemDisplayed() {
    String itemName = getElementText(By.partialLinkText("laconic-gear-double-rifle-bag-backpack-black"));
    return itemName;
  }
}
