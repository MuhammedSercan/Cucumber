@personel_olusturma
Feature: personel_olusturma
  Scenario Outline: TC01_personel_olustur
    Given kullanici "https://editor.datatables.net/" gider
    When kullanıcı new butonuna tıklar
    And kullanıcı firstname "<firstname>" girer
    And kullanıcı lastname "<lastname>" girer
    And kullanıcı positions "<positions>" girer
    And kullanıcı office "<office>" girer
    And kullanıcı extension "<extension>" girer
    And kullanıcı start_date "<start_date>" girer
    And kullanıcı salary "<salary>" girer
    And kullanıcı create butonuna basar
    When kullanıcı firstname ile "<firstname>" arar
    Then firstname "<firstname>" in oluştuğunu test et
    Then close the application

    Examples: personel_bilgileri
    |firstname|lastname|positions|office  |extension  |start_date|salary|
    |John     |Walker  |SDET     |ISTANBUL| 345       |2023-02-25|120000|
    |Zeynep   |Black   |Developer|ANKARA  | 123       |2023-02-25|150000|
    |Ali      |Bak     |BA       |IZMIR   | 128       |2023-02-25|180000|
    |Feyza    |Sar     |QA       |ERZURUM | 121       |2023-02-25|280000|

