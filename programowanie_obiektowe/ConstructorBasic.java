package programowanie_obiektowe;

public class ConstructorBasic {
    public static void main(String[] args) {

        Point p = new Point();

//        p.x = 10;
//        p.y = 20;

        System.out.println("p.x = " + p.x);
        System.out.println("p.y = " + p.y);
        System.out.println();

        Point p2 = new Point(15, 25);

        System.out.println("p2.x = " + p2.x);
        System.out.println("p2.y = " + p2.y);
    }
}

class Point
{
    // własny konstruktor
    Point()
    {
        System.out.println("Wywołano konstruktor domyślny");
        x = 80;
        y = 100;
    }
    Point(int x, int y)
    {
        System.out.println("Wywołano konstruktor z dwoma parametrami");
        this.x = x;
        this.y = y;
    }
    int x;
    int y;

}