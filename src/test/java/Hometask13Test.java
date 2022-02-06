import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Hometask13Test {
  private WebDriver driver;
  private WebDriverWait wait;

  @BeforeMethod
  public void before() {
    System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://rozetka.com.ua/");
    WebDriverWait wait = new WebDriverWait(driver, 5);
  }

  @Test
  public void test(){
    new HomePage(driver, wait).clickMenu();
    new ComputersAndLaptopsPage(driver, wait).clickLaptops();
    new LaptopsPage(driver, wait).setRozetkaFilter().setMaxPriceFilter("100000").clickOkBtn().clickFirstSaleProduct();
    ProductSalePage productSalePage = new ProductSalePage(driver, wait);
    Assert.assertTrue(productSalePage.elementSaleIsDisplayed());
  }

  @AfterMethod
  public void after() {
    driver.quit();
  }
}
