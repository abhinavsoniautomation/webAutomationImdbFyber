package cucumberTestSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.actions.ImdbActions;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: abhinav
 * Date: 30/01/17
 * Time: 12:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class ImdbFyberSteps {

    ImdbActions imdbActions=new ImdbActions();

    public String imdbUrl="http://www.imdb.com/chart/top";

    @Given("^I navigate to imdb top movies page$")
    public void navigateToTopPage(){
        imdbActions.navigateTo(imdbUrl);
    }

    @And("^I sort the results by \"([^\"]*)\" with \"([^\"]*)\"$")
    public void sortBy(String sortType,String orderType){
        imdbActions.sortResults(sortType);
        imdbActions.decideSortOrder(orderType);
    }

    @And("^I Select the \"([^\"]*)\"$")
    public void selectGenre(String genre){
        imdbActions.selectGenre(genre);
    }

    @And("^I check movie results has at least \"([^\"]*)\"$")
    public void checkMovies(String numberOfMovies){
        assertThat(imdbActions.verifyNumberOfMovies(Integer.parseInt(numberOfMovies))).describedAs("Number of movies are less then, failed search").isTrue();
    }

    @Then("^I verify the movie results after genre \"([^\"]*)\"$")
    public void checkMoviesAfterGnere(String numberOfMovies){
        assertThat(imdbActions.verifyNumberOfMoviesAdvanced(Integer.parseInt(numberOfMovies))).describedAs("Number of movies are less then, failed search").isTrue();
    }
}
