package ThisKey;

/**
 * Created by melayer on 1/11/17.
 */
public class InstanceVariable {
    int a;
    String b;
    InstanceVariable()
    {
        System.out.println("A: "+a+" Varsha"+b);
    }
    void show(int a,String b)
    {
        this.a=a;
        this.b=b;
        System.out.println("A: "+a+"Madhu"+b);
    }

    public static void main(String[] args) {
        InstanceVariable obj=new InstanceVariable();
        obj.show(20,"varsh");

    }
}
