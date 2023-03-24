package alpha.Recursion;

import java.util.ArrayList;

public class permutation {

    public static void permuTation(String str, String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        //recursion
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            permuTation(newstr,ans+curr);
        }
    }

    public static void main(String []args){
      /*  String str="abc";
        permuTation(str,"");
        System.out.println(str);*/
        String st="12";
        int d=Character.getNumericValue(st.charAt(1));
        System.out.println(d+5);
    }
}
