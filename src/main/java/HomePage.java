import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
  By menu = By.xpath("//a[@class='menu-categories__link']");

  private WebDriver driver;
  private WebDriverWait wait;

  public HomePage(WebDriver driver, WebDriverWait wait){
    this.driver = driver;
    this.wait = wait;
  }

  public ComputersAndLaptopsPage clickMenu(){
    driver.findElement(menu).click();
    return new ComputersAndLaptopsPage(driver, wait);
  }
}
