package com.testing.base;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;



public class CommonToALLPage {


public void openUrl()  {

    DriverManager.driver.get("https://uat-pc.westconcomstor.com/global/en/market-place/pc.html");
}

public void clickElement(By by){
    DriverManager.driver.findElement(by).click();
}

    public  void enterInput(By by, String key) {
        DriverManager.driver.findElement(by).sendKeys(key);
    }

    //Explicit waits here

    public WebElement presenceOfElement(By elementLocation) {
        return new WebDriverWait( DriverManager.driver,Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
    }

    public WebElement visibilityOfElement(By elementLocation) {
        return new WebDriverWait(   DriverManager.driver,Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
    }

    public WebElement elementTobeClickable(By elementLocation) {
        return new WebDriverWait(   DriverManager.driver,Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(elementLocation));
    }

public WebElement getElement(By key){
  return      DriverManager.driver.findElement(key);
}

}