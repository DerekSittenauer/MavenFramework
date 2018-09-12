import org.openqa.selenium.WebElement;

public class HotelPage {
    String hotelXPath = "//*[@id=\"collapse\"]/ul[1]/li[2]/a";
    String hotelTitle = "Search Results";

    BrowserDriver browser = BrowserDriver.getBrowser();

    //returns title of homepage
    public String testHotel() {

        browser.goTo("https://www.phptravels.net/");
        WebElement Hotel = browser.findXPath(hotelXPath);

        Hotel.click();

        return browser.driver.getTitle();

    }
}
