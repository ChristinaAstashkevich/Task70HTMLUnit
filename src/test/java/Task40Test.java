import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.google.common.base.Function;
import org.openqa.selenium.*;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task40Test extends TestBase {

    @Test
    public void fillingLoginForm() throws Exception {
        WebElement usernameField = driver.findElement(By.id("Username"));
        usernameField.sendKeys("EugenBorisik");
        WebElement passwordField = driver.findElement(By.xpath("//*[@id='Password']"));
        passwordField.sendKeys("qwerty12345");
        WebElement loginButton = driver.findElement(By.xpath("//*[@id='SubmitButton']"));
        loginButton.click();
        WebElement signOutSpan = driver.findElement(By.className("sign-out-span>a"));
        Assert.assertNotNull(signOutSpan);
    }
}
