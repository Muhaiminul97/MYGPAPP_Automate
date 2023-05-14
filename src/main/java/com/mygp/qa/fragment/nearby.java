package com.mygp.qa.fragment;

import static com.mygp.qa.base.base.driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class nearby {
    @FindBy (xpath = "android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.ImageView")
    WebElement star;
}
