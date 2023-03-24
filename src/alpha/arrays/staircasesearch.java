package alpha.arrays;

public class staircasesearch {
    public  static  boolean stairCaseSearch(int matrix[][],int key){

        int row=0;
        int col=matrix[0].length-1;
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
        int arr[][]={ {0,2,6},
                {5,4,7},
                {2,4,8}};
        int key=7;
        stairCaseSearch(arr,key);
    }
}
