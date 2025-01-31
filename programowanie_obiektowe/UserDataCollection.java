package programowanie_obiektowe;
import java.util.Scanner;
public class UserDataCollection {
    public static void main(String[] args) {
        // tworzenie obiektu klasy Scanner i przypisanie mu System.in
        Scanner input = new Scanner(System.in);

        // prośba o podanie imienia
        System.out.println("Proszę podaj swoje imię: ");
        //pobieramy imię od użytkownika
        String name = input.next();

        // prośba o podanie wieku
        System.out.println("Proszę podaj swój wiek: ");
        // pobieramy wiek użytkownika
        int age = input.nextInt();

        // prośba o podanie zarobków
        System.out.println("Proszę podaj swoje zarobki: ");
        // pobranie danych o zarobkach użytkownika
        double salary = input.nextDouble();

        // wypisujemy wszystkie dane użytkownika jakie zebraliśmy
        System.out.println("Twoje imię to: " + name);
        System.out.println("Twój wiek to: " + age);
        System.out.println("Twoje zarobki to: " + salary);
    }
//    Scanner.close();
}
