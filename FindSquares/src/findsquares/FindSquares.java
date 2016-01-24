package findsquares;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/find-digits
 * 
 * @author tomwilkins
 */
public class FindSquares {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int noTest = in.nextInt();
        
        for(int i = 0; i < noTest; i++)
            getNumberDivisibleBy(in.nextInt());
        
    }
    
    private static void getNumberDivisibleBy(int number){
        
        int noDigits = String.valueOf(number).length();
        int noDivisible = 0;
        
        for(int i = 0; i < noDigits; i++){
            
            char c = String.valueOf(number).charAt(i);
            int currentValue = Integer.parseInt(c + "");
            
            if(currentValue != 0 && number % currentValue == 0)
                noDivisible++;
            
        }
        
        System.out.println(noDivisible);
    }
    
}
