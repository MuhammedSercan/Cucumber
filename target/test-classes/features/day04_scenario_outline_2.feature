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
      | firstname | lastname | positions    | office     | extension | start_date | salary |
      | john      | walker   | SDET         | ISTANBUL   | 345       | 2023-03-01 | 100000 |
      | zeynep    | black    | developer    | ankara     | 3412      | 2023-03-04 | 800000 |
      | ali       | tez      | BA           | Tokat      | 678       | 2023-03-08 | 870000 |
      | feyza     | sar      | PO           | Izmir      | 7456      | 2023-03-03 | 860000 |
      | Mukesh    | Srivasan | Scrum Master | Haydarabat | 980       | 2023-03-09 | 50000  |

