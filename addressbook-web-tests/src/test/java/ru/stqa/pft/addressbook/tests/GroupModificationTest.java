package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupModificationTest extends TestBase{
  @Test
  public void testGroupModification(){
    app.getNavigationHelper().gotoGroup();
    if (!app.getGroupHelper().isThereAGroup()){//если групп нет в списке(проверяем наличие чек-бокса для выбора группы с помощью isThereAGroup)
      app.getGroupHelper().createGroup(new GroupData("group2", null, null));//тогда создаем группу, а затем удаляем ее
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().formGroup(new GroupData("group-new", "1", "2"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnGroup();
  }
}
