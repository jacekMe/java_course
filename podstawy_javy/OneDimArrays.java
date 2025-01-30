package podstawy_javy;

public class OneDimArrays {
    public static void main(String[] args) {
        // pierwsza opcja tworzenia tablicy

        int[] tab;
        tab = new int[5];

        tab[0] = 8;
        tab[1] = 12;
        tab[2] = 18;
        tab[3] = 26;
        tab[4] = 36;

        System.out.println(tab[2]);

        // druga opcja tworzenia tablicy

        int[] tab1 = new int[5];

        tab1[0] = 8;
        tab1[1] = 12;
        tab1[2] = 18;
        tab1[3] = 26;
        tab1[4] = 36;

        System.out.println(tab1[0]);
        System.out.println("Długość tablicy wynosi: " + tab1.length);
        // trzecia opcja tworzenia tablicy

        int[] tab2 = {8, 12, 18, 26, 36, 48};
        System.out.println(tab2[4]);
        System.out.println("Długość tablicy wynosi: " + tab2.length);
        System.out.println("Ostatni element tablicy to: " + tab2[tab2.length-1]);
    }
}
