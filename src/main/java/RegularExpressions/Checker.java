package RegularExpressions;

//        +-------------------------------------+
//        |            <<class>>                |
//        |              Checker                |
//        +-------------------------------------+
//        | + isDayOfWeek(string: String): bool |
//        | + allVowels(string: String): bool   |
//        | + timeOfDay(string: String): bool   |
//        | + main(args: String[]): void        |
//        +-------------------------------------+


// Class to provide various string checking methods using regular expressions
public class Checker {
    // Method to check if the input string represents a day of the week
    public static boolean isDayOfWeek(String string){
        // Using regular expression to match day of the week pattern
        if(string.matches("mon|tue|wed|thu|fri|sat|sun")){
            return true; // Return true if input matches the pattern
        } else return false; // Otherwise, return false
    }

    // Method to check if the input string contains all vowels
    public static boolean allVowels(String string){
        // Using regular expression to match strings containing all vowels
        if(string.matches("[aeiou]+")){
            return true; // Return true if input matches the pattern
        } else return false; // Otherwise, return false
    }

    // Method to check if the input string represents a valid time of day
    public static boolean timeOfDay(String string){
        // Using regular expression to match time of day pattern (HH:mm:ss)
        if(string.matches("(((0|1[0-9])|(2[0-3])):[0-5][0-9]:[0-5][0-9])")){
            return true; // Return true if input matches the pattern
        } return false; // Otherwise, return false
    }

    // Main method to test the timeOfDay method
    public static void main(String[] args) {
        String name = "33:33:33"; // Test input string
        System.out.println(timeOfDay(name)); // Print the result of timeOfDay method
    }
}
