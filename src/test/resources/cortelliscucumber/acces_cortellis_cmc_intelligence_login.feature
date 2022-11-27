@Step4
Feature: Access Cortellis CMC Intelligence login page
  Scenario: Got to Cortellis CMC Intelligence login page and check the url is https://access.cortellis.com/login?app=cmc

    Given Go to Login in Cortellis CMC Intelligence
    When Click on Cortellis CMC Intelligence login link in Cortellis product
    Then You are redirected to  Cortellis CMC Intelligence login page and URL is https://access.cortellis.com/login?app=cmc