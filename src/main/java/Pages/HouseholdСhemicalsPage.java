package Pages;

import org.openqa.selenium.By;

public class HouseholdСhemicalsPage extends BasePage {

    private static By cleaningAndWashing = By.xpath("//ul//li//a[ text()='Средства для чистки и мытья']");

    public CleaningAndWashingProductsPage clickCleaningAndWashingProducts() {
        getDriver().findElement(cleaningAndWashing).click();
        return new CleaningAndWashingProductsPage();
    }
}

