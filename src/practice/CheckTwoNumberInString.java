package practice;

import java.util.Scanner;

/**
 * Created by melayer on 10/11/17.
 */
public class CheckTwoNumberInString {
    public static void main(String[] args) {
        String s1;
        String s2;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter First String: ");
        s1=obj.next();
        Scanner obj2=new Scanner(System.in);
        System.out.println("Enter Second String: ");
        s2=obj2.next();
        System.out.println("Equal: "+s1.equals(s2));// upper and lower checks
        System.out.println("Equal case ignore: "+s1.equalsIgnoreCase(s2));// all case in upper and lower doesnt matter
        System.out.println("Content Equal: "+s1.contentEquals(s2));
    }
}
