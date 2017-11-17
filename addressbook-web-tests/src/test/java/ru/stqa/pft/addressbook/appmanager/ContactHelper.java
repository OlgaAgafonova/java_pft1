package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.UserData;

public class ContactHelper extends HelperBase {

  public ContactHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void formUser(UserData userData) {

    type(By.name("firstname"), userData.getFirstname());
    type(By.name("middlename"), userData.getMiddlename());
    type(By.name("lastname"),userData.getLastname());
    type(By.name("nickname"),userData.getNickname());
    type(By.name("company"),userData.getCompany());
    type(By.name("address"),userData.getAddress());
    type(By.name("home"),userData.getHome());
    type(By.name("mobile"),userData.getMobile());
  }

  public void saveUser() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void returnUser() {
    click(By.linkText("home page"));
  }

  public void initUser() {
    click(By.linkText("add new"));
  }
}
