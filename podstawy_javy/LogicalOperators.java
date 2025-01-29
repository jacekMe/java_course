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

    /*
    OPERATORY LOGICZNE

        true
        false

        ! - NEGACJA

        !(true)     -> false
        !(false)    -> true

        && - KONIUNKCJA - "i"

        true && true    -> true
        true && false   -> false
        false && true   -> false
        false && false  -> false

        KONIUNKCJA JEST PRAWDZIWA WTEDY I TYLKO WTEDY GDY OBA WYRAŻENIA SĄ PRAWDZIWE

        || - ALTERNATYWA - "lub"

        true || true    -> true
        true || false   -> true
        false || true   -> true
        false || false  -> false

        ALTERNATYWA JEST FAŁSZYWA TYLKO GDY OBA WYRAŻENIA SĄ FAŁSZYWE
     */
}
