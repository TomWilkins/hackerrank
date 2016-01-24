package sherlockandthebeast;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SherlockAndTheBeast {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++)
            mySolution(in.nextInt());
    }
    
    
    /**
     * This is a solution to https://www.hackerrank.com/challenges/sherlock-and-the-beast
     */
    private static void mySolution(int numOfDigits){
        
        // q = number of 3s
        int q = 0;

        // p = number of 5s
        int p = numOfDigits;
        
        // biggest decent
        long biggest = -1;

        // Loop over different combinations of 3s and 5s
        for(int j = 0; j <= numOfDigits; j++){

            StringBuilder biggestNumber = new StringBuilder();
                
            // if number of 5s is divisible by 3
            if(p % 3 == 0)
                for(int k =0; k < p; k++)
                    biggestNumber.append("5");
                
            // if all the number of 3s are divisible by 5
            if(q % 5 == 0)
                for(int k =0; k < q; k++)
                    biggestNumber.append("3");

            if(biggestNumber.length() > 0 && Long.parseLong(biggestNumber.toString()) > biggest)
                    biggest = Long.parseLong(biggestNumber.toString());
            

            p--;
            q++;
        }

        System.out.println(biggest);
    }
    
    
    private static void jacksSolution(int digitCount){
        int numFives = -1;
        int numThrees = -1;
        StringBuilder decentNumberAsString = new StringBuilder();
        
        for (int i = digitCount / 3; i >= 0; i--) {
            if ((digitCount - 3 * i) % 5 == 0) {
                  numFives = i;
                  numThrees = (digitCount - 3 * i) / 5;
                  break;
            }
        }
        if (numFives == -1) {
            System.out.println("-1");
        }
        else
        {
            for (int i = 0; i < 3 * numFives; i++) {
               decentNumberAsString.append("5");
            }
 
           for (int i = 0; i < 5 * numThrees; i++) {
               decentNumberAsString.append("3");
           }
            
           System.out.println(decentNumberAsString);
        }
    }
}
