package com.example.asessment.pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.codeborne.selenide.Selenide.$;
//http://sfa-dev-2:9080/prweb

public class SFAAuthorization {
    private final Logger LOG = LoggerFactory.getLogger(SFAAuthorization.class);

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/windows/chromedriver.exe");
        Configuration.browser = "chrome";
    }

    SelenideElement userInput = $(By.cssSelector("#txtUserID"));
    SelenideElement passwordInput = $(By.cssSelector("#txtPassword"));
    SelenideElement authButton = $(By.cssSelector("#sub"));

    public void sendAuthText(String user, String password) {
        userInput.sendKeys(user);
        passwordInput.sendKeys(password);
        authButton.click();
        LOG.info("Авторизовались с данными: " + user + ", " + password);
    }

}
