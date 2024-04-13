package tests;



import com.testing.basetest.CommonToAllTest;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageObjectModel.LoginPage_POM;

public class PC_LoginTestcases  extends CommonToAllTest {

    @Description("Verify login to PC with valid credentials")
    @Test(groups = {"smoke","regression"},priority = 1)
    public void LoginPositive(){
        LoginPage_POM loginPagePom= new LoginPage_POM();
        loginPagePom.openUrl();

        loginPagePom.LoginWithValidCred();

    }


    @Description("Verify login to PC with invalid username and verify error message")
    @Test(groups = {"smoke","regression"},priority = 2)
    public void LoginWithInvalidUsername(){
        LoginPage_POM loginPagePom= new LoginPage_POM();
        loginPagePom.openUrl();
        String error_message=loginPagePom.LoginWithInvalidCred1();
        Assert.assertEquals(error_message,"We couldn't find an account with that username.");

    }

    @Description("Verify login to PC with invalid password and verify error message")
    @Test(groups = {"smoke","regression"},priority = 3)
    public void LoginWithInvalidPassword(){
        LoginPage_POM loginPagePom= new LoginPage_POM();
        loginPagePom.openUrl();
        String error_message=loginPagePom.LoginWithInvalidCred2();
        System.out.println(error_message);
        Assert.assertEquals(error_message,"Your account or password is incorrect. If you don't remember your password, reset it now.");

    }





}
