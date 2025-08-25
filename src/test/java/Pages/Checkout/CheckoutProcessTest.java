package Pages.Checkout;

import org.testng.annotations.AfterClass;
import static Utilities.Selenium.DriverFactory.driver;

public class CheckoutProcessTest {
    final CheckoutProcess checkoutProcess = new CheckoutProcess();

    @org.testng.annotations.Test(priority = 4)
    public void CheckoutProcessTest() throws InterruptedException {
        checkoutProcess.CheckoutProcess();
    }

    @AfterClass
    public void browserDown() throws InterruptedException {
        Thread.sleep(3000);

        if (driver != null) driver.quit();
    }

}
