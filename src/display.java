
public class display{
  // Create 2-D arrays of the board layout
  private String [][] translated = new String [6][7];
  private int [][] layout = new int [6][7];
  //red 1 yellow 2
  
  // Transfer user's input location into the 2-D array
  public void interpret(int [][] connect){    
    for (int i = 0; i < layout.length; i++){

      for (int j = 0; j < layout[0].length ; j++){
        layout[i][j] = connect[i][j];

      }
    }

  }
  // Check if which user's give the value 
  // and assign the appropriate value into the display 2-D array
  public void translation(){

    for (int i = 0; i < layout.length; i++){

      for (int j = 0; j < layout[0].length; j++){

          if(layout[i][j] == 0){
            translated[i][j] = "-";
          }

          if(layout[i][j] == 1){
            translated[i][j] = "x";
          }

          if(layout[i][j] == 2){
            translated[i][j] = "o";
          }
        }
    }
  }
  
  // Display the user's input for the board item location
  public void showDisplay(){

    for (int i = 0; i < translated.length; i++){
      System.out.print("\n");

      for (int j = 0; j < translated[0].length; j++){
        System.out.print(translated[i][j] + " ");
      }
    }
  }
}