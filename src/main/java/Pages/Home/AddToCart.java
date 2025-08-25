package Pages.Home;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static Utilities.Selenium.DriverFactory.driver;


public class AddToCart {
    public static void AddToCart() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-header/nav/div/div/ul/li[1]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/app-overview/div[3]/div[2]/div[1]/a[1]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/app-detail/div[1]/div[2]/div[2]/button[1]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/div[1]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-header/nav/div/div/ul/li[5]"))).click();


    }
}
