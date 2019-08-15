package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class HouseholdСhemicalsPage extends BasePage {


    private static By cleaningAndWashingProducts = By.xpath("/html//main[@id='maincontent']//div[@class='category-promo-column']/ul//a[@href='https://eva.ua/220-276/sredstva-chistki-mytja/']");


    //Клік на сторінку Средства для чистки и мытья
    public HouseholdСhemicalsPage clickCleaningAndWashingProducts() {
        getDriver().findElement(cleaningAndWashingProducts).click();
        return new HouseholdСhemicalsPage();
    }


}
