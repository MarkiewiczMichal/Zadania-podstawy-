# Zadania-srednie
## Zadanie nr1_Konta bankowe 

Napisać program, który symuluje operacje na kontach bankowych.
Konta są obiektami klasy Account. Każde konto ma aktualny stan (balance) i można:
wplacać pieniądze (metoda deposit())
wypłacać pieniądze (metoda withdraw())
przelewać na inne konto (metoda transfer(...))
dodawać do stanu konta odsetki w skali rocznej (metoda addInterest()).
Stopa oprocentowania jest wspólna dla wszystkich kont i ustalana za pomocą metody setInterestRate(...).

Konta posiadają klienci banku (obiekty klasy BankCustomer). W roli klienta występuje osoba (obiekt klasy Person).

Dostarczyć takich definicji w/w klas, aby poniższy program:
public class BankingTest {

  public static void main(String[] args) {

    Person janP = new Person("Jan"),
           alaP = new Person("Ala");

    BankCustomer jan = new BankCustomer(janP);
    BankCustomer ala = new BankCustomer(alaP);

    jan.getAccount().deposit(1000);
    ala.getAccount().deposit(2000);
    jan.getAccount().transfer(ala.getAccount(), 500);
    ala.getAccount().withdraw(1000);

    System.out.println(jan);
    System.out.println(ala);

    Account.setInterestRate(4.5);
    jan.getAccount().addInterest();
    ala.getAccount().addInterest();

    System.out.println(jan);
    System.out.println(ala);
  }
} 

wyprowadził następującą informację na standardowe wyjście (out):

Klient: Jan stan konta 500.0
Klient: Ala stan konta 1500.0
Klient: Jan stan konta 522.5
Klient: Ala stan konta 1567.5

Postać wydruku jest obowiązkowa.

Program powinien dobrze działać dla  dowolnych wplat-wyplat. To znaczy, że trzeba się zabezpieczyć przed  ich niedopuszcalnymi wartościami (np. ujemne wartosci lub też wypłaty przekraczające stan konta). Najprościej będzie ignorować niedopuszczalne operacje.
Jeśli natomiast będą zgłaszane wyjątki - to koniecznie trzeba je obsłużyć. Przy obsłudze nie wolno wypisywać komunikatów do standardowego strumienia błędów err (co najwyżej na standardowe wyjście - out).
Uwaga: utworzonej przez generator projektów klasy BankingTest nie wolno zmieniać.

## Zadanie nr2_Odwracanie


Zdefiniować interfejs Reversible z jedną metodą Reversible reverse() i zaimplementować ją w klasach ReversibleString i ReversibleDouble.
Metoda reverse dla Stringów odwraca napis, a dla liczb - odwraca liczbę (czyli z napisu kot robi tok a z liczby 3 robi 0.3333).
Metoda zwraca Reversible z aktualną (odwróconą) wartością.

Zapewnić by następujący program wykonał się prawidłowo i dał pokazane wyniki:

      public class ReverseTest {
      
        public static void main(String[] args) {
        
              Reversible[] revers = new Reversible[] {
                  new ReversibleString("Kot"),
                  new ReversibleDouble(2),
                  new ReversibleDouble(3),
                  new ReversibleString("Pies"),
                  new ReversibleString("Ala ma kota i psa"),
                  new ReversibleDouble(10),
              };

              System.out.println("Normalne:");
              for (Reversible r : revers) {
                System.out.println(r);
              }

              for (Reversible r : revers) {
                r.reverse();
              }

              System.out.println("Odwrócone:");
              for (Reversible r : revers) {
                System.out.println(r);
              }

              System.out.println("Przywrócone i zmienione:");
              for (Reversible r : revers) {
                 /*<-  co tu trzeba napisać */
              }
            }
          }

Wynik:
Normalne:
Kot
2.0
3.0
Pies
Ala ma kota i psa
10.0
Odwrócone:
toK
0.5
0.3333333333333333
seiP
asp i atok am alA
0.1
Przywrócone i zmienione:
Tekst Kot
12.0
13.0
Tekst Pies
Tekst Ala ma kota i psa
20.0
Uwaga: kod klasy ReverseTest może (i musi)  być zmieniony tylko w miejscu zaznaczonym na zielono. Inne modyfikacje pliku nie są dopuszczalne i skutkują otrzymaniem zera punktów.
