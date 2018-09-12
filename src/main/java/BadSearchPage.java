import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class BadSearchPage {

    String cityCSS = "span.select2-chosen";
    String locationCSS = "input.select2-input";
    String getCheckInXPath = "//*[@id=\"dpd1\"]/div/input";
    String checkOutXPath = "//*[@id=\"dpd2\"]/div/input";
    String searchXPath = "//*[@id=\"HOTELS\"]/form/div[5]/button";
    String homeTitle = "PHPTRAVELS | Travel Technology Partner";

    BrowserDriver browser = BrowserDriver.getBrowser();

    public String testBadSearch() {

        browser.goTo("https://www.phptravels.net/");
        WebElement city = browser.findCSS(cityCSS);
        WebElement location = browser.findCSS(locationCSS);
        WebElement checkInType = browser.findXPath((getCheckInXPath));
        WebElement checkOutType = browser.findXPath(checkOutXPath);
        WebElement search = browser.findXPath(searchXPath);

        city.click();
        location.sendKeys("Singapore");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        location.sendKeys(Keys.DOWN, Keys.ENTER);
        checkInType.sendKeys("gserfgrgdg");
        checkOutType.sendKeys("fckesifjsgiudrjngrd");
        search.click();

        return browser.driver.getTitle();
    }
}

