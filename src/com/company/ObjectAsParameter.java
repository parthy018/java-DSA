package com.company;

class Box{
    double width;
    double height;
    double depth;

    Box(Box ob){
        width=ob.width;
        height=ob.height;
        depth=ob.depth;
    }
    Box(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    Box(double len){
        width=height=depth=len;
    }
    Box(){
        width=height=depth=-1;
    }
    double volume(){
        return width*height*depth;
    }

}

public class ObjectAsParameter {
    public static void main(String []arg){
        Box mybox1=new Box(12,15,20);
        Box mybox2=new Box();
        Box mybox3=new Box(5);

        Box myclone=new Box(mybox1);
       /*
        myclone.width=10;
        myclone.height=10;
        myclone.depth=5;
       */
        System.out.println(mybox1.volume());
        System.out.println(mybox2.volume());
        System.out.println(mybox3.volume());
        System.out.println(myclone.volume());
    }
}
