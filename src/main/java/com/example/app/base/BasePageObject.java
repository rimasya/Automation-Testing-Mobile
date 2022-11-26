package com.example.app.base;

import com.example.app.drivers.AndroidDriverInit;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;

import java.time.Duration;

public class BasePageObject {

  public AndroidDriver<AndroidElement> getDriver(){
    return AndroidDriverInit.driver;
  }

  public AndroidElement find(By by){
    return getDriver().findElement(by);
  }

  public void type(By by, String text){
    AndroidElement element = find(by);
    element.clear();
    element.sendKeys(text);
  }

  public void click(By by){
    find(by).click();
  }

  public String getText(By by){
    return find(by).getText();
  }

  public boolean isDisplayed(By by){
    return find(by).isDisplayed();
  }

  TouchAction touchAction;
  public TouchAction getTouchAction(){
    touchAction = new TouchAction(getDriver());
    return touchAction;
  }
  public void longPress(By elementToLongPress){
    getTouchAction().longPress(PointOption.point(find(elementToLongPress).getCenter()))
            .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
            .release().perform();
  }

}

//  public void multipleTaps(){
//    WebElement element= find(MobileBy.xpath("//android.widget.TextView[@text=\"List ke-80\"]"));
//    TouchAction action = new TouchAction(getDriver());
//    action.tap(TapOptions.tapOptions().withTapsCount(5)
//            .withElement(ElementOption.element(element))).perform();
//  }