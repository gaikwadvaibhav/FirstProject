package collegeinfo;

import java.util.Scanner;

/**
 * Created by melayer on 28/11/17.
 */
public class Subject extends Sci {

   void condition()
   {

       String n=null;
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter Subject in which you are intrested:  ");
       System.out.println("Maths Or Bio");
       n=obj.next();

    if (n.equals("Maths"))
    {
        Maths();
    }
    else
    {
        Bio();
    }
   }


    @Override
    void Maths() {
        System.out.println("You can go for: ");
        System.out.println("1.Engg");
        System.out.println("2.Bsc");

    }

    @Override
    void Bio() {
        System.out.println("You can go for: ");
        System.out.println("1.M.B.B.S");
        System.out.println("2.B.D.S");
        System.out.println("3.B.H.M.S");
        System.out.println("4.B.A.M.S");
    }
    /*public static void main(String[] args) {
        Subject obj=new Subject();
        obj.condition();

    }*/
}
