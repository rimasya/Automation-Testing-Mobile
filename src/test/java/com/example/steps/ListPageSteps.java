package com.example.steps;

import com.example.BaseTest;
import com.example.app.pages.ListPage;
import io.cucumber.java.en.And;

public class ListPageSteps extends BaseTest {

  ListPage listpage = new ListPage();

  @And("user do scroll")
  public void userDoScroll() {
    listPage.swipeList();
  }

  @And("taps long press at list")
  public void tapsLongPressAtList() {
    listPage.tapsLongPress();
  }

  @And("taps at list ke 9")
  public void tapsAtListKe() {
    listPage.multiplePress();
  }
}
