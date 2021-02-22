

/**
 * Hello world!
 *
 */

import java.util.Scanner; 
  
public class App { 

    public static void guessTheNumber(){ 
        Scanner sc = new Scanner(System.in); 
  
         
        int num = 1 + (int)(100* Math.random()); //Generate number
        int attempts = 6; //number of attempts
        int i, userNumber; 
  
	System.out.println("You have 6 attempts to guess the exact number between 1 and 100");
  
        for (i = 0; i < attempts; i++) { 
  
            System.out.println("Enter a number:"); 
  
            //User input
            userNumber = sc.nextInt(); 
  
            //Exact number 
            if (num == userNumber) { 
                System.out.println("You win!"); 
                break; 
            } 
            else if (num > userNumber && i != attempts - 1) { 
                System.out.println("The number is greater than " + userNumber);
		System.out.println("You have "+ String.valueOf(attempts - i -1) +" attempts left!");  
            } 
            else if (num < userNumber && i != attempts - 1) { 
                System.out.println("The number is less than " + userNumber);
		System.out.println("You have "+ String.valueOf(attempts - i -1) +" attempts left!");  
            } 
        } 
  
        if (i == attempts){ 
            System.out.println("Game over!"); 
            System.out.println("The exact number is " + num); 
        } 
    } 
   
    public static void main( String[] args ){ 
  
        guessTheNumber(); 
    } 
} 

