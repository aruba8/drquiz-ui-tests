package com.github.qrquiz;

import com.codeborne.selenide.Selectors;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class QuestionsTest {


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/Erik/distribs/chrome/chromedriver");
        open("http://drquiz.zapto.org/");
    }

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
