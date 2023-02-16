package lessons.lesson12.lessoncode;

import java.util.Arrays;

public class Chess {
    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];

        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                if ((i+j) % 2 == 0) {chessBoard[i][j] = "W" + coordinates(j,i);}
                else {
                    chessBoard[i][j] = "B" + coordinates(j,i);
                }
            }
        }

        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                System.out.print(" " + chessBoard[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static String coordinates(int x, int y){
        String letters = "abcdefgh";
        String numbers = "87654321";

        String ourCellCoordinates = "" + letters.charAt(x) + numbers.charAt(y);

        return ourCellCoordinates;
    }
}
