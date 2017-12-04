package ThisKey;

/**
 * Created by melayer on 1/11/17.
 */
public class CurrentClassConstructor {
     CurrentClassConstructor()
    {
        System.out.println("Name: ");
    }
     CurrentClassConstructor(String Name)
    {
        this();
        System.out.println("Name: "+Name);
    }

    public static void main(String[] args) {
        CurrentClassConstructor obj=new CurrentClassConstructor("varsh");
    }

}
