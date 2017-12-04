package Array;

/**
 * Created by melayer on 27/10/17.
 */
public class PrintStar {
    void Star()
    {
        for(int i=0;i<3;i++)
        {
            for(int j=1;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        PrintStar obj=new PrintStar();
        obj.Star();
    }
}
