package Pages.Checkout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import static Utilities.Selenium.DriverFactory.driver;


public class CheckoutProcess {


    public static void CheckoutProcess() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/app-checkout/aw-wizard/div/aw-wizard-step[1]/app-cart/div/div"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/app-checkout/aw-wizard/div/aw-wizard-step[2]/app-login/div/div/div/div"))).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/app-checkout/aw-wizard/div/aw-wizard-step[3]/app-address/div/div/div/div"))).click();

        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/app-checkout/aw-wizard/div/aw-wizard-completion-step/app-payment/div/div/div/form/div[1]"))).click();

        //  Select class
        WebElement paymentDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("payment-method")));
        Select select = new Select(paymentDropdown);
        select.selectByVisibleText("Gift Card");

        // close the menu
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/app-checkout/aw-wizard/div/aw-wizard-completion-step/app-payment/div/div/div/form/div[1]"))).click();

        driver.findElement(By.id("gift_card_number")).sendKeys("1111111111111111");
        driver.findElement(By.id("validation_code")).sendKeys("100");

        // click on confirm
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/app-checkout/aw-wizard/div/aw-wizard-completion-step/app-payment/div/div/div/div"))).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/app-root/div/app-checkout/aw-wizard/div/aw-wizard-completion-step/app-payment/div/div/div/div")).click();


    }

}