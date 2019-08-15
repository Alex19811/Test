package Pages;

import org.openqa.selenium.By;

public class HairCarePage extends BasePage {

    //локатор наступна сторінка
    private static By nextPage = By.xpath("//div[@id='amasty-shopby-product-list']/div[4]");

    //Клік на наступну сторінку (чи потрібно на кнопку 2)

    public HairCarePage clickNextPage() {
        getDriver().findElement(nextPage).click();
        return new HairCarePage();
    }



}
