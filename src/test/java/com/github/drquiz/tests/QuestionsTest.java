package com.github.drquiz.tests;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class QuestionsTest extends BaseTest{

    @Test
    public void testAmountOfQuestions() {
        $("#select").findAll("option").shouldHaveSize(6);
    }

    @Test
    public void testClickAmountOfQuestions() {
        $("#select").findAll("option").shouldHaveSize(6);
    }

    @Test
    public void selectAmountOfQuestions() {
        $("#select").selectOption("5 questions");
        $(By.xpath("//input[@value='Start Quiz']")).click();
        $$(".question").shouldHaveSize(5);
    }


}
