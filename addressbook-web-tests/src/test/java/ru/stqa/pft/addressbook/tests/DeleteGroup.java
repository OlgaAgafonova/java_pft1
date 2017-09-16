package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

//наследование DeleteGroup от TestBase
public class DeleteGroup extends TestBase {

    @Test
    public void testDeleteGroup() {
        app.gotoGroup();
        app.selectGroup();
        app.deleteGroup();
        app.returnGroup();
    }
}

