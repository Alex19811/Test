
import Pages.*;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static Pages.BasePage.getDriver;

public class Tests extends BaseTest {

    MainPage mainPage;

    @BeforeMethod(alwaysRun = true)
    public void xmsinUnit() {

        mainPage = new MainPage();
    }


    @Test
    public void promotionalPriceOfGoods() throws InterruptedException {
        //Thread.sleep(15000);
        BathAndShowerPage bathAndShowerPage;
        bathAndShowerPage = mainPage.clickCloseWindow()
                .clickPersonalCare()
                .clickBathAndShowerPage();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(bathAndShowerPage.isRandomProductNotHavePromo(), "Product has old price value");
        softAssert.assertEquals(bathAndShowerPage.isRandomProductNotHavePromo(), "Product has old price value");
        softAssert.assertEquals(bathAndShowerPage.isRandomProductNotHavePromo(), "Product has old price value");
        softAssert.assertAll();
    }

    /* @Test
     public void AllPriceOfGoods() throws InterruptedException {
         HairCarePage hairCarePage = mainPage.clickCloseWindow()
                 .clickPersonalCare()
                 .clickHairCare();
         SoftAssert softAssert1 = new SoftAssert();
         softAssert1.assertEquals(hairCarePage.isProductNotHavePrice(), "Product has price value");
         softAssert1.assertAll();


     }*/
   /* @Test
    public void GoodsNotMeans() throws InterruptedException {
        //Thread.sleep(15000);
        CleaningAndWashingProductsPage cleaningAndWashingProductsPage = mainPage.clickCloseWindow()
                .clickHouseholdСhemicals()
                .clickCleaningAndWashingProducts();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(cleaningAndWashingProductsPage.isProductNotHaveName(), "Product has name value");
        softAssert.assertAll();
    }*/
}
