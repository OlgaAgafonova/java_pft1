package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.UserData;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void initUser() {
    click(By.linkText("add new"));
  }

 public void formUser(UserData userData,boolean creation) {
   type(By.name("firstname"), userData.getFirstname());
   type(By.name("middlename"), userData.getMiddlename());
   type(By.name("lastname"), userData.getLastname());
   type(By.name("nickname"), userData.getNickname());
   type(By.name("company"), userData.getCompany());
   type(By.name("address"), userData.getAddress());
   type(By.name("home"), userData.getHome());
   type(By.name("mobile"), userData.getMobile());
//   type(By.name("new_group"), userData.getNew_group());

    if (creation)//если открыта форма создания контакта, то должен отображаться выпадающий список с группами
    {
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(userData.getNew_group());
    } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }// если редактирование контакта, то списка с группами быть не должно

  }

  public void saveUser() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void returnUser() {
    click(By.linkText("home"));
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

  public void creationUser(UserData user) {
    initUser();
    formUser(user,true);
    saveUser();
    returnUser();
  }

    public boolean isThereAUser() {
    return isElementPresent(By.name("selected[]"));
  }
}
