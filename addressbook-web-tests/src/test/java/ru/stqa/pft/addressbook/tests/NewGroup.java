package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

//наследование NewGroup от TestBase
public class NewGroup extends TestBase {

    @Test
    public void testNewGroup() {
//методы
        app.gotoGroup();
        app.initGroup();
        app.formGroup(new GroupData("group2", "22", "33"));
        app.saveGroup();
        app.returnGroup();
    }

}
