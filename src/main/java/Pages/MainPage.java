package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class MainPage extends BasePage {


    private static By newSelerText = By.xpath("//a[@class='top-level-a' and text()='Бренды']");
    private static By personalCare = By.xpath("//a[@class='top-level-a']//span[text()='УХОД ЗА СОБОЙ']");
    private static By closeWindow = By.xpath("//a[contains(@class,'btn-location-close js-hide-location')]");
    private static By householdСhemicals = By.xpath("//a[@class='top-level-a']//span[text()='БЫТОВАЯ ХИМИЯ']");

    public MainPage clickCloseWindow() {
        getDriver().findElement(closeWindow).click();
        return this;
    }

    public MainPage() {
      Assert.assertEquals(getDriver().findElement(newSelerText).getText(), "БРЕНДЫ");
    }

    public PersonalCarePage clickPersonalCare() {
        getDriver().findElement(personalCare).click();
        return new PersonalCarePage();
    }

    public HouseholdСhemicalsPage clickHouseholdСhemicals() {
        getDriver().findElement(householdСhemicals).click();
        return new HouseholdСhemicalsPage();
    }

}
