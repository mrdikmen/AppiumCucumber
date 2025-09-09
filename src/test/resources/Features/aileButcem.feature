Feature: Kullanici Aile Butcem uygulamasini test eder
  @aile
  Scenario:Kullanici gecerli bilgiler ile uygulamaya giris yapar
    Given Ilk ekran ayarlarini yapin ve ardindan login sayfasina ulasin
    When "mail" ve "password" bilgilerini girerek kullanici bilgileriyle "Giriş Yap"
    Then Uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin
    And Sol kisimdaki menuden "Hesabım" bolumune gidin
    Then Uygulamayi kapatin