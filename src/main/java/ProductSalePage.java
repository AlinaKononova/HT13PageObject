import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductSalePage {
  By elementSale = By.xpath("//app-label[@class='main-gallery__label ng-star-inserted']");

  private WebDriver driver;
  private WebDriverWait wait;

  public ProductSalePage(WebDriver driver, WebDriverWait wait) {
    this.driver = driver;
    this.wait = wait;
  }

  public boolean elementSaleIsDisplayed(){
    return driver.findElement(elementSale).isDisplayed();
  }
}
