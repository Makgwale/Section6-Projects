import java.util.Objects;
import java.util.Scanner;

public class Proj6_2_TicTacToe {
    public static String[][] boardValues = new String[3][3];
    public static char[] player = {'X','O'};


    public static void main(String[] args) {
        runGame();
    }// end of main
    public static void runGame(){
        int pos = 0;
        initializeGame();
        printBroad(boardValues);

        System.out.println(isBoardFull(boardValues));

        while (!isBoardFull(boardValues)){
            getUserInput(pos, boardValues);
            printBroad(boardValues);
            pos = getPlayer(pos);
        }

    }//end of runGame
    public static void initializeGame(){
        //setting the board to null/space value
        for(int i = 0; i < boardValues.length; i++){
            for(int j = 0; j < boardValues[i].length; j++){
                boardValues[i][j] = " ";
            }
        }
    }//end of initialize
    public static void printBroad(String[][] myboard){
        System.out.println(boardValues[0][0] + " |" + boardValues[0][1] + " |" + boardValues[0][2]);
        System.out.println("- - - - -");
        System.out.println(boardValues[1][0] + " |" + boardValues[1][1] + " |" + boardValues[1][2]);
        System.out.println("- - - - -");
        System.out.println(boardValues[2][0] + " |" + boardValues[2][1] + " |" + boardValues[2][2]);
        System.out.println("- - - - -");
    }//end printBroad

    public static void getUserInput(int pos, String[][] values){
        Scanner keyboard = new Scanner(System.in);
        String selectionInput;
        String row;
        String col;

        int rowNum;
        int colNum;

        //Prompting the relevent player and getting their selection slot.
        System.out.println("It is " + player[pos] + "'s turn.");
        System.out.println("Please enter the row THEN the column, each from 1, 0, or 2, separated by a space");
        selectionInput = keyboard.nextLine();

        row = selectionInput.substring(0,1);
        col = selectionInput.substring(2);

        rowNum = Integer.parseInt(row);
        colNum = Integer.parseInt(col);

        cellAlreadyOccupied(rowNum,colNum,pos,values);
    }

    //Get Player
    public static int getPlayer(int pos){

        //Assigning the next player
        if(pos == 0){
            pos += 1;
        }
        else{
            pos -=1;
        }

        return pos;
    }

    public static void cellAlreadyOccupied(int rowNum, int colNum, int pos, String[][] values){
        // check if the selected position is empty
        if(values[rowNum][colNum] == " "){
            //Placing their selection on the board
            values[rowNum][colNum] = String.valueOf(player[pos]);
        }
        else{
            System.out.println("Slot already occupied");
        }
    }//end cellAlreadyOccupied

    //after accepting the value check if the board is full before prompting the next user.
    public static boolean isBoardFull(String[][] values){
        int count = 0;
        for(int i = 0; i < values.length; i++){
            for(int j = 0; j < values[i].length; j++){
                if(!values[i][j].equals(" ")){
                    count += 1;
                }
            }
        }

        System.out.println(count);
        if(count == 9){
            return true;
        }
        else
            return false;
    }//end of isBoardFull

}
