package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HairCarePage<puplic> extends BasePage {


    private By allProductsHairCare = By.xpath("//div[@class='product_box']");
    private By productOfPrice = By.xpath(".//span[contains(@id,'product-price')]");
    private By productName = By.xpath(".//a[contains(@class, 'product-item-link')]");
    private static By allPage = By.xpath("//div[@class='pages']");


    private int getQuantityOfAllProducts() {
        List<WebElement> products = driver.findElements(allProductsHairCare);
        return products.size();
    }

    public int getproductOfPrice() {
        List<WebElement> productsPrice = driver.findElements(productOfPrice);
        return productsPrice.size();
    }

    private int getPage() {
        List<WebElement> page = driver.findElements(allPage);
        return page.size();
    }

    public String isProductNotHavePrice() {

        List<WebElement> products = driver.findElements(allProductsHairCare);

        List<WebElement> page = driver.findElements(allPage);
        int i = getPage();
        for (i = 0; i < 4; i++) {
            page.get(i).findElements(allPage);
            for (int j = 0; j < products.size(); j++) {
                products.get(j).findElements(productOfPrice);
                i++;
                try {
                    products.get(j).findElement(productOfPrice);
                } catch (NoSuchElementException e) {
                    return products.get(j).findElement(productName).getText();
                }
            }
        }
        return "Product has price value";
    }
}


