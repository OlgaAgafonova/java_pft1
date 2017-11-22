package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

//наследование NewGroup от TestBase
public class NewGroup extends TestBase {

    @Test
    public void testNewGroup() {
//методы
        app.getNavigationHelper().gotoGroup();
        app.getGroupHelper().initGroup();
        app.getGroupHelper().formGroup(new GroupData("group1", null, null));
        app.getGroupHelper().saveGroup();
        app.getGroupHelper().returnGroup();
    }
}
