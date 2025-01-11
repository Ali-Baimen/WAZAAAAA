import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main {

    public static void main(String[] args) {
        ArrayList<Person> pay = new ArrayList<>();

        pay.add(new Employee("Jotaro", "Kudgo", "CEO", 45000.50));
        pay.add(new Employee("Dexter", "Morgan", "Manager", 23450.00));
        pay.add(new Person());
        pay.add(new Student("Risotto", "Nero", 3.67));
        pay.add(new Student("Khalid", "Khashimiri", 1.8));

        Collections.sort(pay);

        for (Payable p : pay) {
            System.out.println(p + " earns " + p.getPaymentAmount() + " Dollars $");
        }


    }
}