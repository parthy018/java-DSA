package alpha.Recursion;

public class recursionProblem {
    static int optimizedPower(int x,int a){
        if(a==0){
            return 1;
        }
        int half=optimizedPower(x,a/2);
       // int halfPowersq=optimizedPower(x,a/2) * optimizedPower(x,a/2);
        int halfPowersq=half *half;
        if(a%2!=0){
            halfPowersq=x * halfPowersq;
        }
        return halfPowersq;
    }

        static int filltile(int n){
        if(n==0 || n==1){
            return 1;
        }

        int vertical=filltile(n-1);
        int horizontal=filltile(n-2);
        int totalway=vertical+horizontal;

        return totalway;
        }
    public static void main(String []args){

        int ans=optimizedPower(2,5);
        System.out.println(ans);
        System.out.println(filltile(5));

    }
}
