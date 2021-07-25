package com.task.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormAuthPage extends BasePage {
    @FindBy(xpath = "//button[normalize-space()='Login']")
    public WebElement loginButton;

    @FindBy(id = "username")
    public WebElement userNameInputBox;

    @FindBy(id = "password")
    public WebElement passwordinputBox;


    public void login(String username, String password) {
        userNameInputBox.sendKeys(username);
        passwordinputBox.sendKeys(password);
        loginButton.click();
    }


}
