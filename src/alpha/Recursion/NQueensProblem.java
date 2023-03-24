package alpha.Recursion;

public class NQueensProblem {

    public static boolean isSafe(char [][]board,int row,int col){
        //for upper row
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //diagonal left up
       // int j=col-1;
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }

        }

        //diagonal right up

        for(int i=row-1,j=col+1;i>=0&& j< board.length;i--,j++){
            if (board[i][j] == 'Q') {

                return false;
            }

        }
        return true;
    }

    static void nQueens(char board[][],int row){
        if(row== board.length){
            PrintBoard(board);
            return;
        }
        for(int j=0;j<board.length;j++){
           if(isSafe(board,row,j)) {
               board[row][j] = 'Q';
               nQueens(board, row + 1);
               board[row][j] = 'x';
           }
        }
    }

    static boolean nQueensOnde(char board[][],int row){
        if(row== board.length){
            PrintBoard(board);
            return true;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)) {
                board[row][j] = 'Q';
               if(nQueensOnde(board, row + 1)){
                   return true;
                }
                board[row][j] = 'x';
            }
        }
        return false;
    }
    static  void PrintBoard(char board[][]){
        System.out.println(".................chess board....................");
        for(int i=0;i< board.length;i++){
            for(int j=0;j< board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }

    }

    public  static void main(String []args){
        int n=4;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }

        if(nQueensOnde(board,0)){
            System.out.println("solution is possible");
            PrintBoard(board);
        }else{
            System.out.println("solution is not possible");
        }
    }
}
