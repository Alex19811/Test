package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HouseholdСhemicalsPage extends BasePage {

    private static By cleaningAndWashing = By.xpath("//ul//li//a[ text()='Средства для чистки и мытья']");

    public CleaningAndWashingProductsPage clickCleaningAndWashingProducts() {
        getDriver().findElement(cleaningAndWashing).click();
        return new CleaningAndWashingProductsPage();
    }
}

