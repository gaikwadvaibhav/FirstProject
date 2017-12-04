package collegeinfo;

/**
 * Created by melayer on 28/11/17.
 */
public class Subject2 extends Commerce {

    @Override
    void Bcom() {
       System.out.println("1. B.com");


    }

    @Override
    void CA() {
        System.out.println("2. CA");
    }

    @Override
    void CS() {
        System.out.println("3. CS");
    }

    public static void main(String[] args) {
        Subject2 obj=new Subject2();
        System.out.println("You can go for: ");
        obj.Bcom();
        obj.CA();
        obj.CS();
    }
}
