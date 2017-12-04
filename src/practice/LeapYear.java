package practice;

import java.util.Scanner;

/**
 * Created by melayer on 13/11/17.
 */
public class LeapYear {
    public static void main(String[] args) {
        int year;
        int leap;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Year: ");
        year=obj.nextInt();
        if((year%4==0)&&(year%100!=0)||(year%400==0))
        {
            System.out.println("Year is Leap");
        }
        else
        {
            System.out.println("Year is Not Leap");
        }
    }
}
