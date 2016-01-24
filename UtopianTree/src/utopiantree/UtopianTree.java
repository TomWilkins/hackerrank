package utopiantree;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/utopian-tree
 */
public class UtopianTree {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int noTest = in.nextInt();
        
        for(int i = 0; i < noTest; i++)
            getHeight(in.nextInt());
        
    }
    
    private static void getHeight(int noOfCycles){
        
        int height = 1;
        
        int noOfSeasons = noOfCycles * 2;
        
        //Planted on the onset of Spring = Winter. 
        //So start on Winter
        for(int i = 0; i < noOfSeasons; i++){
            
            int season = i % 4;
            
            // Winter will be 0, 3, 6 etc 
            if(season == 0){
            }else
            // Spring will be 1, 4, 7 etc
                if(season == 1){
                height = height * 2;
            }else
            // Summer will be 2, 5, 8 etc
                if(season == 2){
                height++;
            }else 
            // Autumn will be 3, 6, 9 etc
                if(season == 3){
            }
            
        }
        
        System.out.println(height);
    }
    
}
