package Array;

/**
 * Created by melayer on 29/9/17.
 */
public class TwoDArray {
    void showarray()
    {
        int array[][]={{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(i==j)
                {
                    System.out.print(+array[i][j]);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args)
    {
        TwoDArray obj=new TwoDArray();
        obj.showarray();
    }


    }

