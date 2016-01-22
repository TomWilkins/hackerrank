package timesolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeSolution {

    /**
     * https://www.hackerrank.com/challenges/time-conversion
     * 
    * Given a time in AM/PM format, convert it to military (24-hour) time.
    *
    * Midnight is 12:00:00AM on a 12-hour clock and 00:00:00 on a 24-hour clock. 
    * Noon is 12:00:00PM on a 12-hour clock and 12:00:00 on a 24-hour clock.
    *
    * input: A time in 12-hour clock format (i.e.: hh:mm:ssAM or hh:mm:ssPM), where 01≤hh≤12.
    * output: Convert and print the given time in 24-hour format, where 00≤hh≤23.
    */
    public static void main(String[] args) {

        
    }
    
    // Reads the time from command line
    private static String readTime(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String time = "";
        
        try{
            time = br.readLine();
        }catch(IOException e){
            // would handle it here in a real problem
        }
        
        return time;
    }
    
    private static void solution1(){
        // assume success (only for this type of 'test')
        String time = readTime();
        
        String militaryTime = "";
        
        int hours = Integer.parseInt(time.split(":")[0]);
        
        // Change hours to military format
        if(time.contains("PM")){
            
            // Handle noon
        if(hours != 12)
                hours += 12;
        }else{ // AM
            
            // Handle midnight
            if(hours == 12)
                hours = 0;
        }
        
        // Construct string
        if(hours < 10)
            militaryTime = "0" + hours;
        else
            militaryTime = hours + "";
        
        militaryTime += ":" + time.split(":", 2)[1];
        
        if(militaryTime.contains("AM"))
            militaryTime = militaryTime.replace("AM", "");
        else
            militaryTime = militaryTime.replace("PM", "");
            
        
        System.out.println(militaryTime);
    }
    
    private static void solution2(){
        try{
           SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
           SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa");
           Date date = parseFormat.parse(readTime());
           System.out.println(displayFormat.format(date));
       }catch(ParseException e){
           
       }
    }
}
