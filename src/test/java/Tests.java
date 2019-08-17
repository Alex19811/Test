
import Pages.*;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static Pages.BasePage.getDriver;

public class Tests extends BaseTest {

    MainPage mainPage;

    @BeforeMethod(alwaysRun = true)
    public void xmsinUnit() {

        mainPage = new MainPage();
    }


    @Test
    public void promotionalPriceOfGoods() throws InterruptedException {
        Thread.sleep(15000);
        mainPage.clickCloseWindow()
                .clickPersonalCare()
                .clickBathAndShowerPage()
                .priceOfProductsSale();


    }

    /*@Test
    public void AllPriceOfGoods() throws InterruptedException {
        mainPage.clickCloseWindow()
        .clickPersonalCare()
                .clickHairCare()
                .clickNextPage();

        //третя сторінка
        //.clickNextPage();


    }*/

    /*@Test
    public void GoodsNotMeans() throws InterruptedException {
        Thread.sleep(15000);
        mainPage.clickCloseWindow()
                .clickHouseholdСhemicals();

                //.clickCleaningAndWashingProducts();

    }*/
}




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