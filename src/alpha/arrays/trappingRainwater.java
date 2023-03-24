package alpha.arrays;

import java.util.Scanner;

public class trappingRainwater {

    public static int trappingwater(int h[]){
        int n=h.length;
        //creating two helping array or auxilliary array
        int leftMaxBoundry[]=new int[n];
        int rightMaxboundry[]=new int[n];

        //calculating left max boundry
        leftMaxBoundry[0]=h[0];
        for(int i=1;i<n;i++){
            leftMaxBoundry[i]=Math.max(leftMaxBoundry[i-1],h[i]);
        }

        //calculating right max boundry
        rightMaxboundry[n-1]=h[n-1];
        for(int i=n-2;i>=0;i--){
            rightMaxboundry[i]=Math.max(rightMaxboundry[i+1],h[i]);
        }
        int totalWater=0;
        //calculating water level
        for(int i=0;i<n;i++){
            int waterheight=Math.min(leftMaxBoundry[i],rightMaxboundry[i]);
            int waterlevel=waterheight-h[i];
            totalWater+=waterlevel;
        }
        return totalWater;
    }
    public static void main(String []args){
        Scanner scan= new Scanner(System.in);
        int size= scan.nextInt();
        int height[]=new int[size];
        for(int i=0;i<size;i++){
            height[i]= scan.nextInt();
        }
        int ans=trappingwater(height);
        System.out.println("total trapped water is: "+ans);

    }
}
