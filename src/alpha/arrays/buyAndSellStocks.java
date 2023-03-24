package alpha.arrays;

import java.util.Scanner;

public class buyAndSellStocks {

    public static int buyandsell(int prices[]){
        int maxProfit=0;
        int n=prices.length;
        int buyPrice=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(buyPrice<prices[i]) {
              int profit=prices[i]-buyPrice;
                 maxProfit=Math.max(maxProfit,profit);
            }else{
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String []args){

        Scanner scan=new Scanner(System.in);
        System.out.println("enter number of element in array ");
        int n=scan.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=scan.nextInt();
        }
        int profit=buyandsell(array);
        System.out.println("maximum profit earn is: "+profit);
    }
}
