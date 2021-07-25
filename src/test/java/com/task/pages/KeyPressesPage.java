package com.task.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KeyPressesPage extends BasePage {
    @FindBy(xpath = "//input")
    public WebElement inoutBox;

    @FindBy(id = "result")
    public WebElement result;

    public String getKey(String key) {

        switch (key) {
            case "/":
                key = "SLASH";
                break;
            case ",":
                key = "COMMA";
                break;
            case "?":
                key = "QUESTION MARK";
                break;

        }

        return "You entered: "+key;

    }

}
