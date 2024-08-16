package UniqueLastNames;

import java.util.ArrayList;
import java.util.Scanner;

//        +-----------------------------------------+
//        |            <<class>>                    |
//        |           UniqueLastNames               |
//        +-----------------------------------------+
//        | - main(args: String[]): void            |
//        +-----------------------------------------+

public class UniqueLastNames {

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>(); // List to store Person objects
        Scanner scanner = new Scanner(System.in); // Scanner object to read user input

        while (true) {
            // Prompt the user to continue inputting personal information or quit
            System.out.println("Continue personal information input? \"quit\" ends:");
            String continueQ = "quit";
            if (scanner.hasNextLine()) {
                continueQ = scanner.nextLine();
            }

            // Break the loop if the user inputs "quit"
            if (continueQ.equals("quit")) {
                break;
            }

            // Prompt the user to input first name, last name, and birth year
            System.out.print("Input first name: ");
            String firstName = "NaN";
            if (scanner.hasNextLine()) {
                firstName = scanner.nextLine();
            }
            System.out.print("Input last name: ");
            String lastName = "NaN";
            if (scanner.hasNextLine()) {
                lastName = scanner.nextLine();
            }
            System.out.print("Input the year of birth: ");
            int birthYear = 0;
            if (scanner.hasNextLine()) {
                birthYear = Integer.valueOf(scanner.nextLine());
            }

            // Create a new Person object with the input data and add it to the list
            persons.add(new Person(firstName, lastName, birthYear));
            System.out.println("");
        }

        // Print the unique last names in alphabetical order
        persons.stream()
                .map(lnames -> lnames.getLastName())
                .distinct()
                .sorted()
                .forEach(lnames -> System.out.println(lnames));
    }
}
