package alpha.pattern;

public class hollowRectangle {

    public static void hollowrectangle(int totrow, int totcol){
        //outer loop
        for(int i=1;i<=totrow;i++){
            for(int j=1;j<=totcol;j++){
                if(i==1||i==totrow || j==1||j==totcol){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void floyds(int n){
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+"");
                k++;
            }
            System.out.println();
        }
    }

    public static void invertedNumberPyramid(int n){

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void invertedPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String []args){
        //Scanner scan=new Scanner(System.in);
        // for printing rombus pattern
        hollowrectangle(4,5);

    }
}
