import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ComputersAndLaptopsPage {
  By laptops = By.xpath("//a[@title='Ноутбуки']");

  private WebDriver driver;
  private WebDriverWait wait;

  public ComputersAndLaptopsPage(WebDriver driver, WebDriverWait wait) {
    this.driver = driver;
    this.wait = wait;
  }

  public LaptopsPage clickLaptops(){
    driver.findElement(laptops).click();
    return new LaptopsPage(driver, wait);
  }
}
