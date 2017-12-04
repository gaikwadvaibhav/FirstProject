package constructor;

import java.util.Scanner;

/**
 * Created by melayer on 11/10/17.
 */
public class Factorial {
static int a;
   // static Scanner obj= new Scanner(System.in);
    Factorial(int a)
    {
        int f=1;
        for(int i=1;i<=a;i++)
        {
            f=f*i;
        }
       System.out.println("factorial of given number is: "+f);
    }
    public static void main(String[] args)
    {
        System.out.println("Enter the value of a");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();

        Factorial fact=new Factorial(a);






    }

}
