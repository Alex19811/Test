package Pages;

import org.openqa.selenium.By;


public class PersonalCarePage extends BasePage {

    // уход за волосами
    private static By hairCare = By.xpath("//ul//li//a[ text()='Уход за волосами']");

    //Для ванны и душа!!!
    private static By bathAndShower = By.xpath("//ul//li//a[ text()='Для ванны и душа']");


    //нажать на кнопку "Уход за волосами"
    public HairCarePage clickHairCare() {
        getDriver().findElement(hairCare).click();
        return new HairCarePage();
    }

    //нажать на кнопку "Ванна и душ"
    public BathAndShowerPage clickBathAndShowerPage() {
        getDriver().findElement(bathAndShower).click();
        return new BathAndShowerPage();
    }
}





//    private static By electronicsContainer = By.xpath("//img[@alt='Electronics']");
//    private static By pageTitle = By.xpath("//div[contains(@class,'page-title ')]//h1");

        //public PersonalCarePage() {
//        Assert.assertEquals(getDriver().findElement(pageTitle).getText(),"HOME & DECOR");
//    }


//    public ElectonicsPage clickOnElectronicsContainer(){
//        getDriver().findElement( electronicsContainer).click();
//        return new ElectonicsPage();
//    }


