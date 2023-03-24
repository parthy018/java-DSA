package alpha.pattern;

public class butterflyPattern {

    public static void butterfly(int n){
        for(int i=1;i<=n;i++){
            //for stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // for spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //for stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // for spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //for stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void solidRombus(int n){
        for(int i=1;i<=n;i++){

            //for spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void hollow_rombus(int n){

        for(int i=1;i<=n;i++){

            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            for(int j=1;j<=n;j++){
                if(i==1 || i==n ||j==1 ||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String []args){
    //butterfly(4);
  //  solidRombus(5);
    hollow_rombus(5);
    }
}
