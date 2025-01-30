package podstawy_javy;

public class TestTabLoopWhile {
    public static void main(String[] args) {
        int[] tabElements = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int i = 0;
        while(i < tabElements.length)
        {
            System.out.println(tabElements[i]);

            i++;
        }
    }
}
