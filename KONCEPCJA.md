# Przeglądy - koncepcja projektu

Temat i nazwa zatwierdzone przez użytkownika. Nie jest to gotowy system przegladow ani potwierdzenie zgodnosci z przepisami.

## Problem i efekt uzytkowy
Koordynator serwisu trzyma ewidencje sprzetu i terminy kontroli w roznych plikach. Aplikacja ma umozliwic znalezienie sprzetu, jego historii i najblizszego terminu kontroli w jednym miejscu. Na koniec projektu: dodanie sprzetu, utworzenie zlecenia, zapis wyniku oraz lista zaleglych kontroli.

## Klient
Marek, koordynator niewielkiej firmy serwisujacej sprzet ratowniczy i przeciwpozarowy na statkach oraz w jednostkach strazy. Chce ustalic, co sprawdzic, gdzie znajduje sie sprzet i kto wykonal kontrole. Na zajeciach wylacznie fikcyjne dane operacyjne.

## Trzy najwazniejsze funkcje
1. Ewidencja sprzetu z numerem seryjnym, rodzajem i lokalizacja.
2. Planowanie i realizacja zlecen przegladow z wynikiem i czasem pracy.
3. Lista przekroczonych terminow i historia wykonanych przegladow.

## Dwa moduly docelowe
- equipment: lokalizacje, rodzaje i egzemplarze sprzetu.
- inspection: zlecenia, pozycje zlecen i przydzialy serwisantow.
Gotowy account z szablonu pozostaje modulem kont.

## Szesc wlasnych tabel do pozniejszych laboratoriow
1. location: nazwa, typ (statek/remiza/magazyn), oznaczenie.
2. equipment_type: nazwa rodzaju i opis.
3. equipment: numer seryjny, nazwa, rodzaj, lokalizacja, planowany termin kolejnej kontroli.
4. inspection_order: numer, data planowana, status, data zamkniecia.
5. inspection_item: zlecenie, sprzet, wynik, uwagi, rzeczywisty czas w minutach, nastepny termin.
6. inspection_assignment: zlecenie, konto serwisanta, rola w zleceniu, przydzielony czas w minutach.

## Relacje
- Lokalizacja ma wiele urzadzen; rodzaj sprzetu ma wiele egzemplarzy.
- Zlecenie ma wiele pozycji; sprzet moze wystapic w wielu zleceniach. inspection_item realizuje wiele-do-wielu z wlasnymi atrybutami.
- Zlecenie moze miec wielu serwisantow, a serwisant wiele zlecen; inspection_assignment przechowuje przydzial.

## Cykl zycia zlecenia
DRAFT -> PLANNED -> IN_PROGRESS -> COMPLETED.
DRAFT lub PLANNED -> CANCELLED.
Zamkniecie wymaga co najmniej jednej pozycji i wyniku dla kazdej pozycji. Terminow kontroli nie wyliczamy z przepisow - sa wprowadzane przez uzytkownika.

## Wielkosci mierzalne
Liczba urzadzen, liczba dni opoznienia, czas pracy w minutach, liczba wykonanych kontroli, udzial wynikow negatywnych.

## Piec pytan biznesowych na LAB 03
1. Ile urzadzen w kazdej lokalizacji ma przekroczony termin kontroli na wskazany dzien?
2. Ile przegladow zakonczono w kazdym miesiacu wedlug rodzaju sprzetu?
3. Jaki jest sredni rzeczywisty czas kontroli dla kazdego rodzaju sprzetu?
4. Ktore lokalizacje maja najwyzszy udzial negatywnych wynikow kontroli?
5. Jak rozklada sie przydzielony czas pracy miedzy serwisantow w danym miesiacu?

## Zakres LAB 01
Uruchomienie szablonu i H2, nazwa pakietu i aplikacji, artifactId, wersja z rzeczywistymi indeksami, rzeczywiste konta zespolu oraz wizytowka. Szesc tabel to plan rozwoju, nie implementacja na LAB 01.

## Brakujace dane i czynnosci zewnetrzne
- Temat i nazwa przeglady zatwierdzone.
- Zespół: Mateusz Masalski (89514) i Hubert Cichorz (107446). Konta uczelniane dodane do data.sql; grupa zajęciowa pozostaje do podania.
- Instrukcja i test R1.03 wymagaja minimum trzech kont poza demo. Dla zespolu dwuosobowego nalezy uzgodnic wymaganie z prowadzacym; nie dodajemy fikcyjnego czlonka i nie zmieniamy testu.
- Organizacja: zaproszenie współpracownika, uzupełnienie arkusza zespołów i docelowej nazwy repozytorium.

Zrodla lokalne: docs/lab01.html, docs/pomysl.html, src/test/java/pl/wsb/rules/lab01/Lab01ProjectRulesTest.java w pobranym repozytorium.
