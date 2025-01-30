package podstawy_javy;

public class ConditionalExpression {
    public static void main(String[] args) {
        int x = 5;

        String isEven = x % 2 == 0 ? "parzysta" : "nieparzysta";
        System.out.println(isEven);
    }

    /*
           STRUKTURA

           <wyrażenie> ? <co zrobić jeśli TRUE> : <co zrobić jeśli FALSE>
     */
}
