import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaptopsPage {
  By rozetkaFilter = By.xpath("//a[@data-id='Rozetka']");
  By maxPriceField = By.xpath("//input[@formcontrolname='max']");
  By okBtn = By.xpath("//button[@type='submit']");
  By firstSaleItem = By.xpath("//span[contains(@class, 'promo-label_type_action')]/..");

  private WebDriver driver;
  private WebDriverWait wait;

  public LaptopsPage(WebDriver driver, WebDriverWait wait) {
    this.driver = driver;
    this.wait = wait;
  }

  public LaptopsPage setRozetkaFilter(){
    driver.findElement(rozetkaFilter).click();
    return this;
  }

  public LaptopsPage setMaxPriceFilter(String text){
    wait = new WebDriverWait(driver, 5);
    wait.until(ExpectedConditions.visibilityOfElementLocated(maxPriceField));
    driver.findElement(maxPriceField).clear();
    driver.findElement(maxPriceField).sendKeys(text);
    return this;
  }

  public LaptopsPage clickOkBtn(){
    driver.findElement(okBtn).click();
    return this;
  }

  public ProductSalePage clickFirstSaleProduct(){
    driver.findElement(firstSaleItem).click();
    return new ProductSalePage(driver, wait);
  }
}
