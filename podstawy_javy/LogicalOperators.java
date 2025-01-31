package podstawy_javy;

public class LogicalOperators {
    public static void main(String[] args) {
        int     a = 8,
                b = 8,
                c = 18;

        System.out.println(!(a == b));
        System.out.println(!(a == c));
        System.out.println(a == b && c > 7);
        System.out.println(a == b && c > 88);
        System.out.println(a == b || c == b);
        System.out.println(a > b || c > a);
    }
}
