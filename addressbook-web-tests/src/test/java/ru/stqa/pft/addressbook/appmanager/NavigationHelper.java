package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

  public NavigationHelper(WebDriver wd) {
    super(wd);
  }

  public void gotoGroup() {//переход на страницу с группами, проверка того, что возможно эта страница уже открыта
    if (isElementPresent(By.tagName("h1"))
            && wd.findElement(By.tagName("h1")).getText().equals("Groups")
            && isElementPresent(By.name("new"))) {
      return;// если все условия выполнены, то выход из этого метода
    }

    click(By.linkText("groups"));//иначе переход на нужную страницу
  }

 // private boolean isElementPresent(By h1) {
    //return false;
 // }

  public void gotoHome() {
   if (isElementPresent(By.id("maintable"))) {
  return;}

    click(By.linkText("home"));}
  }

