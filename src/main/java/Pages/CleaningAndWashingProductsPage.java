package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class CleaningAndWashingProductsPage extends BasePage {

    private static By allCleaningAndWashingProducts = By.xpath("//div[@class='product_box']");
    private By productName = By.xpath(".//a[contains(@class, 'product-item-link')]");

       private int getQuantityOfAllCleaningAndWashingProducts() {
        List<WebElement> products = driver.findElements(allCleaningAndWashingProducts);
        return products.size();
    }
    public String isProductNotHaveName() {

        int items = getQuantityOfAllCleaningAndWashingProducts();
        List<WebElement> products = driver.findElements(allCleaningAndWashingProducts);
        try {
            products.get(0).findElement(productName);
        } catch (NoSuchElementException e) {
            return products.get(items).findElement(productName).getText();
        }
        return "Product has name value";

    }
}
