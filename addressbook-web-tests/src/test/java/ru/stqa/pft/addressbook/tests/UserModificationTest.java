package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.UserData;

public class UserModificationTest extends TestBase {
  @Test
  public void testModificationTest() {

    app.getNavigationHelper().gotoHome();
    if (!app.getContactHelper().isThereAUser()) {
        app.getContactHelper().creationUser(new UserData("Ivan_MOD", "Oj", "Ivanov", "Ivushka", "lanit", "penza", "11", "20-30-40", "group2"));
    }
    app.getContactHelper().editUser();
    app.getContactHelper().formUser(new UserData("Ivan_Modification", "O1", "Ivanov1", "Ivushka1", "lanit1", "penza1", "11-1", "20-30-41", null), false);
    app.getContactHelper().updateUser();
    app.getContactHelper().returnUser();
  }
}
