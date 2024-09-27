
public class user{
	// Create a count variable
    int count = 0;
    
    // Fill the board with empty space to make user column selection fall with gravity
    public int [][] playerturn1(int connect [][], int column1, boolean playerWinR,  boolean playerWinY){
      count = 0;
        if(playerWinY==playerWinR)
            for (int r = 5; r > 0; r--){
                    if (connect[r][column1] == 0){
                    count = count + 1;
                    }

                }
              connect[count][column1]= 1;
            return connect;
            }

    // Fill the board with empty space to make user column selection fall with gravity
    public int [][] playerturn2(int connect [][], int column1, boolean playerWinR,  boolean playerWinY){
      count = 0;

        if(playerWinY==playerWinR)
            for (int r = 5; r > 0; r--){
                    if (connect[r][column1] == 0){
                    count = count + 1;
                    }

            }
              connect[count][column1]= 2;
              return connect;

      }
}



