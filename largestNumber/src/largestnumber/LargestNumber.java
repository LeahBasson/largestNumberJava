
package largestnumber;

import java.util.Scanner;


public class LargestNumber {

    
    public static void main(String[] args) {
        // Read three numbers from the keyboard.
        // Display the largest number with an appropriate message.
        
        Scanner kbd = new Scanner(System.in);
        
        System.out.println("Please enter the first number: ");
        int num1 = kbd.nextInt();
        
        System.out.println("Please enter the second number: ");
        int num2 = kbd.nextInt();
        
        System.out.println("Please enter the third number: ");
        int num3 = kbd.nextInt();
        
        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " is the largest number.");
        } else if(num1 < num2 && num2 > num3) {
            System.out.println(num2 + " is the largest number.");
        } else if (num1 < num3 && num3 > num1){
            System.out.println(num3 + " is the largest number.");
        } else{
            System.out.println("Incorrect input - not a number.");
        }
    }
    
}
