package Pages;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class BathAndShowerPage extends BasePage {


    private By allProducts = By.xpath("//div[@class='product_box']");
    private By productOldPrice = By.xpath(".//span[contains(@id,'old-price')]");
    private By productName = By.xpath(".//a[contains(@class, 'product-item-link')]");


    private int getQuantityOfAllProducts() {
        List<WebElement> products = driver.findElements(allProducts);
        return products.size();
    }

    private int getRandomProductNumber() {
        int min = 0;
        int max = getQuantityOfAllProducts()-1;
        return new Random().nextInt(max - min + 1) + min;
    }

    public String isRandomProductNotHavePromo() {
        int random = getRandomProductNumber();
        List<WebElement> products = driver.findElements(allProducts);
        try {
            products.get(random).findElement(productOldPrice);
        } catch (NoSuchElementException e) {
            return products.get(random).findElement(productName).getText();
        }
        return "Product has old price value";
    }
}


//    public int getColumnCount() {
//        List<WebElement> tableRows = _webTable.findElements(By.tagName("tr"));
//        WebElement headerRow = tableRows.get(0);
//        List<WebElement> tableCols = headerRow.findElements(By.tagName("td"));
//        return tableCols.size();


//        List<WebElement> ProductsSale = driver.findElements(By.xpath("/html//main[@id='maincontent']//div[.='Акция!']"));
//        Select select = new Select(getDriver().findElement(showSelectionProducts));
//        System.out.println(setPriceOfProductsSale());
//        //select.selectByVisibleText(String.valueOf(priceOfProductsSale));

//