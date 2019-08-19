package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HouseholdСhemicalsPage extends BasePage {


    private static By allCleaningAndWashingProducts = By.xpath("//div[@class='product_box']");

    private static By cleaningAndWashing = By.xpath("//ul//li//a[ text()='Средства для чистки и мытья']");
    private By productName = By.xpath(".//a[contains(@class, 'product-item-link')]");

    //Клік на сторінку Средства для чистки и мытья
    public HouseholdСhemicalsPage clickCleaningAndWashingProducts() {
        getDriver().findElement(cleaningAndWashing).click();
        return new HouseholdСhemicalsPage();
    }

    private int getQuantityOfAllCleaningAndWashingProducts() {
        List<WebElement> products = driver.findElements(allCleaningAndWashingProducts);
        return products.size();
    }
    public String isProductNotHaveName() {

        int items = getQuantityOfAllCleaningAndWashingProducts();
        List<WebElement> products = driver.findElements(allCleaningAndWashingProducts);
        try {
            products.get(0).findElement(allCleaningAndWashingProducts);
        } catch (NoSuchElementException e) {
            return products.get(items).findElement(productName).getText();
        }
        return "Product has price value";

    }

}

