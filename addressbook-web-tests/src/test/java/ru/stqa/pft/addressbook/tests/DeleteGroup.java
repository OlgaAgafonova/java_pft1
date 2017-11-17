package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

//наследование DeleteGroup от TestBase
public class DeleteGroup extends TestBase {

    @Test
    public void testDeleteGroup() {
        app.getNavigationHelper().gotoGroup();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteGroup();
        app.getGroupHelper().returnGroup();
    }
}

