package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.PageObjectModelPage;

import static org.junit.Assert.assertTrue;

public class PageObjectModelSteps {

    private PageObjectModelPage pageObjectModelPage;

    public PageObjectModelSteps(PageObjectModelPage pageObjectModelPage) {
        this.pageObjectModelPage = pageObjectModelPage;
    }

    @Then("User is on page object model page")
    public void userIsOnHOmePage() {
        assertTrue(pageObjectModelPage.isPageObjectModelPageOpened());
    }
}
