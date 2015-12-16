
/*



* To change this license header, choose License Headers in Project Properties.


* To change this template file, choose Tools | Templates


* and open the template in the editor.


*/


package Nuncio_4_GuessingGame;

import java.util.Scanner;

import java.util.Random;



public class Nuncio_4_GuessingGame {


   /**


    * @param args the command line arguments


    */


   static boolean playAgain = true;
   static String PlayerName;

   static Scanner scanner= new Scanner(System.in);

   public static void main(String[] args) {

    Scanner name = new Scanner(System.in);

    Scanner guess = new Scanner(System.in);

    Random random = new Random();

     int number = random.nextInt(100);


   



    System.out.println(" Hello! Would would you like to play a game?");
 

    System.out.println("What's your name?");

     PlayerName= name.nextLine();
    
    System.out.println("Hello " + PlayerName + ".");


    while (playAgain = true) {


   playthegame();


}


   }


    static void playthegame() {


    Scanner guess = new Scanner(System.in);

    Random random = new Random();

    int number = random.nextInt(100);

   int counter = 0;
  


    for (int i = 0; i < 100; i++) {

    System.out.println("Please pick a number.");

    int theGuess = guess.nextInt();



    if (theGuess == number) {


       System.out.println("Congratulations! You win!");


       System.out.println(" Guess what? It took you " + counter + " tries!" );


       playSomeMore();



    }




    else if(theGuess < number) {


       System.out.println("Number too low. Try again!");  


   counter += 1;


    }


   


    else {


            System.out.println("Number too high. Please try again.");


           counter += 1;


    }


        }


   }


    static void playSomeMore() {


        System.out.println ("Do you want to play again?");


        String yn = scanner.nextLine();



       if(yn.contains("n")|| yn.contains("N")) {


   
          System.out.println("Okay, bye!");


          playAgain = false;


       }


       else if (yn.contains ("y")|| yn.contains ("Y")){


           playthegame();


       }


       else{


   System.out.println("Sorry, I don't understand.");


   playSomeMore();


    }


    }


}

