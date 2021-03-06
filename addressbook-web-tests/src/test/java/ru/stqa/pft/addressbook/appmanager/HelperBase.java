package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class HelperBase {
  protected WebDriver wd;

  public HelperBase(WebDriver wd) {
    this.wd = wd;
  }

  protected void click(By locator) {
    wd.findElement(locator).click();
  }

  protected void type(By locator, String text) {
    click(locator);
   if (text != null) {
     String existingText = wd.findElement(locator).getAttribute("value");// в переменную existingText присваиваем существующее значение в поле
      if (!text.equals(existingText))//сравниваем значение, которое было в поле с тем что хотим ввести, если значения совпали, то ничего не делаем, иначе
     {
        wd.findElement(locator).clear();//очищаем поле
        wd.findElement(locator).sendKeys(text);// вводим новое значение
    }
    }
  }

  public boolean isAlertPresent() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

 boolean isElementPresent(By locator) {
    try{//попытаться найти элемент по локатору
     wd.findElement(locator);
            return true;}
     catch (NoSuchElementException ex){
    return false;}
  }
}
