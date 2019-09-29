/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetimecomputation;

import java.util.Calendar;

/**
 *
 * @author fauhan.pugar
 */
public class CheckLeapYear {
    public static void main(String[] args) {
        checkLeapYear();
    }
    
    public static void checkLeapYear(){
        int year = 1900;
        boolean isLeap = false;
        if(year % 4 == 0){
            if( year % 100 == 0){
                // year is divisible by 400, hence the year is a leap year
                if ( year % 400 == 0){
                    isLeap = true;
                } else {
                    isLeap = false;
                }
            } else {
                isLeap = true;
            }
        } else{
            isLeap = false;
        }
        if(!isLeap){
            System.out.println(year + " is not a leap year.");
        } else {
            System.out.println(year + " is a leap year.");
        }
    }
}
