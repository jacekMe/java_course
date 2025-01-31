package podstawy_javy;

public class MultiDimArrays {
    public static void main(String[] args) {
        // pierwsza opcja przypisania wartości

        int[][] tab = new int[4][3];

        tab[0][0] = 8;
        tab[3][2] = 88;

        System.out.println(tab[3][2]);

        // druga opcja przypisania wartości

        int[][] tab1 =
                {
                        {8, 12, 18},
                        {9, 13, 19},
                        {26, 36, 48},
                        {27, 37, 49}
                };
        System.out.println(tab1[1][0]);
    }
}
