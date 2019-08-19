package Pages;

import org.openqa.selenium.By;


public class PersonalCarePage extends BasePage {

    private static By hairCare = By.xpath("//ul//li//a[ text()='Уход за волосами']");
    private static By bathAndShower = By.xpath("//ul//li//a[ text()='Для ванны и душа']");

    public HairCarePage clickHairCare() {
        getDriver().findElement(hairCare).click();
        return new HairCarePage();
    }

    public BathAndShowerPage clickBathAndShowerPage() {
        getDriver().findElement(bathAndShower).click();
        return new BathAndShowerPage();
    }
}

