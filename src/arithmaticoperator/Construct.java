package arithmaticoperator;

import java.util.Scanner;

/**
 * Created by melayer on 12/10/17.
 */
public class Construct {
    static int a,b,result;

  Construct () {
      result = a + b;
      System.out.println("Addition of given number is :" + result);
check();
grade();
      result = a - b;
      System.out.println("Sub of given number is :" + result);
check();
grade();
      result = a * b;
      System.out.println("Mul of given number is :" + result);
check();
grade();
      result = a / b;
      System.out.println("Div of given number is :" + result);
  check();
  grade();
  }



  void check() {
      if (result % 2 == 0) {
          System.out.println("Result is Even number");
      } else {
          System.out.println("Result is odd number");
      }
  }
  void grade() {
      if (result < 0) {
          System.out.println("Result is below 0");

      }
      else if(result>=0 && result<35)
      {
System.out.println("below 35");
      }
      else if(result>=35 && result<60)
      {
          System.out.println("greater than 35 and below 60");
      }else if(result>=60 && result<100)
      {
          System.out.println("greater than 60 and below 100");
      }
      else
      {
          System.out.println("greater than 100");
      }
  }

    public static void main(String[] args)

    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter value for a & b: ");
        a=scanner.nextInt();
        b=scanner.nextInt();
        Construct obj=new Construct();

    }

}
