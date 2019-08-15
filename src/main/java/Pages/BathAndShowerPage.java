package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BathAndShowerPage extends BasePage{

    //локатор товарыв на сторінціВанна та душ
    private static By showSelectionProducts = By.xpath("//div[1]/ul/li[7]");

  public BathAndShowerPage priceOfProductsSale() {
      WebElement element = driver.findElement (showSelectionProducts);

              System.out.println(element);
      return this;
  }
}




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

