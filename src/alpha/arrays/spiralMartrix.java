package alpha.arrays;

import java.util.Scanner;


public class spiralMartrix {
    public static void spiral(int A[][]){
    int n=A.length;
    int m=A[0].length;
    int row_start=0,row_end=n-1,col_start=0,col_end=m-1;
    while(row_start<=row_end && col_start<=col_end){
        //printing row first
        for(int i=col_start;i<=col_end;i++){
            System.out.print(A[row_start][i]+" ");
        }
        row_start++;
        // last column
        for(int j=row_start;j<=row_end;j++){
            System.out.print(A[j][col_end]+" ");
        }
        col_end--;

        //printing last row
        for(int i=col_end;i>=col_start;i--){
            if(row_start==row_end){
                break;
            }
            System.out.print(A[row_end][i]+" ");
        }
        row_end--;

        //printing column first
        for(int i=row_end;i>=row_start;i--){
            if(col_start==col_end){
                break;
            }
            System.out.print(A[i][col_start]+" ");
        }
        col_start++;
    }
    }
    public static int diagonalSum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
            int j= matrix.length-i-1;
            if(i!=j)
                sum+=matrix[i][j];
        }
        return sum;
    }

    public  static  boolean stairCaseSearch(int matrix[][],int key){

        int row=0;
        int col=matrix[0].length;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("key found at index ("+row+","+col+")");
                return true;
            }else if(key<matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;

    }
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m= scan.nextInt();
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
       /* for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=scan.nextInt();
            }
        }*/
        spiral(matrix);
        int arr[][]={ {0,2,6},
                      {5,4,7},
                      {2,4,8}};
        int ans=diagonalSum(arr);
        System.out.println();
        System.out.println("diagonal sum is "+ans);
        boolean s=stairCaseSearch(matrix,10);
        System.out.println(s);
    }
}
