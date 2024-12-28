import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person1 = new Person("Ali", "Baimen", 18, true);
        System.out.println(person1.toString());
    }

}
