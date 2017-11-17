package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class UserModificationTest extends TestBase {
  @Test
 public void testModificationTest(){

    app.getNavigationHelper().gotoHome();
    app.getContactHelper().editUser();
    app.getContactHelper().formUser();
    app.getContactHelper().updateUser();
    app.getContactHelper().returnUser();
  }
}
