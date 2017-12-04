package Inheritance;

/**
 * Created by melayer on 2/11/17.
 */
public class MultiLevelInheritance {
    static int a=5;
   // static  int b=5;

}
class Addition extends MultiLevelInheritance{
    void addoperation() {
         int Add = a + a;
        System.out.println("addition is: "+Add);
    }

}
class Square extends Addition{
    public static void main(String[] args) {
        int s=((a*a));
        System.out.println("square of that that number is: "+s);
Square obj= new Square();
obj.addoperation();
    }
}
