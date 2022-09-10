@loginpage @sanity
Feature: login feature
  standard user
  locked out user
  problem user
  performance glitch user

  @standarduser @lockedoutuser @problemuser @performanceglitchuser
  Scenario Outline: Login with Problem User and Performance glitch user
    Given user enter user name '<username>'
    And user enter password '<password>'
    When user click on signin button
    Then user can login successfully

    Examples: 
      | username                |  | password     |
      | standard_user           |  | secret_sauce |
      | locked_out_user         |  | secret_sauce |
      | problem_user            |  | secret_sauce |
      | performance_glitch_user |  | secret_sauce |