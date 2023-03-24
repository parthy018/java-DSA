package alpha.Recursion;

public class ContianerMostWater {

    public static int containerWithMWater(int heigths[]){
        int maxWater=0; //maxwater= heigh of min pillar * width
        int minPiller=0;
        int minIndex=0;
        int width=1; // max index-min index
        for(int i=0;i< heigths.length;i++){
            int currentWater=1;
           if(minPiller<heigths[i]){
               minPiller=heigths[i];
               minIndex=i;
           }
            width=i-minIndex;
           int minheight=Math.min(minPiller,heigths[i]);
          currentWater =minheight*width;
          maxWater=Math.max(currentWater,maxWater);

        }
        System.out.println("width is "+width);
        System.out.println("heigth is"+minPiller+" minindex is "+minIndex);
        return maxWater;
    }

    public static void main(String []args){
        int heights[]={1,2,1};
        int ans=containerWithMWater(heights);
        System.out.println("the container with most water "+ans);
    }
}
