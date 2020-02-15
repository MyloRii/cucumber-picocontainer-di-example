package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;

import static org.junit.Assert.assertTrue;

public class HomePageSteps {

    private HomePage homePage;

    public HomePageSteps(HomePage homePage) {
        this.homePage = homePage;
    }

    @Given("User is on home page")
    public void userIsOnHOmePage() {
        assertTrue(homePage.isHomePageOpened());
    }

    @When("User navigated to page object model page")
    public void userNavigatedToPageObjectModelPage() {
        homePage.openPageObjectModelPage();
    }
}
