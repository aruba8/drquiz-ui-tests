package com.github.drquiz.tests;

import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ScrollTest extends BaseTest {


    @Test
    public void scrollTest() {
        $("#select").selectOption("10 questions");
        $(By.xpath("//input[@value='Start Quiz']")).click();
        $$(".question").shouldHaveSize(10);
        $(By.xpath("//a[text()='Check answers']")).scrollTo().click();
        $(By.xpath("//div[p[text()='Ok. I think you can better than this. Try again!']]")).shouldBe(Condition.visible);
    }
}
