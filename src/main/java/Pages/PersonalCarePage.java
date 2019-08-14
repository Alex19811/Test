package Pages;

import org.openqa.selenium.By;


public class PersonalCarePage extends BasePage {


    private static By bathAndShower = By.xpath("/html//main[@id='maincontent']//div[@class='category-promo-column']/ul//a[@href='https://eva.ua/024-282/dlja-vanny-dusha/']");


    public BathAndShowerPage clickBathAndShowerPage() {
        getDriver().findElement(bathAndShower).click();
        return new BathAndShowerPage();


//    private static By electronicsContainer = By.xpath("//img[@alt='Electronics']");
//    private static By pageTitle = By.xpath("//div[contains(@class,'page-title ')]//h1");

        //public PersonalCarePage() {
//        Assert.assertEquals(getDriver().findElement(pageTitle).getText(),"HOME & DECOR");
//    }


//    public ElectonicsPage clickOnElectronicsContainer(){
//        getDriver().findElement( electronicsContainer).click();
//        return new ElectonicsPage();
//    }
    }
}
