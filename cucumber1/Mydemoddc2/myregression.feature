Feature: My validations on american express
  I want to use this template for my feature file

  @regression
  Scenario: I want to logIn
    Given  I have account 
    And I will provide data
    Then my logIn success
  @regression @smoke
  Scenario: I want to give my mebership
    Given I have logged In 
    Then I click on  reward points 
    And I will check for my rewards
   @sanity @smoke
    Scenario: I want to refer my friend
    Given I am offered with referal bonus
    When I shared the link with  my friend 
    Then I will get some zeta points
    Then I will enjoy my friday party
