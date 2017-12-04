package ThisKey;

/**
 * Created by melayer on 2/11/17.
 */
public class PassArgumentInTheMethod
{
void abc(PassArgumentInTheMethod t)
{
    System.out.println("Method");
}
void show()
{
    abc(this);
}

    public static void main(String[] args) {
        new PassArgumentInTheMethod().show();
    }
}
