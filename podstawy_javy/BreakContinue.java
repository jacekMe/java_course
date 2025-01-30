package podstawy_javy;

public class BreakContinue {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++)
        {
            if (i % 2 == 0)
                continue; //przerwij iteracje od tego momentu i nie wykonuj już żadnych instrukcji po mnie

            System.out.println(i);
        }

        System.out.println();

        for(int i = 0; i < 10; i++)
        {
            if (i == 3)
                break; //przerywa działanie pętli i z niej wychodzi

            System.out.println(i);
        }
    }
}
