import java.util.Objects;
import java.util.Scanner;

public class MineSweeper {
    int row;
    int column;
    int userRow;
    int userColumn;
    boolean isOk=true;
    int mineCount;


    public MineSweeper(int row, int column) {
        this.row=row;
        this.column=column;
    }

    //win durumu kontrol edilmeli
    public void run(){
        if(checkBoard()){
        this.mineCount= (this.row*this.column)/4;
        String [][] gameBoard = new String[this.row][this.column];
        String [][] answerGameBoard = new String[this.row][this.column];
        for(int i=0; i<this.row;i++){
            for(int j=0; j<this.column; j++){
                gameBoard[i][j]="-";
                answerGameBoard[i][j]="-";
            }
        }
        int placedMines = 0;
        while (placedMines < mineCount) {
            int randRow = (int)(Math.random() * this.row);
            int randCol = (int)(Math.random() * this.column);
            if (!answerGameBoard[randRow][randCol].equals("*")) {
                    answerGameBoard[randRow][randCol] = "*";
                    placedMines++;
            }
        }
        //answer board
       /* for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++)
                System.out.print(answerGameBoard[i][j] + " ");
            System.out.println();
        } */
        System.out.println("Welcome to the Mine Sweeper game! Please enter a coordinate");
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++)
                System.out.print(gameBoard[i][j] + " ");
            System.out.println();
        }
        game(answerGameBoard,gameBoard);
            if (this.isOk) {
                System.out.println("You won! Final board:");
                for (int i = 0; i < this.row; i++) {
                    for (int j = 0; j < this.column; j++)
                        System.out.print(gameBoard[i][j] + " ");
                    System.out.println();
                }
            } else {
                System.out.println("Game Over! Here were the mines:");
                for (int i = 0; i < this.row; i++) {
                    for (int j = 0; j < this.column; j++)
                        System.out.print(answerGameBoard[i][j] + " ");
                    System.out.println();
                }
            }
        }
    }


     //check if board is bigger than 2x2
     public boolean checkBoard(){
         if(this.row <2 || this.column<2){
             System.out.println("Row and Column can not be smaller than 2. Please enter bigger numbers.");
             return false;
         }
         else {
             return true;
         }
     }
     //to take input from user and check if it has the mine
      public void game(String[][] array1,String[][] array2) {
          Scanner scanner = new Scanner(System.in);
          while (this.isOk) {
              if(isWin(array2)){
                  System.out.println("You won!!");
                  break;
              }
              int count = 0;
              System.out.println("Please enter a row ");
              this.userRow = scanner.nextInt();
              System.out.println("Please enter a column");
              this.userColumn = scanner.nextInt();
              if (userRow < 0 || userRow >= row || userColumn < 0 || userColumn >= column) {
                  System.out.println("Out of board limits! Try again.");
                  continue;
              }
              if (checkCoordinates(this.userRow, this.userColumn, array2)) {
                  if (Objects.equals(array1[userRow][userColumn], "-")) {
                      this.isOk = true;
                      //check mines around the coordinate
                      for (int i = this.userRow - 1; i <= this.userRow + 1; i++) {
                          for (int j = this.userColumn - 1; j <= this.userColumn + 1; j++) {
                              if (i >= 0 && i < array1.length && j >= 0 && j < array1[0].length) {
                                  if (Objects.equals(array1[i][j], "*")) {
                                      count++;
                                  }
                              }
                          }
                      }
                      //display current gameboard
                      array2[userRow][userColumn] = String.valueOf(count);
                      for (int i = 0; i < this.row; i++) {
                          for (int j = 0; j < this.column; j++)
                              System.out.print(array2[i][j] + " ");
                          System.out.println();
                      }
                  }
                  //if the coordinate contains mine
                  else if (Objects.equals(array1[userRow][userColumn], "*")) {
                      this.isOk = false;
                      array2[userRow][userColumn] = "*";
                      System.out.println("You lost!");
                      break;
                  }
              }
              //check if the coordinate is already entered
              else {
                  System.out.println("You already enter this coordinate!");
                  continue;
              }
          }
      }
      //method for check if coordinate is already entered
      public boolean checkCoordinates(int number1, int number2, String[][] array){
          return Objects.equals(array[number1][number2], "-");
      }

      public boolean isWin(String[][] array){
        int counter=0;
         for(int i =0; i< this.row; i++){
             for(int j=0; j<this.column; j++){
                 if(Objects.equals(array[i][j], "-")){
                     counter++;
                 }
             }
         }
          return counter == this.mineCount;
      }
}
