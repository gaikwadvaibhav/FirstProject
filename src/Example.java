/**
 * Created by melayer on 6/11/17.
 */
public class Example {
    int id;
    String name;

    Example(int id,String name)
    {
        this.id=id;
        this.name=name;

    }
}
class details{
    String company;
    String dept;
    Example obj;
    details(String company,String dept,Example obj)
    {
        this.company=company;
        this.dept=dept;
        this.obj=obj;


    }
    void show()
    {
        System.out.println("Name: "+obj.name+"Id: "+obj.id+" "+"Company: "+company+" "+"dept: "+dept);
    }

    public static void main(String[] args) {
        Example example=new Example(1,"varsha");
        details det=new details("amdocs", "software", example);
   det.show();
    }
}
