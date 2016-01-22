package angryprofessorsolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AngryProfessorSolution {

    /**
     * https://www.hackerrank.com/challenges/angry-professor
     */
    public static void main(String[] args) {
     //  try{
        
            //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
           Scanner br = new Scanner(System.in);
           
            // int numberOfTestCases = Integer.parseInt(br.readLine());
            int numberOfTestCases = br.nextInt();//Integer.parseInt(br.nextLine());
           String input;

            // Loop over the test cases
            for(int test = 0; test < numberOfTestCases; test++){

                // get number of students and cancel threshold
                //input = br.readLine();
                input = br.nextLine();
                int numStudents = Integer.parseInt(input.split(" ")[0]);
                int cancelThres = Integer.parseInt(input.split(" ")[1]);

                // get arrival times
                input = br.nextLine();
                String[] arrivalTimes = input.split(" ");

                // find number in class when it started
                int numInClass = 0;
                for(String at : arrivalTimes)
                    if(Integer.parseInt(at) <= 0)
                        numInClass++;

                // number of people in the class is less than the threshold, cancel the class
                if(numInClass < cancelThres)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
//        }catch(IOException e){
//            
//        }
    }
    
}
