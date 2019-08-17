package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class HouseholdСhemicalsPage extends BasePage {


    private static By cleaningAndWashingProducts = By.xpath("//li/a[text()='Средства для чистки и мытья']");


    //Клік на сторінку Средства для чистки и мытья
    public HouseholdСhemicalsPage clickCleaningAndWashingProducts() {
        getDriver().findElement(cleaningAndWashingProducts).click();
        return new HouseholdСhemicalsPage();
    }


}
