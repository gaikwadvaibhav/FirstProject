package practice;

import java.util.Scanner;

/**
 * Created by melayer on 13/11/17.
 */
public class SumAverage {
    public static void main(String[] args) {
        int a,b,c,d,e;
        int sum;
        int avg;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter First Number: ");
        a=obj.nextInt();
        System.out.println("Enter second Number: ");
        b=obj.nextInt();
        System.out.println("Enter Third Number: ");
        c=obj.nextInt();
        System.out.println("Enter forth Number: ");
        d=obj.nextInt();
        System.out.println("Enter Fifth Number: ");
        e=obj.nextInt();

        sum=a+b+c+d+e;
    }
}
