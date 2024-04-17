/* @brief it compares the length of the name with the number of characters the user thought.
 * @details Scanner is instantiated to read the user's input and it use length function.
 * @file conditionals.java
 * @date 16/04/20214
 * @version 1.0*/

import java.util.Scanner;
public class IfElseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.next();
        System.out.print("How many characters do you think your name has: ");
        int number_of_characters = scanner.nextInt();

        int name_length = name.length(); 

        if (name_length == number_of_characters) {
            System.out.println("The length of the name is equal to the numeric of characters you thought");
        } else if (name_length > number_of_characters) {
            System.out.println("The length of the name is greater than the numeric of characters you thought");
        } else {
            System.out.println("The length of the name is less than the numeric of characters you thought");
        }
        scanner.close();
    }
}
