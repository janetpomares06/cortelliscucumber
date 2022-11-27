Feature: Cortellis login url is correct
  Scenario: Check Cortellis login page URL is the one provided https://access.cortellis.com/login?app=cmc

    Given A URL is provided
    When Found Clarivate in a Google search and navigate through Clarivate pages to Cortellis home page
    Then Access to Cortellis login page and check the URL