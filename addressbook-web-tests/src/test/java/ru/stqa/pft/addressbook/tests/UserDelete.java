package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class UserDelete extends TestBase{
  @Test
  public void testUserDelete(){

    app.getNavigationHelper().gotoHome();
    app.getContactHelper().editUser();
    app.getContactHelper().deleteUser();
    app.getContactHelper().returnUser();
  }
}
