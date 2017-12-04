package collegeinfo;

/**
 * Created by melayer on 28/11/17.
 */
public class Subject1 extends Arts{
    @Override
    void BBA() {
        System.out.println("1.BBA");
    }

    @Override
    void BA() {
        System.out.println("2.BA");
    }

    @Override
    void MASSCOM() {
        System.out.println("3.MASS COMM");
    }


    public static void main(String[] args) {
        System.out.println("You can go for: ");
        Subject1 obj=new Subject1();
        obj.BBA();
        obj.BA();
        obj.MASSCOM();


    }
}
