package Pages.Home;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartTest {

    final AddToCart addToCart = new AddToCart();

    @org.testng.annotations.Test(priority = 3)
    public void AddItemToCartTest() throws InterruptedException {
        addToCart.AddToCart();

    }
}
