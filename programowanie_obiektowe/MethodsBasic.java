package programowanie_obiektowe;

public class MethodsBasic {
    public static void main(String[] args) {

        Test a = new Test();
        a.typeOut("Jacek", "Meres");

        Test a2 = new Test();
        a.typeOut("Sylwia", "Meres");


        int result = a.add(18, 8);
        double result1 = a.add(18.8, 12.2);

        System.out.println(result);
        System.out.println(result1);

        double result2 = a.divide(18, 0);
        System.out.println(result2);
    }
}

class Test
{
    void typeOut(String firstName, String lastName) // metoda
    {
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println();
    }

    int add(int a, int b)
    {
        return a + b;
    }
    // przeciązanie metody, kiedy jedną metodę mamy dla różnych typów zmiennych
    double add(double a, double b)
    {
        return a + b;
    }

    double divide(double a, double b)
    {
        if (b == 0)
            return 0;

        return a / b;
    }
}
