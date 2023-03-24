package com.company;
import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int numOfGusesses=0;


    public int getNumOfGusesses() {
        return numOfGusesses;
    }

    public void setNumOfGusesses(int numOfGusesses) {
        this.numOfGusesses = numOfGusesses;
    }


    Game(){
        Random rand=new Random();
        this.number=rand.nextInt();
    }

    void takeUserInput(){
        System.out.print("Enter number: ");
        Scanner scan=new Scanner(System.in);
        inputNumber=scan.nextInt();
    }
    boolean isCorrectNumber(){
        numOfGusesses++;
        if(inputNumber==number){
            System.out.println("you have guessed  number "+number+"right in "+numOfGusesses+" number of attempts");

            return true;
        }
        else if(inputNumber<number){
            System.out.println("too low..........");
        }else if(inputNumber>number){
            System.out.println(" too high......");
        }return false;
    }


}



public class RandomNumber {
public static void main(String []args){
    boolean b=false;
    while(!b) {
        Game g = new Game();
        g.takeUserInput();
        b = g.isCorrectNumber();
        System.out.println(b);
    }
}

}
