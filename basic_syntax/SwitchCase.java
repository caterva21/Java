/* @brief The program asks the user to enter a number 
 * between 1 and 7 to know the day of the week.
 * @details this program to demonstrate the use of switch case statement
 * @file SwitchCase.java
 * @date 17/04/20214
 * @version 1.0*/

import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = """
        Days of the week
     
        1. Monday
        2. Tuesday
        3. Wednesday
        4. Thursday
        5. Friday
        6. Saturday
        7. Sunday

        Enter a number between 1 and 7 to know the day of the week:""";
        System.out.println(text);
        int weekday_number = scanner.nextInt();
        switch(weekday_number){
            case 1: 
                System.out.println("The day is Monday");
            break;
            case 2:  
                System.out.println("The day is Tuesday");
            break;
            case 3:  
                System.out.println("The day is Wednesday");
            break;
            case 4:  
                System.out.println("The day is Thursday");
            break;
            case 5:  
                System.out.println("The day is Friday");
            break;
            case 6:  
                System.out.println("The day is Saturday");
            break;
            case 7:  
                System.out.println("The day is Sunday");
            break;
            default: 
                System.out.println("Invalid day");
            }      
        scanner.close();
    }
}