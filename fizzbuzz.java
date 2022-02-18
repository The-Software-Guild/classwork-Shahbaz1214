/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Shahbaz
 */
import java.util.Scanner;
public class fizzBuzz{

  public static void main(String[] args) {
      
        Scanner inputReader = new Scanner(System.in);
        
        int units;
        int counter = 0;     // initialising variables
        
        System.out.println("How many units of fizzing and buzzing do you need in your life? ");
        units = Integer.parseInt(inputReader.nextLine());    // Asking user the number of units
        
        for (int i = 1; counter < units; i++) {    // for loop for printing the resutlt
            
            if  (i % 3 == 0){
                System.out.println("Fizz");
                counter++;                           // counter to count the result
                
            } else if (i % 5 == 0){
                System.out.println("Buzz");
                counter++;
                
            } else if (i % 3 == 0 && i % 5 == 0){
                System.out.println("Fizz Buzz");    //fizz buzz witll be printed when both are multiple
                counter++;
                
            } else {
                System.out.println(i);
            }
        }
        System.out.println("TRADITION!");
    }
}