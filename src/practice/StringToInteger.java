package practice;

import java.util.Scanner;

/**
 * Created by melayer on 10/11/17.
 */
public class StringToInteger {
    public static void main(String[] args) {
        String s="500";
        int i=Integer.parseInt(s);
        System.out.println(s+100);
        System.out.println(i+100);

    }
}
class IntegerToString //extends StringToInteger
{
    public static void main(String[] args) {
        int i=500;
        String s=Integer.toString(i);
        System.out.println(i+100);
        System.out.println(s+100);
    }
}

class ToConvert
{
    public static void main(String[] args) {


        String s;
       int b;

        Scanner obj=new Scanner(System.in);
        System.out.println("Enter value : ");
        s=obj.next();
        int i=Integer.parseInt(s);
        System.out.println("String to Integer: "+i);
        System.out.println(s+100);
        System.out.println(i+100);
        System.out.println("Enter Value : ");
        b=obj.nextInt();
        String a=Integer.toString(b);
        System.out.println("Integer to String: "+a);
        System.out.println(a+100);
        System.out.println(b+100);
    }
}
