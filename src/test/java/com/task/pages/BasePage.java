package com.task.pages;

import com.task.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public abstract class  BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }


    public void navigateToMenu(String textOfWebElement){

        Driver.get().findElement(By.xpath("//a[.='"+textOfWebElement+"']")).click();

    }

    public String getMainTitle(){
        return Driver.get().findElement(By.xpath("//h2")).getText();
    }

    public void clickButton(String buttonName){
        Driver.get().findElement(By.xpath("//i[normalize-space()='"+buttonName+"']")).click();
    }



}
