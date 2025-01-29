package src;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 18;
        int b = 8;

        int adding = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;
        int modulo = a % b;

        System.out.println("the result of the addition is: " + adding);
        System.out.println("the result of subtraction is: " + subtraction);
        System.out.println("the result of  multiplication is: " + multiplication);
        System.out.println("the result of division is: " + division);
        System.out.println("the result of modulo is: " + modulo);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        ++a;
        --b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a++;
        b--;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    /*

    OPERATORY - to znaki służące do operowania na zmiennych

        OPERATORY ARYTMETYCZNE

            + -> dodawanie liczb oraz łączenie string
            - -> odejmowanie
            * -> mnożenie
            / -> dzielenie
            % -> reszta z dzielenia (modulo)

            = -> przypisanie wartości do zmiennej
            += -> skrótowe dodawanie
            -= -> skrótowe odejmowanie
            *= -> skrótowe mnożenie
            /= -> skrótowe dzielenie
            %=

            ++ -> inkrementacja - powiększa o 1
            -- -> dekrementacja - zmniejsza o 1

            x++ -> post inkrementacja
            x-- -> post dekrementacja

            ++x -> pre inkrementacja
            --x -> pre dekrementacja
     */
}
