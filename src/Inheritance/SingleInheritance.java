package Inheritance;

/**
 * Created by melayer on 2/11/17.
 */
public class SingleInheritance {
static int a=10;
static int b=20;

}
class Operations extends SingleInheritance{
    public static void main(String[] args) {
        int addition=a+b;
        System.out.println("Addition is: "+addition);
        int sub=a-b;
        System.out.println("sub is: "+sub);
        int Mul=a*b;
        System.out.println("Mul is: "+Mul);
        int div=a/b;
        System.out.println("Div is: "+div);
    }

}

