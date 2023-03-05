@parametre
Feature: arama_feature

  Background: googlea_git
    Given kullanici google gider

    @smoke
    Scenario: TC01_google_iphone_arama
      When kullanici "iphone" için arama yapar
      Then sonuclarda "iphone" içerdiğini dogrular
      Then close the application
  @smoke
    Scenario: TC02_google_tesla_arama
    When kullanici "tesla" için arama yapar
    Then sonuclarda "tesla" içerdiğini dogrular
    Then close the application
  @smoke
    Scenario: TC03_google_tesla_arama
    When kullanici "water" için arama yapar
    Then sonuclarda "water" içerdiğini dogrular
    Then close the application

    Scenario: TC04_google_tesla_arama
    When kullanici "porcelain tea pot" için arama yapar
    Then sonuclarda "porcelain tea pot" içerdiğini dogrular
    Then close the application

    Scenario: TC05_google_tesla_arama
    When kullanici "skateboard" için arama yapar
    Then sonuclarda "skateboard" içerdiğini dogrular
    Then close the application

# "veri" ->feature file i parametrize etmek için kullanılır
