import org.openqa.selenium.WebElement;

public class VisaPage {

    String visaXPath = "//*[@id=\"collapse\"]/ul[1]/li[6]/a";
    String visaTitle = "Visa";

    BrowserDriver browser = BrowserDriver.getBrowser();

    //returns title of homepage
    public String testVisa() {

        browser.goTo("https://www.phptravels.net/");
        WebElement Visa = browser.findXPath(visaXPath);

        Visa.click();

        return browser.driver.getTitle();

    }
}
