package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.UserData;

public class NewUser extends TestBase{

    @Test
    //конструктор
    public void testNewUser() {
//медоты
        app.getContactHelper().initUser();
        app.getContactHelper().formUser(new UserData("Ivan", "Oj", "Ivanov", "Ivushka", "lanit", "penza", "11", "20-30-40"));
        app.getContactHelper().saveUser();
        app.getContactHelper().returnUser();
    }

}
