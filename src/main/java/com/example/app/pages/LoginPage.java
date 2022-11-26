package com.example.app.pages;

import static com.example.app.drivers.AndroidDriverInit.driver;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class LoginPage extends BasePageObject {

  public void inputUsername(String username) {
    type(MobileBy.id("username"), username);
  }
  public void inputPassword(String password) {
    type(MobileBy.id("password"), password);
  }
  public void clickLoginBtn() {
    click(MobileBy.id("login"));
  }

}
