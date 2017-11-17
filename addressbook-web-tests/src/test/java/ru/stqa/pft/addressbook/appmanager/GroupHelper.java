package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupHelper extends HelperBase{

  public GroupHelper(WebDriver wd) {
    super(wd);
  }

  public void returnGroup() {
    click(By.linkText("group page"));
  }

  public void saveGroup() {
    click(By.name("submit"));
  }

  //параметр groupData объединяет в себе все атрибуты, которые надо заполнять, чтобы их не перечислять все они вынесены в отдельный класс
  public void formGroup(GroupData groupData) {
    type(By.name("group_name"), groupData.getGroup_name());
    type(By.name("group_header"), groupData.getGroup_header());
    type(By.name("group_footer"), groupData.getGroup_footer());

  }

  public void initGroup() {
    click(By.name("new"));
  }

  public void deleteGroup() {
    click(By.xpath("//div[@id='content']/form/input[5]"));
  }

  public void selectGroup() {
    click(By.name("selected[]"));
  }

  public void initGroupModification() {
    click(By.name("edit"));
  }

  public void submitGroupModification() {
    click(By.name("update"));
  }
}
