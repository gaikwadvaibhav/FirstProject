package Operator;

import java.util.Scanner;

/**
 * Created by melayer on 28/9/17.
 */
public class Arithmatic {

    static int a;
    static int b;
    int result;
    void add()
    {
        result=a+b;
        System.out.println("add of a & b is: "+result);
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter value for a & b: ");
        a=scanner.nextInt();
        b=scanner.nextInt();
   Arithmatic obj=new Arithmatic();
   obj.add();



    }
}
