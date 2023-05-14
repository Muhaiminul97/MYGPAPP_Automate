package com.example.mygpapp;

import com.mygp.qa.base.base;
import com.mygp.qa.fragment.loginFragment;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Properties;


import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class loginFragmentTest extends base {
    loginFragment loginFragment;
    String valid = prop.getProperty("msisdn");
    String invalid = prop.getProperty("wrongMsIsdn");

    public loginFragmentTest() {
        super();
    }

    @BeforeTest
    public void setup() throws MalformedURLException {
        initialization();
        loginFragment = new loginFragment();
    }

    @Test
    public void loginJourney() {
        regularWait();
        loginFragment.SignIn.click();
        loginFragment.MsIsdn.click();
        loginFragment.MsIsdn.clear();


    }

    @Test(priority = 2)
    public void verifyMsisdn() {
        loginFragment.MsIsdn.sendKeys(invalid);
        loginFragment.continueBtn.click();

        String test = loginFragment.MsIsdn.getText();
        if(test.length()<13 || test.length()<11)
        {
            System.out.println(loginFragment.invalidMsIsdnError.getText());
        }
        else
        {
            loginFragment.MsIsdn.sendKeys(valid);

        }
        loginFragment.MsIsdn.clear();

        loginFragment.MsIsdn.sendKeys(valid);
        loginFragment.continueBtn.click();
        loginFragment.otp.click();
        loginFragment.otp.sendKeys(prop.getProperty("otp"));
        loginFragment.continueBtn.click();

        try{
            String balanceData = loginFragment.balance.getText();
            System.out.println(balanceData);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
