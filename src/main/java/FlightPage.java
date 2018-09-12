import org.openqa.selenium.WebElement;

public class FlightPage {

    String flightXPath = "//*[@id=\"collapse\"]/ul[1]/li[3]/a";
    String flightTitle = "Flights List";

    BrowserDriver browser = BrowserDriver.getBrowser();

    //returns title of homepage
    public String testFlight() {

        browser.goTo("https://www.phptravels.net/");
        WebElement Flight = browser.findXPath(flightXPath);

        Flight.click();

        return browser.driver.getTitle();

    }
}
