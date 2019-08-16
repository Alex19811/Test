package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BathAndShowerPage extends BasePage{


    //локатор списка товарів для ванни і душу
    private static By showSelectionProducts = By.xpath("/html//ol[@id='product-listing-wrap']");

  public BathAndShowerPage priceOfProductsSale() {
//      List<WebElement> items = (List<WebElement>) driver.findElements (showSelectionProducts);
//      items.get(0).find(тут шукаэш назву).getText());
//      old-price
//              System.out.println(items);
      return this;
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

