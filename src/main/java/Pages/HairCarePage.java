package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HairCarePage extends BasePage {

    //локатор наступна сторінка
    private static By nextPage = By.xpath("//div[@id='amasty-shopby-product-list']//ul[@class='items pages-items']/li[@class='item pages-item-next']");

    //Всы товари
    private static By products = By.xpath("//div[@class='product_box']");

    //Клік на наступну сторінку (чи потрібно на кнопку 2)

    public HairCarePage clickNextPage() {
        getDriver().findElement(nextPage).click();
        return new HairCarePage();
    }





}
