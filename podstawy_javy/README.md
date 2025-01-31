# NOTATKI - podstawy java

## IDE

**IDE** - **I**ntegrated **D**evelopment **E**nvironment - zintegrowane środowisko do programowania.

podczas nauki korzystam z IntelliJ IDEA od jetbrains.

**Zalety IDE**
- cały proces **kompilacji** przetworzenia kodu napisanego przez nas w kod pośredni i uruchomienie go przez
JVM jesteśmy w stanie zrobić jednym poleceniem/przyciskiem
- edytor wykrywa na bieżąco ewentualne błędy, zaznacza linię w której wykrył błąd
- podpowiada nazwy klas, metod i zmiennych

## KOMENTARZE

- służą do dodania dodatkowej informacji o kodzie. Pozwalają zaoszczędzić dużo czasu, np.:
- gdy po pewnym czasie wracamy do naszego kodu - nie musimy zastanawiać się w jaki sposób będzie działał nasz kod
- gdy nad programem pracuje więcej niż jedna osoba nie będzie musiała się domyślać co autor w danym momencie miał na myśli

**Rodzaje komentarzy**
- wielolinjkowy
    `/*`  
    `*/`  
- jednolinijkowy
    `//`

## PODSTAWY, KTÓRE WARTO ZNAĆ

- warto wstawiać białe znaki, czyli tzw. wcięcia, tabulatory, entery - dla lepszej przejrzystości kodu i ułatwienia odczytywania go
- każdy rozkaz powinien się kończyć średnikiem ; 
- klamry { } mówią jaki jest zakres działania
- class - klasa - pojemnik do przechowywania informacji oraz funkcji, które chcemy opisać znajdują się w { } klamrach
- każdy program będzie rozpoczynał się od wywołania instrukcji, wewnątrz funkcji main

## ZMIENNE

- pojemnik do którego możemy zapisać daną wartość
- każdy z tych pojemników może przechowywać różnego rodzaju elementy, np. liczby, teskt
- zmienne przechowywane są w pamięci RAM

**Rodzaje zmiennych**

- TYP CAŁKOWITY
    - **byte**  - do 8 bitów
        - od -128 do 127
    - **short** - do 16 bitów
        - od -32 768 do 32 767
    - **int**   - do 32 bitów
        - od -2^31 do 2^31 -1
    - **long**  - do 64 bitów
        - od -2^63 do 2^63 -1

- TYPY ZNAKOWE
    - **char**      - 2 bajtowy (tylko jeden znak, piszemy w apostrofach)
    - **String**    - ciąg znaków (piszemy w cudzysłowach)

- TYPY ZMIENNOPRZECINKOWE
    - **float**   - 32 bity   - 1,4 * 10^-45 do 3,4 * 10^138
    - **double**  - 64 bity   - od 4,9 * 10^-324 do 1,8 * 10^308

**Jak poprawnie nazywać zmienne**

- każda zmienna powinna się zaczynać od małej litery
- jeśli chcemy nazwać zmienną z dwóch słów drugie słowo zaczynam od wielkiej litery, np. daneOsobowe
- zmienne powinny być samoopisujące się
- można rozpocząć zmienną podkreśleniem
- znak podkreślenia zarezerwowany jest i powinniśmy go używać przy tworzeniu stałych

**STAŁE** - to zmienne finalne, nie jesteśmy w stanie zmienić podanej w nich wartości

**NIE WOLNO!!!**
- używać jako etykiety keywordów, czyli słów, kluczy które są już zarezerwowane np. public
- zaczynać nazwy zmiennej od liczb
- korzystać ze spacji w nazwie zmiennej

## OPERATORY ARYTMETYCZNE

to znaki służące do operowania na zmiennych 

- `+`   -> dodawanie liczb oraz łączenie string
- `-`   -> odejmowanie
- `*`   -> mnożenie
- `/`     -> dzielenie
- `%`     -> reszta z dzielenia (modulo)

- `=`     -> przypisanie wartości do zmiennej
- `+=`    -> skrótowe dodawanie
- `-=`    -> skrótowe odejmowanie
- `*=`    -> skrótowe mnożenie
- `/=`    -> skrótowe dzielenie
- `%=`

- `++`    -> inkrementacja - powiększa o 1
- `--`    -> dekrementacja - zmniejsza o 1

**post** czyli wykona dodawanie/odejmowanie, gdy wypisze na ekran wartość, która znajdowała się pod daną zmienną
- `x++`   -> post inkrementacja
- `x--`   -> post dekrementacja

**pre** najpierw powiększy/zmniejszy podaną zmienną, następnie wypisze jej wartość
- `++x`   -> pre inkrementacja
- `--x`   -> pre dekrementacja

## OPERATORY RELACYJNE

inaczej operatory porównania - to tzw. operator do warunkowania, służy do sprawdzania zmiennych

- `==`  -> porównanie
- `!=`  -> porównanie czy są różne od siebie
- `>`   -> większe od
- `<`   -> mniejsze od
- `>=`  -> większe bądź równe
- `<=`  -> mniejsze bądź równe

- **`boolean`** czyli wartość, która przechowuje tylk **`TRUE`** lub **`FALSE`**

## OPERATORY LOGICZNE

operują na logicznych wartościach, czyli **true** i **false**

### NEGACJA - `!`

- `!(true)`     -> false
- `!(false)`    -> true

### KONIUNKCJA - `&&` - "i"

- `true && true`    -> true
- `true && false`   -> false
- `false && true`   -> false
- `false && false`  -> false

**KONIUNKCJA JEST PRAWDZIWA WTEDY I TYLKO WTEDY GDY OBA WYRAŻENIA SĄ PRAWDZIWE**

### ALTERNATYWA - `||` - "lub"

- `true || true`    -> true
- `true || false`   -> true
- `false || true `  -> true
- `false || false`  -> false

**ALTERNATYWA JEST FAŁSZYWA TYLKO GDY OBA WYRAŻENIA SĄ FAŁSZYWE**

## OPERATORY BITOWE

operują na bitach, podstawowych jednostkach informacji przechowywanych w komputerze za pomocą impulsów elektrycznych (01010)

**`0 - false`**  
**`1 - true`**  

- `&`       -> iloczyn bitowy
- `|`       -> suma bitowa
- `^`       -> XOR e**X**clusive **OR**
- `x << 1`  -> przesunięcie w lewo o 1
- `x >> 2`  -> przesunięcie w prawo o 2
- `~`       -> negacja bitowa

## INSTRUKCJE WARUNKOWE

- to forma sprawdzenia czy podana instrukcja jest prawdziwa czy fałszywa
- jeżeli wyrażenie będzie prawdziwe mamy możliwość dzięki warunkowaniu wykonać podaną instrukcję.
- jeżeli będzie fałszywe nasza instrukcja nie zostanie wykonana.

**Schemat tworzenia instrukcji warunkowych:**

`if (WYRAŻENIE)
   instrukcja;
else if (WYRAŻENIE)
        instrukcja;
else 
    instrukcja;`

*jeśli instrukcji jest więcej niż jedna to wtedy zapisujemy w **{ }** `{instrukcja1, instrukcja2}`*

## INSTRUKCJA SWITCH

**Switch** (przełącznik) - pozwala przełączać pomiędzy różnymi stanami wartość, która została do niego przesłana

- możemy porównywać
    - int
    - char

- nie możemy porównywać:
    - double
    - String

**case** - przypadek
**break** - całkowite wyjście z przełącznika

## WYRAŻENIA WARUNKOWE

**STRUKTURA**

`<wyrażenie> ? <co zrobić jeśli TRUE> : <co zrobić jeśli FALSE>`

## TABLICA JEDNOWYMIAROWA

**Tablica** to kontener dla zmiennych ułożonych obok siebie. Używamy jej, gdy chcemy stworzyć wiecej zmiennych, które są tego samego typu

**Sposób tworzenia tablicy**

`int[] tab;`

`[]`        - informują, że to tablica
`tab`       - nazwa tablicy

`tab = new tab[5];`

`tab`       - odwołanie do tablicy
`new`       - rezerwacja miejsca w tablicy za pomocą słowa **new**
`int[5]`    - wartość ile mamy zarezerwowanego miejsca dla tego typu

        ---------------------------------------
        | tab[0] tab [1] tab[2] tab[3] tab[4] |
        ---------------------------------------

*aby odwołać się do miejsc w tablicy korzystamy z indeksów*
*indeksy numerowane są od 0*

**Odwołanie się do tablicy**

`System.out.println(tab[1]);`

**Inne sposoby tworzenia tablicy**

- `int[] tab1 = new int[5];`

- `int[] tab2 = {8, 12, 18, 26, 36, 48};`

## TABLICA WIELOWYMIAROWA

**Tablica wielowymiarowa** składa się z wierszy i kolumn. Tworzymy ją za pomocą dwóch `[][]` klamer kwadratowych.
Pierwszy argument to **ilość wierszy**, drugi to **ilość kolumn**

**Sposób tworzenia tablicy**

`int[][] tab = new int[4][3];`

`int[][] tab1 =
        {
            {8, 12, 18},
            {9, 13, 19},
            {26, 36, 48},
            {27, 37, 49}
        };`

        ----------------------------------
        |  [0][0]  |  [0][1]  |  [0][2]  |
        ----------------------------------
        |  [1][0]  |  [1][1]  |  [1][2]  |
        ----------------------------------
        |  [2][0]  |  [2][1]  |  [2][2]  |
        ----------------------------------
        |  [3][0]  |  [3][1]  |  [3][2]  |
        ----------------------------------

**Odwołanie się do tablicy**

`System.out.println(tab2[0][0]);`

## PĘTLE

**Pętla** służy do zapętlania, czyli powtarzania instrukcji nieprzerwanie aż do momentu kiedy warunek będzie spełniony. 

**Z pętli korzystamy, gdy:**

- mamy dużą ilość danych
- powtarzamy daną czynność wielokrotnie
- instrukcja się powtarza

**Rodzaje pętli**
- while
- do while
- for
- enhanced for

### WHILE

- aby pętla zadziałała jej warunek musi być **TRUE** i musi się kończy w pewnym momencie, aby pętla nie wykonywała się w nieskończoność.

**Przykład pętli `while`**

`int i = 0;`  
`while(i < 7) // warunek`  
`{`  
`   System.out.println(i); // instrukcja`  
`   i++; // operator dzięki któremu w pewnym momencie pętla zakończy swoje działanie`  
`}`  

### DO WHILE

- stosujemy ją, gdy nie interesuje nas czy warunek na samym starcie musi zostać spełniony

**Przykład pętli `do while`**

`i = 0;`  
`do`  
`{`  
`   System.out.println(i);`  
`   i++;`  
`}while(i < 7);`  


### FOR

- typ pętli, który sprawdza warunek na samym starcie
- tworzymy ją w jednej linii, odzielając od siebie średnikami operacje

**Schemat tworzenia pętli `for`**

`for (inicjalizacja zmiennych; warunek pętli; co ma się stać po wykonaniu instrukcji)`

**Przykład pętli `for`**

`for(int i = 0; i < 7; i++)`  
`{`  
`   System.out.println(i);`  
`}`  


### ENHANCED FOR

- to ulepszona pętla `for`
- możemy jej używać do tablic
- do stworzenia tej pętli potrzebujemy określić typ tablicy, nazwę zmiennej oraz nazwę tablicy do której się odwołujemy

**Schemat tworzenia pętli enhanced `for`**

`for(<typ tablicy> <nazwa zmiennej, która będzie przechowywać wartości przy każdym przejściu pętli>: <nazwa tablicy po której chcemy przejść>)`

**Przykład petli enhaced `for`**

`for(String nameRace: cyclingRaces)`  
`{`  
`   System.out.println(nameRace);`  
`}`  

### PĘTLA W PĘTLI

- możemy zagnieżdżać jedną pętle w drugiej

**Przykład pętli w pętli `for`**

`for (int j = 1; j <= 10; j++)`  
`{`  
`   for (int i = 1; i <= 10; i++)`  
`   {`  
`       System.out.print(i * j + " ");`  
`   }`  
`   System.out.println();`  
`}`  

## BREAK & CONTINUE

**Instrukcja `continue`** przerywa tylko daną iterację w pętli, nie przerywając całej pętli

**Przykład pętli `for` z `continue`**

`for (int i = 0; i < 60; i++)`  
`{`  
`    if (i % 2 != 0)`  
`       continue;`  
`   System.out.println(i);`  
`}`  

**Instrukcja `break`** kończy całkowicie działanie pętli. Stosujemy ją, gdy wiemy, że nie chcemy wykonywać już żadnej iteracji

**Przykład pętli `for` z `break`**

`for (int i = 0; i < 10; i++)`  
`{`  
`   if (i == 3)`  
`       break;`  
`   System.out.println(i);`  
`}`  