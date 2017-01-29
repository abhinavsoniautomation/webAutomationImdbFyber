package pages.repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: abhinav
 * Date: 30/01/17
 * Time: 12:20 AM
 * To change this template use File | Settings | File Templates.
 */
public class ImdbTop {
    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        ImdbTop.driver = driver;
    }

    public static WebDriver driver;

    public WebDriverWait webDriverWait;

    public List<WebElement> moviesList(){
        return getDriver().findElements(By.cssSelector("[data-caller-name='chart-top250movie'] tr"));
    }

    @FindBy(css=".lister-sort-by")
    public WebElement sortButton;

    public List<WebElement> getAllSortOptions(){
        return getDriver().findElements(By.cssSelector(".lister-sort-by option"));
    }

    public List<WebElement> genres(){
        return getDriver().findElements(By.cssSelector(".quicklinks>li>a"));
    }

    public List<WebElement>  advancedMovieList(){
        return getDriver().findElements(By.cssSelector(".lister-list .lister-item"));
    }

    public List<WebElement> getSortOrder(String order){
        return getDriver().findElements(By.cssSelector(".lister-sort-reverse."+order+""));
    }
}
