package pages.PageObjectModel;

import com.testing.base.CommonToALLPage;
import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Dashboard_POM extends CommonToALLPage {

//locators
    //span[text()='Account No 0001005286'] account no on dashboard
    By dashboard_accountnumber= By.xpath("//span[text()='Account No 0001005286']");

    By allCartsLink= By.xpath("//a[text()='View All Carts']");
    By AllCarts_Label= By.xpath("//h2[text()='All Carts']");

    By findQuoteLink= By.linkText("//div[text()='Find Quote']");
   By AllOrdersLabel= By.xpath("//h2[text()='Orders']");





    //action
    public String loggedUserAccountNumber(){
        presenceOfElement(dashboard_accountnumber);
        return getElement(dashboard_accountnumber).getText();

    }

    public String testAllCartsLink(){
        DriverManager.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        presenceOfElement(allCartsLink);
        clickElement(allCartsLink);
        presenceOfElement(AllCarts_Label);
       return  getElement(AllCarts_Label).getText();

    }

    public String testAllOrdersLink(){
        DriverManager.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        presenceOfElement(findQuoteLink);
        clickElement(findQuoteLink);
        presenceOfElement(AllOrdersLabel);
        return  getElement(AllOrdersLabel).getText();
    }





}
