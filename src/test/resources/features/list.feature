Feature: Lists parameterization
  As a user
  I need to create or edition a list

  Background:
    Given I create or edition a list


  @TestListAdmin
  Scenario Outline: Successful list
    When I entering in the application with user <user> and password <password>
    And I entering lists parameterization
    And I select button edition lists parameterization
    And I type information in the lists parameterization with the roles <roles> and modules <options1>
    Then I view the modal save lists parameterization with <modalmessage>

    Examples:
      | user         | password       | roles | options1            |  |  |  |  |
      | sergio.anaya | Colombia_2023* | Admin | Afectación Personas |  |  |  |  |
