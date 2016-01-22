package sherlockandthebeast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SherlockAndTheBeast {

    /**
     * 
     * This is a solution to https://www.hackerrank.com/challenges/sherlock-and-the-beast
     * 
     */
    public static void main(String[] args) throws IOException {
        
        // Get input values
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int numTestCases = Integer.parseInt(in.readLine());
        
        for(int i = 0; i < numTestCases; i++){
            int numOfDigits = Integer.parseInt(in.readLine());
            
            // q = number of 3s
            int q = 0;
            
            // p = number of 5s
            int p = numOfDigits;
            
            List<Long> biggestDecentNumbers = new ArrayList<>();
            
            // Loop over different combinations of 3s and 5s
            for(int j = 0; j <= numOfDigits; j++){
                
                // if all the number of 5s are divisible by 5 AND the number of 3s is divisible by 5 
                if(q % 5 == 0 && p % 3 == 0){
                    StringBuilder biggestNumber = new StringBuilder();
                    
                    for(int k =0; k < p; k++)
                        biggestNumber.append("5");
                    
                    for(int k =0; k < q; k++)
                        biggestNumber.append("3");
                    
                    biggestDecentNumbers.add(Long.parseLong(biggestNumber.toString()));
                }
                
                p--;
                q++;
            }
            
            // get biggest
            long biggest = 0;
            if(biggestDecentNumbers.isEmpty())
                biggest = -1;
            else
                for(Long t : biggestDecentNumbers)
                    if(t > biggest)
                        biggest = t;
                
            System.out.println(biggest);
            
        }
    }
    
}
