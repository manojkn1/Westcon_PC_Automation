package com.testing.base;

import Utils.PropertyReader;
import driver.DriverManager;
import driver.DriverManagerTL;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Properties;


public class CommonToALLPage {


public void openUrl()  {

    DriverManagerTL.getDriver().get(PropertyReader.readKey("url"));
}

public void clickElement(By by){
    DriverManagerTL.getDriver().findElement(by).click();
}

    public  void enterInput(By by, String key) {
        DriverManagerTL.getDriver().findElement(by).sendKeys(key);
    }

    //Explicit waits here

    public WebElement presenceOfElement(By elementLocation) {
        return new WebDriverWait( DriverManagerTL.getDriver(),Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
    }

    public WebElement visibilityOfElement(By elementLocation) {
        return new WebDriverWait(   DriverManagerTL.getDriver(),Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
    }

    public WebElement elementTobeClickable(By elementLocation) {
        return new WebDriverWait(   DriverManagerTL.getDriver(),Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(elementLocation));
    }


    public WebElement getElement(By key){
    return      DriverManagerTL.getDriver().findElement(key);
   }


   public Object scrollTo(By key){
       JavascriptExecutor js= (JavascriptExecutor) DriverManagerTL.getDriver();// Common code first

       WebElement scrollTo=DriverManagerTL.getDriver().findElement(key);
       // scroll to
      return  js.executeScript("arguments[0].scrollIntoView(true)",scrollTo);

   }

}