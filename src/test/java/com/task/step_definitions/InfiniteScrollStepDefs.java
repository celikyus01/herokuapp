package com.task.step_definitions;

import com.task.pages.InfiniteScrollPage;
import com.task.utilities.BrowserUtils;
import com.task.utilities.Driver;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class InfiniteScrollStepDefs {

    @When("the user scroll down to the bottom of the page")
    public void theUserScrollDownToTheBottomOfThePage() {
        // BrowserUtils.scrollToElement(new InfiniteScrollPage().nextPage);
        //BrowserUtils.scrollToButtom();
        Actions a = new Actions(Driver.get());
        a.moveToElement(new InfiniteScrollPage().footer);

    }


    @When("the user scroll down to the top of the page")
    public void theUserScrollDownToTheTopOfThePage() {

        BrowserUtils.scrollToElement(new InfiniteScrollPage().header);
    }


}
