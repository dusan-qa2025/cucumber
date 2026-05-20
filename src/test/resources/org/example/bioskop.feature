Feature: Obracun bioskopske karte
  Scenario Outline: Obracun cene za razlicite kombinacije
    Given korisnik nije dete <dete>
    And projekcija nije 3d <projekcija3d>
    And korisnik nema kupon <imaKupon>
    When izracuna cenu karte
    Then cena karte treba da bude <ocekivanaCena>

    Examples:
      | dete | projekcija3d | imaKupon | ocekivanaCena |
      | false | false       | false    | 600           |
      | true |  false       | false    | 400           |