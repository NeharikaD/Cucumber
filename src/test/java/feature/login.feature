Feature:login feature

  Background: user validate the Login page of LoanInsight web Application
  Given user navigate to LoanInsight Home page
  Then user click on Login

    #tc-01
    @testLogin
  Scenario: Login to LoanInsight web application
    Given user enter the username & password
    And user click on submit
#    Then user should display the validation message

      #tc-02,03,04
  @testLogin
  Scenario Outline: Validate the Login of LoanInsight web application
    When user enter the username "<username>" & password "<password>"
    And user click on submit
#    Then user should display the validation status as Fail
    Examples:
      | username |           |password|
      |tester.tp@gmail.com|  |               |
      |                   |  |Techpundits@123|
      |                   |  |               |

    #tc-05,06,07,08,09,10
  @testLogin
  Scenario Outline: Validate the Login of LoanInsight web application
    When user enter the invalid username "<username>" & valid password "<password>"
    And user click on submit
#    Then user should display the validation status as Fail
    Examples:
      | username|            | password |
      |tester.tpgmail.com|   |Techpundits@123|
      |tester.@tp@gmail.com| |Techpundits@123|
      |tester.tp$gmail.com|  |Techpundits@123|
      |tester.tp gmail.com|  |Techpundits@123|
      |tester.tp@gmail.com;tester.tp123@gmail.com|  |Techpundits@123|
      |tester.tp@gasasmail.com| |Techpundits@123|

    #tc-11,12,13
  @testLogin
  Scenario Outline: Validate the Login of LoanInsight web application
    When user enter the valid username "<username>" & invalid password "<password>"
    And user click on submit
    Examples:
      | username |           |password |
      |tester.tp@gmail.com|   |techpundits|
      |tester.tp@gmail.com|   |123|
      |tester.tp@gmail.com|   |T@1|



