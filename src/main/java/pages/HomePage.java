package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.cssSelector;

@Getter
public class HomePage {

    private static final String PAGE_TITLE = "WebDriverUniversity.com";

    public boolean isHomePageOpened() {
        return Wait().until(WebDriver::getTitle).equals(PAGE_TITLE);
    }

    public PageObjectModelPage openPageObjectModelPage() {
        $(cssSelector("#page-object-model h1")).click();
        switchTo().window("WebDriver | Page Object Model");
        return new PageObjectModelPage();
    }

}