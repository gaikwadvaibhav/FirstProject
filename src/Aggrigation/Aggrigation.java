package Aggrigation;

import java.util.Scanner;

/**
 * Created by melayer on 4/11/17.
 */
public class Aggrigation {
    int r;
    double pi=3.14;
    double area;
    Aggrigation(int r)
     {


            area = pi * (r * r);

        this.r=r;
       // this.pi=pi;
        //this.area=area;
    }
}
class square
{
    int a;
    int result;
    Aggrigation obj;
    square(int a, Aggrigation obj)
     {

        result = (a * a);

        this.a = a;
        //this.result = result;
        this.obj = obj;
    }
    void display()
    {
        System.out.println("Area Of Circle: "+obj.area+" "+"Square of given number is: "+result);
    }

    public static void main(String[] args) {
        System.out.println("Enter value of radious: ");

        Scanner obj = new Scanner(System.in);
        int abc = obj.nextInt();
        Aggrigation aggrigation=new Aggrigation(abc);
        System.out.println("Enter number for square: ");

        Scanner scanner = new Scanner(System.in);
        int z = scanner.nextInt();
        square obj1=new square(z,aggrigation);
        obj1.display();

    }


    }


