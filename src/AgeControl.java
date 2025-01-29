public class AgeControl {
    public static void main(String[] args) {
        int age = 18;
        
        if (age < 18) {
            System.out.println("You can learn.");
        } else if (age >= 18 && age < 65) {
            System.out.println("You can work.");
        } else if (age >=65) {
            System.out.println("You can retire.");
        } else {
            System.out.printf("You can't retire.");
        }
    }
}
