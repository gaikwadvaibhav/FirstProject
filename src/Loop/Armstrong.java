package Loop;

import java.util.Scanner;

/**
 * Created by melayer on 11/10/17.
 */
public class Armstrong {

    static int r,a;
            int n=0;
    void armstrongnum() {
        int temp = a;
        do
        {

            System.out.println("value of a : "+a);
            r = a % 10;
            System.out.println("r : "+r);
            a = a / 10;
            n = n + (r * r * r);

        } while (r > 0);
        System.out.println(n);

        if (temp==n)
        {
            System.out.println("Entered value is armstrong ");
        }else {
            System.out.println("Entered value is not armstrong ");
        }
    }
        public static void main(String[] args)
    {
        System.out.println("Enter the value of a :");
        Scanner arm=new Scanner(System.in);
        a=arm.nextInt() ;
        Armstrong arms=new Armstrong();
        arms.armstrongnum();
    }

}
