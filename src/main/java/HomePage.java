import org.openqa.selenium.WebElement;

public class HomePage {

    String homeXPath = "//*[@id=\"collapse\"]/ul[1]/li[1]/a";
    String homeTitle = "PHPTRAVELS | Travel Technology Partner";

    BrowserDriver browser = BrowserDriver.getBrowser();

    //returns title of homepage
    public String testHome() {

        browser.goTo("https://www.phptravels.net/");
        WebElement Home = browser.findXPath(homeXPath);

        Home.click();

        return browser.driver.getTitle();

    }
}
