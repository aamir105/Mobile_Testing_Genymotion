package SCreenerTestCases;

import Pages.LoginPage;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class LoginTest extends LoginPage {

    public LoginPage loginPage;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        setup();
        loginPage = new LoginPage();
    }


    @Test
    public void registerPage_test() throws InterruptedException {
        loginPage.login_operation();
    }

}