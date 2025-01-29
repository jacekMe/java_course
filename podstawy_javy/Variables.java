package podstawy_javy;

public class Variables {
    public static void main(String[] args) {
        String firstName = "Jacek";
        int a = 8;
        long b = 123456789123456789L;
        double c = 18.8;
        byte d = 127;
        short e = 1888;

        System.out.println(firstName);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    }

    /*
        Typy całkowite:
            byte    - 8 bit     - od -128 do 127
            short   - 16 bit    - od -32 768 do 32 767
            int     - 32 bity   - od -2^31 do 2^31 -1
            long    - 64 bity   - od -2^63 do 2^63 -1

        Znakowe:
            char    - 2 bajtowy
            String  - ciąg znaków

        Zmiennoprzecinkowe:
            float   - 32 bity   - 1,4 * 10^-45 do 3,4 * 10^138
            double  - 64 bity   - od 4,9 * 10^-324 do 1,8 * 10^308

     */
}
