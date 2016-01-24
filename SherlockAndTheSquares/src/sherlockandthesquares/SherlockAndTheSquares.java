package sherlockandthesquares;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/sherlock-and-squares
 * 
 * @author tomwilkins
 */
public class SherlockAndTheSquares {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int noTest = Integer.parseInt(in.nextLine());
        
        for(int i = 0; i < noTest; i++)
            printSquareNumbers(in.nextLine());
        
    }
    
    private static void printSquareNumbers(String aAndB){
        String[] tempSplit = aAndB.split(" ");
        
        int a = Integer.parseInt(tempSplit[0]);
        int b = Integer.parseInt(tempSplit[1]);
        
        int noOfSq = 0;
        
        for(int i = a; i <= b; i++){
            
            int sqrt = (int) Math.sqrt(i);
            if(sqrt * sqrt == i)
                noOfSq++;
            
        }
        
        System.out.println(noOfSq);
    }
    
}
