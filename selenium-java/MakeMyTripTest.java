package selenium_java;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
public class MakeMyTripTest extends BaseTest {
   @Test
   public void verifyLogo() {
       driver.get("https://www.makemytrip.com");
       Assert.assertTrue(
           driver.findElement(By.xpath("//img[@alt='Make My Trip']")).isDisplayed()
       );
   }
   @Test
   public void selectFlight() {
       driver.get("https://www.makemytrip.com");
       driver.findElement(By.xpath("//span[text()='Flights']")).click();
       driver.findElement(By.xpath("//li[text()='One Way']")).click();
       driver.findElement(By.id("fromCity")).click();
       driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Chennai");
       driver.findElement(By.id("toCity")).click();
       driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Delhi");
   }
}
