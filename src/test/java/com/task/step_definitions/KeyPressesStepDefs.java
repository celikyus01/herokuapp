package com.task.step_definitions;

import com.task.pages.KeyPressesPage;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.Locale;
import java.util.Map;

public class KeyPressesStepDefs {
    @When("the user sends below keys and verify them")
    public void the_user_sends_below_keys_and_verify_them(Map<String, String> dataTable) {

        KeyPressesPage keyPressesPage = new KeyPressesPage();


        for (String key : dataTable.keySet()) {

            keyPressesPage.inoutBox.sendKeys(key.toUpperCase(Locale.ROOT));
            String expected = keyPressesPage.getKey(key.toUpperCase());
            WebElement actual = keyPressesPage.result;
            Assert.assertEquals("FAIL: Entered Key and the result dont match!! ",expected,actual.getText());

        }



    }




}
