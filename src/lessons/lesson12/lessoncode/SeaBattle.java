package lessons.lesson12.lessoncode;

public class SeaBattle {
    public static void main(String[] args) {
        String[][] mySeaBattleBoard = new String[10][10];
        String[][] opponentSeaBattleBoard = new String[10][10];

        createBoard(mySeaBattleBoard);
        createBoard(opponentSeaBattleBoard);

        printBoard(mySeaBattleBoard,opponentSeaBattleBoard);
        System.out.println("----------");
        //printBoard(opponentSeaBattleBoard);

    }

    private static void printBoard(String[][] mySeaBattleBoard, String[][] opponentSeaBattleBoard) {
        for (int i = 0; i < mySeaBattleBoard.length; i++) {
            for (int j = 0; j < mySeaBattleBoard[0].length; j++) {
                System.out.print(" " + mySeaBattleBoard[i][j] + " ");
            }

            System.out.print("                   ");
            for (int j = 0; j < opponentSeaBattleBoard[0].length; j++) {
                System.out.print(" " + opponentSeaBattleBoard[i][j] + " ");
            }

            System.out.println();
        }
    }

    private static void createBoard(String[][] mySeaBattleBoard) {
        for (int i = 0; i < mySeaBattleBoard.length; i++) {
            for (int j = 0; j < mySeaBattleBoard[0].length; j++) {
                    mySeaBattleBoard[i][j] =  coordinates(i,j);
            }
        }
    }

    public static String coordinates(int x, int y){
        String[] letters = {"а","б","в","г","д","е","ж","з","и","к"};
        String[] numbers = {"1","2","3","4","5","6","7","8","9","10"};

        String ourCellCoordinates = "" + letters[x] + numbers[y];

        return ourCellCoordinates;
    }
}
