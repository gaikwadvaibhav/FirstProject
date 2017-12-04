package arithmaticoperator;

/**
 * Created by melayer on 13/10/17.
 */
public class string {
    static String name="varsha";

    static char ch[]=name.toCharArray();

    public static void main(String[] args)

    {
        int l=ch.length;
        System.out.println(l);
        for(int i=l-1;i>=0;i--)
        {
            System.out.print(ch[i]);
        }
    }
}
