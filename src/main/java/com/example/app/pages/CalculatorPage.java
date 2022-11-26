package com.example.app.pages;

import static com.example.app.drivers.AndroidDriverInit.driver;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CalculatorPage extends BasePageObject {

  public String getTitle() {

    return getText(MobileBy.xpath("//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView"));

  }
  By elementPlusButton = MobileBy.xpath("//android.widget.TextView[@text='+']");
  By elementMinusButton = MobileBy.xpath("//android.widget.TextView[@text='-']");
  By elementDividedButton = MobileBy.xpath("//android.widget.TextView[@text='/']");
  By elementMultiplyButton = MobileBy.xpath("//android.widget.TextView[@text='*']");

  By elementInputNumberA = MobileBy.id("com.isl.simpleapp:id/et_1");
  By elementInputNumberB = MobileBy.id("com.isl.simpleapp:id/et_2");

  By elementDropdown = MobileBy.id("com.isl.simpleapp:id/spinner_1");
  By elementEquals = MobileBy.id("com.isl.simpleapp:id/acb_calculate");
  By elementResult = MobileBy.id("com.isl.simpleapp:id/tv_result");

  public void inputNumberA (int value){
    type(elementInputNumberA,Integer.toString(value));
  }
  public void inputNumberB (int value){
    type(elementInputNumberB,Integer.toString(value));
  }

  public void tapsDropdown(){
    click(elementDropdown);
  }
  public void tapsEquals(){
    click(elementEquals);
  }
  public String getResult(){
    return getText(elementResult);
  }


  public void tapsPlusButton(){
    click(elementPlusButton);
  }
  public void tapsMinusButton(){
    click(elementMinusButton);
  }
  public void tapsDividedButton(){
    click(elementDividedButton);
  }
  public void tapsMultiplyButton(){
    click(elementMultiplyButton);
  }
  public boolean checkHamburgerBtnAppear() {

    //explicit wait
    By locator = MobileBy.AccessibilityId("Open navigation drawer");
    WebDriverWait wait = new WebDriverWait(driver, 10, 1000);
    AndroidElement hamburgerBtn = (AndroidElement) wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    return hamburgerBtn.isDisplayed();
  }

}
