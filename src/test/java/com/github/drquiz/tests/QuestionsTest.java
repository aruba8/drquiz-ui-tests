package com.github.drquiz.tests;

import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;

public class QuestionsTest extends BaseTest {

    @Test
    public void testAmountOfQuestions() {
        $("#select").findAll("option").shouldHaveSize(6);
    }

    @Test
    public void testClickAmountOfQuestions() {
        $("#select").findAll("option").shouldHaveSize(6);
    }

}
