package constructor;

/**
 * Created by melayer on 31/10/17.
 */
public class InstanceVariable {
    int a;
    String b;
     InstanceVariable()
    {
        System.out.println("varsha ");
       // this(10,"madhu");
    }
     InstanceVariable(int a,String b)
    {
        this.a=a;
        this.b=b;
        //this();
        System.out.println("a:"+a+"name:"+b);

    }

    public static void main(String[] args) {
    InstanceVariable show=new InstanceVariable();
    InstanceVariable obj=new InstanceVariable(10,"varsha");
    }
}
