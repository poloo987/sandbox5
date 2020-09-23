package website.base_page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import website.utilities.Driver;
public class YT_HomePage {


    //the search box elements
    @FindBy(xpath = "//input[@id='search']")
    public WebElement search_box;

    @FindBy(xpath = "//button[@id='search-icon-legacy']")
    public WebElement search_button;
    //div[@aria-label='H']
    // ++++ side bar elements +++
    @FindBy(xpath = "//a[@aria-label='Home']")
    public WebElement home;

    @FindBy(xpath = "//a[@aria-label='Trending']")
    public WebElement trending;

    @FindBy(xpath = "//a[@aria-label='Subscriptions']")
    public WebElement subs;

    @FindBy(xpath = "//a[@aria-label='Library']")
    public WebElement library;

    @FindBy(xpath = "//a[@aria-label='History']")
    public WebElement history;


    String url_home_check = "https://www.youtube.com/";

    String url_trend_check = "https://www.youtube.com/feed/trending";

    String url_subs_check = "https://www.youtube.com/feed/subscriptions";

    String url_library_check = "https://www.youtube.com/feed/library";

    String url_history_check = "https://www.youtube.com/feed/history";
}


