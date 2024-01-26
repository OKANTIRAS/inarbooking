#Author: AO
#Date: 2024-02-01
#Description: This is a test case for smoke test

#Test Case: BK_HT_002
#Test Title: Validate the Hotel Search filters by Fitness Center

#Test Steps:
#1. Navigate to the URL: "test.inar-academy.com"
#2. Click on the Booking Link
#3. Click on the Hotel Tab
#4. Click on the Search Hotels Button
#5. Click on the Fittness Check Box on the left side
#6. Click on the first Hotel's See availability Button
#Validate the Hotel has the Fitness Center


@smoke @HotelFilter
Feature: Hotel Filtering

  Background:
    Given I navigate to the baseURL
    And I click on the Booking Link

  Scenario: Validate that the Hotel Search filters by Fitness Center

    When I click on the Hotel Tab
    And I click on the Search Hotels Button
    And I click on the "Fitness" Check Box on the left side
    And I click on the Search button on the left side
    And I click on the #1 Hotel's See availability Button
    Then I validate the Hotel has the "Fitness Center"


  Scenario: Validate that the Hotel Search filters by Free Parking

    When I click on the Hotel Tab
    And I click on the Search Hotels Button
    And I click on the "Free parking" Check Box on the left side
    And I click on the Search button on the left side
    And I click on the #1 Hotel's See availability Button
    Then I validate the Hotel has the "Free Parking"


  Scenario Outline: Validate that the Hotel Search filters by selected choice

    When I click on the Hotel Tab
    And I click on the Search Hotels Button
    And I click on the "<filter>" Check Box on the left side
    And I click on the Search button on the left side
    And I click on the #1 Hotel's See availability Button
    Then I validate the Hotel has the "<filter>"

    Examples:
      | filter         |
      | Free parking   |
      | Fitness center |
      | Free WiFi      |
      | Cycling        |