package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import java.util.List;

public class HairCarePage extends BasePage {


    private By allProductsHairCare = By.xpath("//div[@class='product_box']");
    private By productOfPrice = By.xpath(".//span[contains(@id,'product-price')]");
    private By productName = By.xpath(".//a[contains(@class, 'product-item-link')]");
    private static By nextPage = By.xpath("//li[@class='item pages-item-next']");

    public HairCarePage clickNextPage() {
        getDriver().findElement(nextPage).click();
        return new HairCarePage();
    }

    public String isProductNotHavePrice() {
        int items = 0;
        List<WebElement> products = driver.findElements(allProductsHairCare);
        try {
            products.get(items).findElement(productOfPrice);
        } catch (NoSuchElementException e) {
            return products.get(items).findElement(productName).getText();
        }
        return "Product has price value";
    }

}
