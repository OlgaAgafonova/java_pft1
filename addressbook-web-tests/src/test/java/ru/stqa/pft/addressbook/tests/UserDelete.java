package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.UserData;

public class UserDelete extends TestBase{
  @Test
  public void testUserDelete(){
    app.getNavigationHelper().gotoHome();
    if(!app.getContactHelper().isThereAUser())
    {
       app.getContactHelper().creationUser(new UserData("Ivan_DELETE", "O", "Ivanov", "Ivushka", "lanit", "penza", "11", "20-30-40", "group2"));
    }
    app.getContactHelper().editUser();
    app.getContactHelper().deleteUser();
    app.getContactHelper().returnUser();
  }
}
