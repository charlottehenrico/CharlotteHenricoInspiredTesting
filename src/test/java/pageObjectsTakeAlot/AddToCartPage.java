package pageObjectsTakeAlot;

import frameWork.BasePageFrameWork;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

public class AddToCartPage extends BasePageFrameWork {
  public void addToCart(){
    clickElement(By.cssSelector("[class='cell small-3']:nth-of-type(1) [data-ref='add-to-cart-button']"));
    this.driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
  }

  public void goToCart(){
    clickElement(By.cssSelector(".badge-button-module_badge-button_3TXVp"));
  }

  // Method: Get text from the item displayed
  public String getTextFromItemInCart() {
    String itemNameInCart = getElementText(By.partialLinkText(".cart-item-module_item-title_1M9cq"));
    return itemNameInCart;
  }
}
