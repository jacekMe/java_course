package podstawy_javy;

public class TableOfMultiplications {
    public static void main(String[] args) {

        for (int j = 1; j <= 10; j++)
        {
            for (int i = 1; i <= 10; i++) {

                if (i % 2 != 0)
                    System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
