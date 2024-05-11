package tests;

import com.testing.basetest.CommonToAllTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageObjectModel.Dashboard_POM;
import pages.PageObjectModel.LoginPage_POM;

public class DashboardPage_TestCases extends CommonToAllTest {

    @Test(groups = {"regression"},priority = 1)
    public void testCartLinkOnDashboadrdPage(){
        LoginPage_POM loginPagePom=new LoginPage_POM();
        loginPagePom.openUrl();
        loginPagePom.LoginWithValidCred();
        Dashboard_POM dashboardPom=loginPagePom.afterLoginToPC();
        String cartName=dashboardPom.testAllCartsLink();
       Assert.assertEquals(cartName,"All Carts");

    }

    @Test(groups = {"regression"},priority = 2)
    public void testAllOrdersLinkOnDashboadrdPage(){
        LoginPage_POM loginPagePom=new LoginPage_POM();
        loginPagePom.openUrl();
        loginPagePom.LoginWithValidCred();
        Dashboard_POM dashboardPom=loginPagePom.afterLoginToPC();
        String OrderLabel=dashboardPom.testAllOrdersLink();
        Assert.assertEquals(OrderLabel,"Orders");

    }


}
