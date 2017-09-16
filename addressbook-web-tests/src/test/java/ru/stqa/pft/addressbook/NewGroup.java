package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class NewGroup extends TestBase {

    @Test
    public void testNewGroup() {
//методы
        gotoGroup();
        initGroup();
        formGroup(new GroupData("group2", "22", "33"));
        saveGroup();
        returnGroup();
    }

}
