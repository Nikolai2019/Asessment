package com.example.asessment.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.example.asessment.pages.SFAAuthorization;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

//Обязательно должно быть подключение к сети банка

public class SFAAuthorizationTest {

    SFAAuthorization SFAAuthorization = new SFAAuthorization();

    @BeforeEach
    public void setUp() {
        Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");
        open("http://sfa-dev-2:9080/prweb");
    }

    @Test
    @DisplayName("Проверка авторизации в SFA")
    public void sfaAuthTest() {
        SFAAuthorization.sendAuthText("RUM0PPK", "rules");
        $("span>a[data-test-id='2015012008382704536517']").shouldHave((Condition.text("Оповещения")));
    }
}
