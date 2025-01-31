package programowanie_obiektowe;

public class ObjectOrientedProgrammingBasic {
    public static void main(String[] args) {

        Monitor dell = new Monitor();
        dell.width = 1234;

        Monitor mac = new Monitor();
        mac.width = 2345;

        System.out.println(dell.width);
        System.out.println(mac.width);
    }
}

class Monitor
{
    int width;
    int length;

    void turnOn()
    {

    }

    void turnOff()
    {

    }
}