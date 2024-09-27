public class wincon {
  // Variable for win or loose of the player
  boolean playerWR = false;
  boolean playerWY = false;
  int vertplayer1 = 0;
  int vertplayer2 = 0;


// Check if the condition met for up and down
  public void checkVertical(int [][] checkV) {
    for (int i = 5; i > 0; i--) {
      vertplayer1 = 0;
      vertplayer2 = 0;
      for (int j = 0; j < 4; j++) {
        if (checkV[i][j] == 1) {
          if ((checkV[i][j+1] == 1) && (checkV[i][j+2] == 1) && (checkV[i][j+3] == 1)) {
            vertplayer1+=4;
          }
        }else if (checkV[i][j] == 2) {
          if ((checkV[i][j+1] == 2) && (checkV[i][j+2] == 2) && (checkV[i][j+3] == 2)) {
            vertplayer2+=4;
          }
        }
        if(vertplayer1 == 4){
          System.out.println("\n");
          System.out.println("Player 1 wins!");
          playerWR = true;
          break;
        }else if(vertplayer2 == 4){
          System.out.println("\n");
          System.out.println("Player 2 wins!");
          playerWY = true;
          break;
          }
      }
    }
  }

  // Check if the condition met for left and right
  public void checkHorizontal(int [][] checkH) {
    for (int i = 5; i > 2; i--) {
      vertplayer1 = 0;
      vertplayer2 = 0;
      for (int j = 0; j < checkH[0].length; j++) {
        if (checkH[i][j] == 1) {
          if ((checkH[i-1][j] == 1) && (checkH[i-2][j] == 1) && (checkH[i-3][j] == 1)) {
            vertplayer1+=4;
          }
        }else if (checkH[i][j] == 2) {
          if ((checkH[i-1][j] == 2) && (checkH[i-2][j] == 2) && (checkH[i-3][j] == 2)) {
            vertplayer2+=4;
          }
        }
        if(vertplayer1 == 4){
          System.out.println("\n");
          System.out.println("Player 1 wins!");
          playerWR = true;
          break;
        }else if(vertplayer2 == 4){
          System.out.println("\n");
          System.out.println("Player 2 wins!");
          playerWY = true;
          break;
          }
      }
    }
  }

//Check if the condition met for diagonally
  public void checkDiagonally(int [][] checkD) {

    // Loops to check for right side
    for (int i = 5; i > 2; i--) {
      vertplayer1 = 0;
      vertplayer2 = 0;
      for (int j = 0; j < 4; j++) {
        if (checkD[i][j] == 1) {
          if ((checkD[i-1][j+1] == 1) && (checkD[i-2][j+2] == 1) && (checkD[i-3][j+3] == 1)) {
            vertplayer1+=4;
          }
        }else if (checkD[i][j] == 2) {
          if ((checkD[i-1][j+1] == 2) && (checkD[i-2][j+2] == 2) && (checkD[i-3][j+3] == 2)) {
            vertplayer2+=4;
          }
        }
        if(vertplayer1 == 4){
          System.out.println("\n");
          System.out.println("Player 1 wins!");
          playerWR = true;
          break;
        }else if(vertplayer2 == 4){
          System.out.println("\n");
          System.out.println("Player 2 wins!");
          playerWY = true;
          break;
          }
      }
    }

    // Loops to check for left side
    for (int i = 5; i > 2; i--) {
      vertplayer1 = 0;
      vertplayer2 = 0;
      for (int j = 6; j > 2; j--) {
        if (checkD[i][j] == 1) {
          if ((checkD[i-1][j-1] == 1) && (checkD[i-2][j-2] == 1) && (checkD[i-3][j-3] == 1)) {
            vertplayer1+=4;
          }
        }else if (checkD[i][j] == 2) {
          if ((checkD[i-1][j-1] == 2) && (checkD[i-2][j-2] == 2) && (checkD[i-3][j-3] == 2)) {
            vertplayer2+=4;
          }
        }
        if(vertplayer1 == 4){
          System.out.println("\n");
          System.out.println("Player 1 wins!");
          playerWR = true;
          break;
        }else if(vertplayer2 == 4){
          System.out.println("\n");
          System.out.println("Player 2 wins!");
          playerWY = true;
          break;
          }
      }
    }
  }
}