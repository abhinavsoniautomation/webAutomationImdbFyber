package runnner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import initializers.BrowserInitializer;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import pages.repo.ImdbTop;

/**
 * Created with IntelliJ IDEA.
 * User: abhinav
 * Date: 31/01/17
 * Time: 12:15 AM
 * To change this template use File | Settings | File Templates.
 */


//Custom test runner
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/" ,
        glue = "classpath:cucumberTestSteps" ,
        tags="@fyberChallenge"
)
public class FyberRunner {

    //Invoking browser
    @BeforeClass
    public static void setUpTest() throws Exception {
        ImdbTop.setDriver(BrowserInitializer.initializeBrowser());
        ImdbTop.getDriver().manage().window().maximize();
    }

    //Tearing down when the test completes
    @AfterClass
    public static void tearDown() throws Exception {
        ImdbTop.getDriver().quit();
        System.out.println("All tests Completed");
    }
}
