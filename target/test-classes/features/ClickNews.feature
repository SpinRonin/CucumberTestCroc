Feature: clickNews

  Scenario: ClickNews
    Then find_news_head
    Then click_news
    Then find_news_example
    Then get_back
