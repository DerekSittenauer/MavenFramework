import org.openqa.selenium.WebElement;

public class OfferPage {

    String offerXPath = "//*[@id=\"collapse\"]/ul[1]/li[7]/a";
    String offerTitle = "Special Offers";

    BrowserDriver browser = BrowserDriver.getBrowser();

    //returns title of homepage
    public String testOffer() {

        browser.goTo("https://www.phptravels.net/");
        WebElement Offer = browser.findXPath(offerXPath);

        Offer.click();

        return browser.driver.getTitle();

    }
}
