
package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
public class BasePage {
    protected static WebDriver driver;


    public static void setDriver(WebDriver webDriver) {
                driver=webDriver;
    }

    public static WebDriver getDriver() {
       ((JavascriptExecutor)driver).executeScript("document.getElementById('fixedban').style.display = 'none';");
        return driver;
    }
}
