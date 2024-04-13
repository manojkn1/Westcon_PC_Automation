package pages.PageObjectModel;

import com.testing.base.CommonToALLPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage_POM extends CommonToALLPage {
    // Page locators
    By username= By.xpath("//input[@id='i0116']");
    By password= By.xpath("//input[@id='i0118']");
    By signIN_Button= By.cssSelector("#idSIButton9");
    By account_InputField= By.xpath("//input[contains(@placeholder,'Search by Reseller')]");
    By search_Button= By.xpath("//button[contains(@class,'sc-fhzFiK kdkILV')]");

    By selectSalesOrg= By.xpath("//button[@id='4000-1-1']");
    By startSession= By.xpath("//button[contains(text(),'Start Session')]");

    By popUpButton= By.xpath("//button[@class='sc-fhzFiK kdkILV']");

    //invalid username error
    By username_Invalid_Error=By.xpath("//div[@id='usernameError']");

    //Invalid password error
    By password_Invalid_Error=By.xpath("//div[@id='passwordError']");



    // Page Actions
    public void LoginWithValidCred(){
        visibilityOfElement(username);
        enterInput(username,"am2@westcon.com");
        clickElement(signIN_Button);
        visibilityOfElement(password);
        enterInput(password,"myPassword12345");
        visibilityOfElement(signIN_Button);
        clickElement(signIN_Button);
        visibilityOfElement(account_InputField);
        enterInput(account_InputField,"0001020777");
        visibilityOfElement(search_Button);
        clickElement(search_Button);
        visibilityOfElement(selectSalesOrg);
        clickElement(selectSalesOrg);

        elementTobeClickable(startSession);
        clickElement(startSession);
        visibilityOfElement(popUpButton);
        clickElement(popUpButton);

    }

    public String LoginWithInvalidCred1(){
        visibilityOfElement(username);
        enterInput(username,"am212");  // wrong username
        visibilityOfElement(signIN_Button);
        clickElement(signIN_Button);
        visibilityOfElement(username_Invalid_Error);
       return getElement(username_Invalid_Error).getText();
    }

    public String LoginWithInvalidCred2(){
        visibilityOfElement(username);
        enterInput(username,"am2@westcon.com");
        visibilityOfElement(signIN_Button);
        clickElement(signIN_Button);
        visibilityOfElement(password);
        enterInput(password,"myPassword");//wrong password
        visibilityOfElement(signIN_Button);
        clickElement(signIN_Button);
        visibilityOfElement(password_Invalid_Error);
        return getElement(password_Invalid_Error).getText();

    }
}
