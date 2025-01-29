package src;

public class BitOperators {
    public static void main(String[] args) {

        System.out.println(14&11);
        System.out.println(10|11);
        System.out.println(10^11);
        System.out.println(10>>1);
        System.out.println(10<<2);
        System.out.println(~10);
    }

    /*
        0 - false, 1 - true
        OPERATORY BITOWE

            &       -> iloczyn bitowy
            |       -> suma bitowa
            ^       -> XOR eXclusive OR
            x << 1  -> przesunięcie w lewo o 1
            x >> 2  -> przesunięcie w prawo o 2
            ~       -> negacja bitowa
     */
}
