package podstawy_javy;

public class SumOfValues {
    public static void main(String[] args) {
        int[] numbers = {1, 8, 18, 26, 54, 88, 123, 212};

        int sum = 0;

//        for (int i = 0; i < numbers.length; i++)
//        {
//            sum += numbers[i];
//        }
//
//        System.out.println("Total value is: " + sum);
//
        for (int number: numbers)
        {
            sum += number;
        }

        System.out.println("Total value is: " + sum);
    }
}
