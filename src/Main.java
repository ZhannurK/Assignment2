import interfaces.Payable;
import models.Employee;
import models.Person;
import models.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Employee("john", "Lennon", "employee",  27045.78));
        list.add(new Employee("George", "Harrison", "employee",  50000.00));
        list.add(new Student("Ringo", "Starr", 2.89));
        list.add(new Student("Paul", "McCartney", 2.54));

        printData(list);
    }
    public static void printData(Iterable<Person> people){
        for (Payable payable : people){
            System.out.println(payable + " earns " + payable.getPaymentAmount());
        }
    }
}