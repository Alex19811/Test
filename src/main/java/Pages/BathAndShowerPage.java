package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BathAndShowerPage extends BasePage {


    //локатор списка товарів для ванни і душу

    private static By showSelectionProductsSale = By.xpath("//div[contains(@class,'product-label')]/parent::div[@class='product_box']");



    public void priceOfProductsSale() {
        List<WebElement> items = driver.findElements(showSelectionProductsSale);
        for (int i = 0; i < items.size(); i++) {
            System.out.println("ProductsSale:" + items.get(i).getAttribute("old-price"));

        }


//
//          Assert.assertEquals(getDriver().findElement(newSelerText).getText(), "БРЕНДЫ");
//     }
//
//      old-price
//           System.out.println(items);
    }
}


//    public int getColumnCount() {
//        List<WebElement> tableRows = _webTable.findElements(By.tagName("tr"));
//        WebElement headerRow = tableRows.get(0);
//        List<WebElement> tableCols = headerRow.findElements(By.tagName("td"));
//        return tableCols.size();


//        List<WebElement> ProductsSale = driver.findElements(By.xpath("/html//main[@id='maincontent']//div[.='Акция!']"));
//        Select select = new Select(getDriver().findElement(showSelectionProducts));
//        System.out.println(setPriceOfProductsSale());
//        //select.selectByVisibleText(String.valueOf(priceOfProductsSale));

//
//    List<WebElement> ProductsSale = driver.findElements(By.xpath("id('leftNav_levelTwo')//li"));
//
//        System.out.println(cheesecakes.size() + " cheesecakes:");
//        for (int i=0; i<cheesecakes.size(); i++) {
//        System.out.println(i+1 + ". " + cheesecakes.get(i).getText());
//    }
//
//
//•Find web elements on page:​
//    WebElement element = driver.findElement(By.id("#element_id")));​
//
//
//            •Compare actual/expected results in test​
//    assertEquals("Webpage expected title", driver.getTitle());​
//}

