import org.openqa.selenium.WebElement;

public class CarPage {

    String carXPath = "//*[@id=\"collapse\"]/ul[1]/li[5]/a";
    String carTitle = "Cars Listings";

    BrowserDriver browser = BrowserDriver.getBrowser();

    //returns title of homepage
    public String testCar() {

        browser.goTo("https://www.phptravels.net/");
        WebElement Car = browser.findXPath(carXPath);

        Car.click();

        return browser.driver.getTitle();

    }
}
