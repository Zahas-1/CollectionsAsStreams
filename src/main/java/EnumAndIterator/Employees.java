package EnumAndIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Class representing a collection of employees
public class Employees {
    private List<Person> persons; // List to store Person objects

    // Constructor to initialize the list of persons
    public Employees(){
        this.persons = new ArrayList<>();
    }

    // Method to add a single person to the list
    public void add(Person personToAdd){
        persons.add(personToAdd);
    }

    // Method to add a list of people to the list
    public void add(List<Person> peopleToAdd){
        for(Person item : peopleToAdd){
            persons.add(item);
        }
    }

    // Method to print all persons in the list
    public void print(){
        Iterator<Person> iterator = persons.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    // Method to print persons with a specific education level
    public void print(Education education){
        Iterator<Person> iterator = persons.iterator();
        while(iterator.hasNext()){
            Person next = iterator.next();
            if(next.getEdu() == education){
                System.out.println(next);
            }
        }
    }

    // Method to remove persons with a specific education level
    public void fire(Education education){
        Iterator<Person> iterator = persons.iterator();
        while(iterator.hasNext()){
            Person next = iterator.next();
            if(next.getEdu() == education){
                iterator.remove();
            }
        }
    }

    // Main method to demonstrate the functionality of the Employees class
    public static void main(String[] args) {
        Employees university = new Employees();
        university.add(new Person("Petrus", Education.PHD));
        university.add(new Person("Arto", Education.HS));
        university.add(new Person("Elina", Education.PHD));

        // Print all employees
        university.print();

        // Fire employees with high school education
        university.fire(Education.HS);

        // Print all employees again to see the change
        System.out.println("==");
        university.print();
    }
}
