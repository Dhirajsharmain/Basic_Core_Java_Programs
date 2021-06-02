package bridgelabz;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter kow many times you want to flip coin : ");
       int flipCount = scanner.nextInt();
       int headCount=0;
       int tailCount=0;
       for (int i=0; i<flipCount; i++){
           int random =(int) Math.floor(Math.random() * 10) % 2;
           if(random == 1){
               headCount += 1;
           }
           else{
               tailCount += 1;
           }
       }
       System.out.println("Head Count Is = "+ headCount + " % = "+ countPersentage(flipCount, headCount));
        System.out.println("Tail Count Is = "+ tailCount + " % = "+ countPersentage(flipCount, tailCount));
    }
    private static float countPersentage(int flipCount, int count){
        return (float) count / flipCount * 100;
    }
}
