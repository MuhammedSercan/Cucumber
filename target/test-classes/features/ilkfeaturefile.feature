@google_search
Feature: ilk feature file

  Background: Google_sayfasına_git
    Given kullanici google gider

  @iphone
  Scenario: TC01_google_iphone_arama
    When kullanici iphone için arama yapar
    Then sonuclarda iphone oldugunu dogrular
    And close the application

  @tesla
  Scenario: TC02_google_tesla_arama
  When kullanıcı tesla için arama yapar
  Then sonuçlarda tesla olduğunu doğrular
  Then close the application

#  1. Her feature file, Feature: kelimesi ile baslamak zorundadir
#  2. Her bir file da, yanliz bir Feature: kullanilabilir
#  3. Senaryo(TEST CASE) olusturmak icin Scenario kelimesi kullanilir
#  4. Birden fazla Scenario: kullanilabilir
#  5. Her bir adim Given,When,And,Then,But,* kelimelerinden biriyle baslamalidir.
#  6. Given -> Genelde ilk satirlarda, pre condition stepleri icin kullanilir
#  7. Then -> Genelde son satirlarda, verification stepleri icin kullanilir
#  8. And, When -> Genelde ara adimlarda baglar olarak kullanilir
#  9. Belirli scenario ları çalıştırmak için cucumber tags ler kullanılır
#  tag ler Feature,Scenario, Scerio Outline,Examples kelimeleri ile birlikte kullanılabilir
#  10.Bakground: Her bir Scenario kelimesinden ONCE tek bir sefer çalışır
#  NOTE: Teknik olarak istenilen kelime isteniler step de kullanilabilir,
#        ama anlam karmasasi olmamasi icin bu adimlar takip edilir
#  11. dryRun = false --> dryRun yokmuş gibi çalışır. Tek tek tüm stepleri browserde açar.
#  12. dryRun = true --> Yeni bir step eklendiğinde; sadece step definitions ları konsolda kontrol eder. Eksik olan var mı diye bakar.


  