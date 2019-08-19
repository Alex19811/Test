
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


   /* @Test
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
    }*/

    @Test
    public void AllPriceOfGoods() throws InterruptedException {
        HairCarePage hairCarePage = mainPage.clickCloseWindow()
                .clickPersonalCare()
                .clickHairCare();
        SoftAssert softAssert1 = new SoftAssert();
        softAssert1.assertEquals(hairCarePage.isProductNotHavePrice(), "Product has price value");
        softAssert1.assertAll();
        hairCarePage.clickNextPage();
        SoftAssert softAssert2 = new SoftAssert();
        softAssert2.assertEquals(hairCarePage.isProductNotHavePrice(), "Product has price value");
        softAssert2.assertAll();
        hairCarePage.clickNextPage();
        SoftAssert softAssert3 = new SoftAssert();
        softAssert3.assertEquals(hairCarePage.isProductNotHavePrice(), "Product has price value");
        softAssert3.assertAll();

    }
   /* @Test
    public void GoodsNotMeans() throws InterruptedException {
        //Thread.sleep(15000);
        HouseholdСhemicalsPage householdСhemicalsPage = mainPage.clickCloseWindow()
                .clickHouseholdСhemicals()
                .clickCleaningAndWashingProducts();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(householdСhemicalsPage.isProductNotHaveName(), "Product has name value");
        softAssert.assertEquals(householdСhemicalsPage.isProductNotHaveName(), "Product has name value");
        softAssert.assertEquals(householdСhemicalsPage.isProductNotHaveName(), "Product has name value");
        softAssert.assertEquals(householdСhemicalsPage.isProductNotHaveName(), "Product has name value");
        softAssert.assertEquals(householdСhemicalsPage.isProductNotHaveName(), "Product has name value");
        softAssert.assertEquals(householdСhemicalsPage.isProductNotHaveName(), "Product has name value");
        softAssert.assertAll();

                //.clickCleaningAndWashingProducts();

    }
}*/

//        Assert.assertEquals (electonicsPage.getNumberPresentProducts(),electonicsPage.getCounterValue(),"messege");
//        Thread.sleep(3000);
//    }


// RegisterPage registerPage = new RegisterPage();
//        Assert.assertTrue(registerPage.isUserNamePresent());
//        Assert.assertTrue(registerPage.isLastNamePresent());
//        Assert.assertTrue(registerPage.isAddessMailAddPresent());
//        Assert.assertTrue(registerPage.isPassworPresent());
//        Assert.assertTrue(registerPage.isConfirmPasswordPresent());
//        // SoftAssert.