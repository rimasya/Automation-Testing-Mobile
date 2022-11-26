package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class ListPage extends BasePageObject {

  public void swipeList() {

    AndroidElement element = find(MobileBy.AndroidUIAutomator(
        "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().text(\"List ke-61\"))"));

    }
  By elementLongPress = MobileBy.xpath("//android.widget.TextView[@text='List ke-9']");
  public void tapsLongPress(){
    longPress(elementLongPress);
  }
  public void multiplePress(){
    WebElement element= find(MobileBy.xpath("//android.widget.TextView[@text='List ke-9']"));
    getTouchAction().tap(TapOptions.tapOptions().withTapsCount(5).
            withElement(ElementOption.element(element))).perform();
  }

}
