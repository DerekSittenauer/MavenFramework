import org.openqa.selenium.WebElement;

public class TourPage {
    String tourXPath = "//*[@id=\"collapse\"]/ul[1]/li[4]/a";
    String tourTitle = "Tours Listings";

    BrowserDriver browser = BrowserDriver.getBrowser();

    //returns title of homepage
    public String testTour() {

        browser.goTo("https://www.phptravels.net/");
        WebElement Tour = browser.findXPath(tourXPath);

        Tour.click();

        return browser.driver.getTitle();

    }
}
