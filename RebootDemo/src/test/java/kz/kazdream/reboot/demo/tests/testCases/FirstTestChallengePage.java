package kz.kazdream.reboot.demo.tests.testCases;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Text;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;


import javax.print.attribute.HashDocAttributeSet;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FirstTestChallengePage {

    private SelenideElement firstName = $("#firstname");
    private SelenideElement submitButton = $(".button");
    private ElementsCollection checkFoundList = $$(".values-description li");
    private SelenideElement valuesCases = $(".values-tested");

    public FirstTestChallengePage submitForm() {
        submitButton.click();
  /*  Selenide.Wait().until(ExpectedConditions(visible));*/
        return this;

    }


    public FirstTestChallengePage setFirstName(String text) {

        firstName.click();

        for (int i =0; i<20; i++)
        {firstName.sendKeys(text);
            String x = firstName.getValue();
            if(text.equals(x)) {
                break;
            }
        }

        return this;
    }

    private int getSizeFoundList() {
        return checkFoundList.size();
    }

    public FirstTestChallengePage checkCase(String message) {
        checkFoundList.first().shouldHave(text(message));
        return this;
    }

    public FirstTestChallengePage checkCountCases() {
        valuesCases.shouldHave(text(String.valueOf(getSizeFoundList())));
        return this;
    }


}
