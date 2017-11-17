package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupModificationTest extends TestBase{
  @Test
  public void testGroupModification(){
    app.getNavigationHelper().gotoGroup();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().formGroup(new GroupData("group-new", "22-new", "33-new"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnGroup();
  }
}
