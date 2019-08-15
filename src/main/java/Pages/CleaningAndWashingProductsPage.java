package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CleaningAndWashingProductsPage extends BasePage {


    //локатор товарів на першій сторінці
    private static By cleaningAndWashingProducts = By.xpath("/html//ol[@id='product-listing-wrap']");



//Найти товары наименование которых не начинается с "Средство
    // и вывести информацию о упавшем тесте"

    public CleaningAndWashingProductsPage setNumberOfProductsMeans(int numberOfProducts) {
        Select select = new Select(getDriver().findElement(cleaningAndWashingProducts));
        select.selectByVisibleText(String.valueOf(numberOfProducts));
        return this;
    }
}
