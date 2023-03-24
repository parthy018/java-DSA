package alpha.Recursion;

public class RatInMaze {

    public static  void printSolution(int ans[][]){
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans.length;j++){
                System.out.print(" "+ans[i][j] +" ");
            }
            System.out.println();
        }
    }

    public static boolean solve(int maze[][]){
        int N= maze.length;
        int ansMaze[][]=new int[N][N];
        if(solveMaze(maze,0,0,ansMaze)==false){
            System.out.println("solution does not exit");
            return false;

        }
        printSolution(ansMaze);
        return true;
    }
    public static boolean isSafe(int maze[][],int row,int col){
        return (row< maze.length && col< maze.length && maze[row][col]==1);
    }

    public static boolean solveMaze(int maze[][],int row,int col,int ansMaze[][]){
        if(row== maze.length-1 && col== maze.length-1 && maze[row][col]==1){
            ansMaze[row][col]=1;
            return true;
        }

        if(isSafe(maze,row,col)){
            if(ansMaze[row][col]==1){
                return false;
            }
            ansMaze[row][col]=1;
            if(solveMaze(maze,row+1,col,ansMaze)){
                return true;
            }
            if(solveMaze(maze,row,col+1,ansMaze)){
                return true;
            }
            ansMaze[row][col]=0;
            return false;

        }
            return false;
    }
    public static void main(String []args){

        int maze[][] = { { 1, 0, 0, 0 },{ 1, 1, 0, 1 },{ 0, 1, 0, 0 },{ 1, 1, 1, 1 } };

            solve(maze);
    }
}
