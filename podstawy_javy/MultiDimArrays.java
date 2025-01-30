package podstawy_javy;

public class MultiDimArrays {
    public static void main(String[] args) {
        /*
            ----------------------------------
            |  [0][0]  |  [0][1]  |  [0][2]  |
            ----------------------------------
            |  [1][0]  |  [1][1]  |  [1][2]  |
            ----------------------------------
            |  [2][0]  |  [2][1]  |  [2][2]  |
            ----------------------------------
            |  [3][0]  |  [3][1]  |  [3][2]  |
            ----------------------------------
         */
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
