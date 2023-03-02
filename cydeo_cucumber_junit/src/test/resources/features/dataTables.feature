Feature: Examples of Cucumber data table implementations
  @wip
  Scenario: List of fruits I like
    Then user should see fruits I like
      | kiwi     |
      | banana   |
      | orange   |
      | cucumber |
      | mango    |

    #to beatufy the pipes above
    # ctrl + alt + L