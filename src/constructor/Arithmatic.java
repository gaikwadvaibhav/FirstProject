package constructor;

import java.util.Scanner;

/**
 * Created by melayer on 5/10/17.
 */
public class Arithmatic
{

    static int a, b,c,d, result;
    Arithmatic()
    {
        result=a+b;
        System.out.println("the addition is: "+result);
    }
    Arithmatic( int c,int d)
    {

        //this.a=a;
        //this.b=b;
        System.out.println("sub"+(c-d));
    }

    public static void main(String[] args) {
//        Scanner Add=new Scanner(System.in);
//        System.out.println("Enter the value of a & b");
//        a=Add.nextInt();
//        b=Add.nextInt();
//        Arithmatic addition=new Arithmatic(a,b);
        Scanner Sub=new Scanner(System.in);
        System.out.println("Enter the value of c & d");
        c=Sub.nextInt();
        d=Sub.nextInt();
        Arithmatic addition1=new Arithmatic(c,d);


    }
}
