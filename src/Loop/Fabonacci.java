package Loop;

import java.util.Scanner;

/**
 * Created by melayer on 25/10/17.
 */
public class Fabonacci {
    static int a=1,b=0,result,num;

    void fabonacci()

    {

        //int array[]=new int[num];
        for(int i=0;i<num;i++)
        {
          result=a+b;
           System.out.println(+result);
          a=b;
          b=result;

        }

        System.out.println("result of fabonacci:"+result);



    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter value for fabonacci:"+num);
        num=scanner.nextInt();
        Fabonacci obj=new Fabonacci();
        obj.fabonacci();
    }
}
