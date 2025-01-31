package podstawy_javy;

public class ConditionalInstructions {
    public static void main(String[] args) {
        int a = 2, b =5;

        if (a > b)
            System.out.println("A jest większe od B.");
        else if (a < b)
            System.out.println("B jest większe od A.");
        else
            System.out.println("A jest równe B.");
    }
}
