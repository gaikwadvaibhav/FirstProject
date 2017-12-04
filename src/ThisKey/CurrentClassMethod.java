package ThisKey;

/**
 * Created by melayer on 1/11/17.
 */
public class CurrentClassMethod {
    void varsha()
    {
        System.out.println("welcome");
    }
    void madhu()
    {
        varsha();
    }

    public static void main(String[] args) {
        CurrentClassMethod obj=new CurrentClassMethod();
        obj.madhu();
    }
}
