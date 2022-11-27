@Step1
Feature: Finding Clarivate
  Scenario: Go to Clarivate website from Google

    Given Open Google Chrome
    When I search for "Clarivate" and click on Clarivate link
    Then I am redirected to Clarivate website