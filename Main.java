
/**
 * Random guessing game
 *
 * @author (Robert)
 * @version (5/21/19)
 */

import java.util.Scanner;
public class Main
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        
   
        Scanner in = new Scanner(System.in);
        double correctAnswer = Math.round((Math.random() * 10)+ 1);

        boolean guessWrong = true;
        int guessCounter = 0;
        double perviousInput = 0;
        
        while(guessWrong) {
            
            System.out.println("Guess and number bewteen 1-10");
            double userInput = in.nextInt();
             
            //output reposnse 
            if (userInput != perviousInput) {
                guessCounter++;
            }
            
            //Store Current guess in to perviousInput
            perviousInput = userInput;
            
             if (userInput < 0 || userInput > 10 ) {
           
            } else if(userInput == correctAnswer) {
                System.out.println("correct guess");
                System.out.println("Number of Guesses: " + guessCounter);
                guessWrong = false;
                
            } else if (userInput < correctAnswer) {
                System.out.println("Too small");
               
            } else if (userInput > correctAnswer) {
                System.out.println("Too large");
               
            } else {
                System.out.println("Error");
                break;
                
            }
 
            
            
            
            
           
            

    }
}
    
}
