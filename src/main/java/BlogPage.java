import org.openqa.selenium.WebElement;

public class BlogPage {

    String blogXPath = "//*[@id=\"collapse\"]/ul[1]/li[8]/a";
    String blogTitle = "Blog";

    BrowserDriver browser = BrowserDriver.getBrowser();

    //returns title of homepage
    public String testBlog() {

        browser.goTo("https://www.phptravels.net/");
        WebElement Blog = browser.findXPath(blogXPath);

        Blog.click();

        return browser.driver.getTitle();

    }
}
