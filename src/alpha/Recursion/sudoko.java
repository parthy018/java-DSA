package alpha.Recursion;

public class sudoko {

    public static boolean isSafe(int sudoko[][],int row,int col,int digit){
        // for column
        for(int i=0;i<9;i++){
            if(sudoko[i][col]==digit){
                return false;
            }
        }

        //for row
        for(int j=0;j<9;j++){
            if(sudoko[row][j]==digit){
                return false;
            }
        }

        //grid
        int sr=(row)/3*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++)
        {
            for(int j=sc;j<sc+3;j++){
                if(sudoko[i][j]==digit){
                    return false;
                }
            }
        }

        return false;
    }



    public static boolean sudokoSolver(int sudoko[][],int row,int col){
        //base case
        if(row==9 && col==0){
            return true;
        }
        //recursion
        int nextRow=row,nextcCol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextcCol=0;
        }
        if(sudoko[row][col]!=0){
            return sudokoSolver(sudoko,nextRow,nextcCol);
        }

        for(int digit=0;digit<=9;digit++){
            if(isSafe(sudoko,row,col,digit)){
                sudoko[row][col]=digit;
              if (sudokoSolver(sudoko,nextRow,nextcCol)){
                return true;
              }
              sudoko[row][col]=0;
            }
        }
        return true;
    }
    public static  void printBord(int sudoko[][]){
        for(int i=0;i< sudoko.length;i++){
            for(int j=0;j< sudoko.length;j++){
                System.out.print(sudoko[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String []args){

        int sudoko[][]= {{0, 0, 8, 0, 0, 0, 0, 0, 0},
                {4, 9, 0, 1, 5, 7, 0, 0, 2},
                {0, 0, 3, 0, 0, 4, 1, 9, 0},
                {1, 8, 5, 0, 6, 0, 0, 2, 0},
                {0, 0, 0, 0, 2, 0, 0, 6, 0},
                {9, 6, 0, 4, 0, 5, 3, 0, 0},
                {0,3,0,0,7,2,0,0,4},
                {0,4,9,0,3,0,0,5,7},
                {8,2,7,0,0,9,0,1,3}};
            if(sudokoSolver(sudoko,0,0) ){
                System.out.println("solution exit ");
                printBord(sudoko);
            }else{
                System.out.println("solution not exit");
            }


    }
}
