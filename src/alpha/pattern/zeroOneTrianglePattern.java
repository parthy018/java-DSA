package alpha.pattern;

public class zeroOneTrianglePattern {
    public static void zeroOnePattern(int line){
        //outer loop
        int k;
        for (int i=1;i<=line;i++){
            if(i%2==0) {
                k = 0;
            }else{
                k=1;
            }
            for(int j=1;j<=i;j++) {
                System.out.print(k + " ");
                if (k == 1) {
                    k = 0;
                } else {
                    k = 1;
                }
            }
            System.out.println();
        }
    }

    public static void secodMethod(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1"+" ");
                }else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String []args){
        zeroOnePattern(5);
        secodMethod(5);
    }
}
