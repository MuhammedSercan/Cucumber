@scenario_outline_1
Feature: arama_feature_2

  Background: googlea_git
    Given kullanici google gider

    @regression
    Scenario Outline: arama_testi

      When kullanici "<product>" için arama yapar
      Then sonuclarda "<product>" içerdiğini dogrular
      Then close the application

  Examples: data
      | product |
      | iphone  |
      | tv      |
      | flower  |
      | cat     |
      | dog     |




  # Scenario -> Scenario Outline
  # ""       -> "<sütun_ismi>"
  # Example kelimesi Scenario Outline dan sonra kullanılmalı
  # Example verilerin kullanıldığı yerdir