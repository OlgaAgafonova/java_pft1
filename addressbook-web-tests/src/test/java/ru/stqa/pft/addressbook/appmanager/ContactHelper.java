package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.UserData;

public class ContactHelper extends HelperBase {

  FirefoxDriver wd;

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void formUser(UserData userData) {

    type(By.name("firstname"), userData.getFirstname());
    type(By.name("middlename"), userData.getMiddlename());
    type(By.name("lastname"), userData.getLastname());
    type(By.name("nickname"), userData.getNickname());
    type(By.name("company"), userData.getCompany());
    type(By.name("address"), userData.getAddress());
    type(By.name("home"), userData.getHome());
    type(By.name("mobile"), userData.getMobile());
  }

  public void saveUser() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void formUser() {
    type(By.name("firstname"), "Ivan1");
    type(By.name("lastname"), "Ivanov1");
    type(By.name("nickname"), "case1");
  }


  public void initUser() {
    click(By.linkText("add new"));
  }

  public void returnUser() {
    click(By.linkText("home page"));
  }

  public void editUser() {
    click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
  }

  public void updateUser() {
    click(By.xpath("//div[@id='content']/form[1]/input[22]"));
  }

  public void deleteUser() {
    click(By.xpath("//div[@id='content']/form[2]/input[2]"));
  }
}
