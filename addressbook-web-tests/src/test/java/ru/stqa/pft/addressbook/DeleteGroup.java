package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class DeleteGroup extends TestBase {

    @Test
    public void testDeleteGroup() {
        gotoGroup();
        selectGroup();
        deleteGroup();
        returnGroup();
    }
}

