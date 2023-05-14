package com.mygp.qa.fragment;

import static com.mygp.qa.base.base.driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginFragment {
    @FindBy(id = "com.portonics.mygp.debug:id/tvText")
    public WebElement SignIn;

    @FindBy(id="com.portonics.mygp.debug:id/etMsisdn")
    public WebElement MsIsdn;

    @FindBy(id = "com.portonics.mygp.debug:id/btn")
    public WebElement continueBtn;
    @FindBy(id = "com.portonics.mygp.debug:id/etCode")
    public WebElement otp;
    @FindBy(id = "com.portonics.mygp.debug:id/UserBalance")
    public WebElement balance;
    @FindBy(id = "com.portonics.mygp.debug:id/tvSignError")
    public WebElement invalidMsIsdnError;
    public loginFragment() {
        PageFactory.initElements(driver, this);
    }


}
