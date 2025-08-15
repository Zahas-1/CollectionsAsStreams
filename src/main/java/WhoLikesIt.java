/*
You probably know the "like" system from Facebook and other pages.
People can "like" blog posts, pictures or other items.
We want to create the text that should be displayed next to such an item.

Implement the function which takes an array containing the names of people that like an item.
It must return the display text as shown in the examples:

[]                                -->  "no one likes this"
["Peter"]                         -->  "Peter likes this"
["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
Note: For 4 or more names, the number in "and 2 others" simply increases.
 */

public class WhoLikesIt {

    // Main method that builds the "likes" message based on the number of names provided
    public static String whoLikesIt(String... names) {

        // Decide message format based on how many people liked the item
        switch (names.length) {
            case 0:
                // No one liked it
                return "no one likes this";
            case 1:
                // Single person likes it — use singular "likes"
                return names[0] + " likes this";
            case 2:
                // Two people liked it — join with "and"
                return names[0] + " and " + names[1] + " like this";
            case 3:
                // Three people liked it — comma between first two, "and" before last
                return names[0] + ", " + names[1] + " and " + names[2] + " like this";
            default:
                // Four or more people liked it — show first two names, then "and X others"
                return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
        }
    }
}
