package programowanie_obiektowe;

public class StaticBasic {
    public static void main(String[] args) {

//        double result = Maths.add(18, 8);
//        System.out.println(result);
//
//        System.out.println(Maths.PI);
        Client a = new Client("Jacek");
        Client b = new Client("Sylwia");
        Client c = new Client("Lila");

        System.out.println(a.id);
        System.out.println(b.id);
        System.out.println(c.id);

        System.out.println(Client.nextId);
    }
}

class Maths
{
    static final double PI = 3.14;
    static double add(double a, double b)
    {
        return a + b;
    }
}
class Client
{
    Client(String firstName)
    {
        this.firstName = firstName;
        id = nextId;
        nextId++;
    }
    String firstName;
    int id = 0;
    static int nextId = 1;
}