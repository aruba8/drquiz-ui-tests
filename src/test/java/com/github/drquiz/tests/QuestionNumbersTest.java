package com.github.drquiz.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;

import java.util.Arrays;
import java.util.Collection;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

@RunWith(Parameterized.class)
public class QuestionNumbersTest extends BaseTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {5, "5 questions"},
                {10, "10 questions"},
                {20, "20 questions"},
                {30, "30 questions"},
                {35, "35 questions"},
                {40, "40 questions"},
        });
    }

    private int numberOfQuestions;
    private String selector;

    public QuestionNumbersTest(int numberOfQuestions, String selector) {
        this.numberOfQuestions = numberOfQuestions;
        this.selector = selector;
    }

    @Test
    public void selectAmountOfQuestions() {
        $("#select").selectOption(selector);
        $(By.xpath("//input[@value='Start Quiz']")).click();
        $$(".question").shouldHaveSize(numberOfQuestions);
        $(By.xpath("//input[@value='Restart Quiz']")).click();
        $$(".question").shouldHaveSize(numberOfQuestions);
    }
}
