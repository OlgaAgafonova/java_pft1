package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.UserData;

public class UserModificationTest extends TestBase {
  @Test
 public void testModificationTest(){

    app.getNavigationHelper().gotoHome();
    app.getContactHelper().editUser();
    app.getContactHelper().formUser(new UserData("Ivan", "Oj", "Ivanov1", "Ivushka1", "lanit1", "penza1", "11-1", "20-30-41",null),false);
    app.getContactHelper().updateUser();
    app.getContactHelper().returnUser();
  }
}
