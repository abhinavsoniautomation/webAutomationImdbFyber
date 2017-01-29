package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.repo.ImdbTop;

import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: abhinav
 * Date: 30/01/17
 * Time: 12:23 AM
 * To change this template use File | Settings | File Templates.
 */
public class ImdbActions extends ImdbTop {

    ImdbTop imdbTop;

    public ImdbActions() {
        imdbTop= PageFactory.initElements(getDriver(), ImdbTop.class) ;
    }

    public void navigateTo(String imdbUrl) {
        getDriver().navigate().to(imdbUrl);
    }

    public void sortResults(String sortType) {
        imdbTop.sortButton.click();
        for(WebElement sorts:getAllSortOptions()){
            if(sorts.getText().contains(sortType)){
                sorts.click();
                break;
            }
        }
    }

    public void selectGenre(String genre){
        for(WebElement currentGenre:genres()){
            if(currentGenre.getText().contains(genre)){
                currentGenre.click();
                break;
            }
        }
    }

    public void decideSortOrder(String orderType) {
        if(getSortOrder(orderType).size()==1){
            getSortOrder(orderType).get(0).click();
        }
        else{
            System.out.println("Already in desired sort order");
        }
    }

    public boolean verifyNumberOfMovies(int number) {
        return moviesList().size()>=number;
    }

    public boolean verifyNumberOfMoviesAdvanced(int number) {
        return advancedMovieList().size()>=number;
    }
}
