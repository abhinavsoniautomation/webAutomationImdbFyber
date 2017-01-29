Feature:Fyber Challenge


  Background: Navigate/Land to cleartrip website
    Given I navigate to imdb top movies page

  #Feaure file- Following the BDD
  #You can add more scenarios/use cases to this scenario outline by adding more example tables by changing the given parameters
  @fyberChallenge @abhinavSoni
  Scenario Outline: verifying movie results with different sort and genre options
    And I check movie results has at least "<numberOfMovies>"
    When I sort the results by "<sortBy>" with "<sortOrder>"
    And I check movie results has at least "<numberOfMovies>"
    And I Select the "<genre>"
    Then I verify the movie results after genre "<numberOfMovies>"
    Examples:
    |sortBy           | sortOrder         | genre    |  numberOfMovies  |
    |Number of Ratings| descending        | Western  |    1             |
    |Number of Ratings| ascending         | Western  |    1            |
    |Ranking          | ascending         | Western  |    1            |
    |Ranking          | descending        | Western  |    1            |
    |IMDd Ranking     | ascending         | Western  |    1            |
    |IMDd Ranking     | descending        | Western  |    1            |
    |Release Date     | ascending         | Western  |    1            |
    |IMDd Ranking     | descending        | Western  |    1            |
    |Your Ranking     | ascending         | Western  |    1            |
    |Your Ranking     | descending        | Western  |    1            |

    ## We can add more use cases by just changing the example parameters like etc etc
    |Number of Ratings| descending        | Action |    1             |

