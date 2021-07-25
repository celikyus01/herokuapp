package com.task.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InfiniteScrollPage extends BasePage{

    @FindBy(xpath = "//div[@style='text-align: center;']")
    public WebElement footer;

    @FindBy(xpath = "//*[.='Infinite Scroll']")
    public WebElement header;

    @FindBy(xpath = "//a[.='next page']")
    public WebElement nextPage;

}
