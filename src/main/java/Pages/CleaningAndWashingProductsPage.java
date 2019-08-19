package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class CleaningAndWashingProductsPage extends BasePage {


    //локатор товарів на першій сторінці
    private static By allCleaningAndWashingProducts = By.xpath(".//span[contains(@id,'product-price')]");
    private By productName = By.xpath(".//a[contains(@class, 'product-item-link')]");

//Найти товары наименование которых не начинается с "Средство
    // и вывести информацию о упавшем тесте"

    private int getQuantityOfAllProducts() {
        List<WebElement> products = driver.findElements(allCleaningAndWashingProducts);
        return products.size();
    }

    private int getRandomProductNumber() {
        int min = 0;
        int max = getQuantityOfAllProducts()-1;
        return new Random().nextInt(max - min + 1) + min;
    }

    public String isRandomProductNotHavePromo() {
        int random = getRandomProductNumber();
        List<WebElement> products = driver.findElements(allCleaningAndWashingProducts);
        try {
            products.get(random).findElement(allCleaningAndWashingProducts);
        } catch (NoSuchElementException e) {
            return products.get(random).findElement(productName).getText();
        }
        return "Product has price value";
    }
}
