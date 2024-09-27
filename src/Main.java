// Import java.util package and Scanner class
import java.util.Scanner;

//red 1 yellow 2

//Khang Ho, Marvan EKanayake, Yushu Ding

class Main {
  public static void main(String[] args) {
	// Creating a Scanner object
	// Create an array to represent the board, a turn variable,
	// and two player variable to check if they win
    Scanner sc = new Scanner (System.in);
    int column1;
    int [][] connect = {{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0}};
    boolean playerWinR = false;
    boolean playerWinY = false;
    int turn= 2;
    
    // Create a display object, user object, and wincon object
    display display = new display();
    user user = new user();
    wincon wincon = new wincon();
    
    // Show the welcome message and introduce user to the board game
    System.out.println("Welcome to Connect 4, when asked, please select a column to place your token in, from column's 1-7");
    System.out.println("\n");
    
    // A loops to check if either of the player have win
    while(playerWinR == playerWinY){
    	
    // Check to rotate players turn
      if (turn == 1){
        turn = 2;
      }
      else if (turn == 2){
        turn = 1;
      }

      System.out.println("\n");
      System.out.println("\n");
      System.out.println("\n");
      
      // Ask user where they want to place the X or O
      System.out.println("What column would you like to place, player" + " " + turn);

      column1 = sc.nextInt() - 1;
      // Place user's choice and check the wining condition
      if((column1 == 0) || (column1 == 2) || (column1 == 3) || (column1 == 4) || (column1 == 5) || (column1 == 6) || (column1 == 1)) {
        if(connect[0][column1] == 0 ){
            if(turn == 1){
              user.playerturn1(connect, column1, playerWinR,playerWinY);
              display.interpret(connect);
              display.translation();
              display.showDisplay();
              wincon.checkVertical(connect);
              wincon.checkHorizontal(connect);
              wincon.checkDiagonally(connect);
              playerWinR = wincon.playerWR;
              playerWinY = wincon.playerWY;
            }

            if(turn == 2){

              user.playerturn2(connect, column1, playerWinR,playerWinY);
              display.interpret(connect);
              display.translation();
              display.showDisplay();
              wincon.checkVertical(connect);
              wincon.checkHorizontal(connect);
              wincon.checkDiagonally(connect);
              playerWinR = wincon.playerWR;
              playerWinY = wincon.playerWY;
            }
        }
      }else {
    	// Return a warning message if user's give a number out of the board
        System.out.println("Your number has to be from 1 to 7, please try again");
        column1 = 0;
        if(turn == 1) {
          turn = 2;
        }else {
          turn = 1;
        }
      }
        // Return a warning message if the current column is full
        if(connect[0][column1] > 0 ){
          System.out.println("The current column is full, please try another one!");
        }
      }
    }
  }

