@rental_odev
Feature: rental_arama

  Scenario Outline: rental_arama_testi
    Given kullanıcı "https://www.bluerentalcars.com/" gider
    When  kullanıcı login sayfasına gider
    And   kullanıcı email "<email>" girer
    And   kullanıcı sifre "<sifre>" girer
    And   kullanıcı login butonuna tıklar

    Then  close the application

    Examples: data_rental

    |email                              |sifre         |
    |sam.walker@bluerentalcars.com      |c!fas_art     |
    |kate.brown@bluerentalcars.com      |tad1$Fas      |
    |raj.khan@bluerentalcars.com        |v7Hg_va^      |
    |pam.raymond@bluerentalcars.com     |Nga^g6!       |

