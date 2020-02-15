package pages;

import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.Wait;

public class PageObjectModelPage {

    private static final String PAGE_TITLE = "WebDriver | Page Object Model";

    public boolean isPageObjectModelPageOpened() {
        return Wait().until(WebDriver::getTitle).equals(PAGE_TITLE);
    }
}
