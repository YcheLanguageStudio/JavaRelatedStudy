package grammer;

/**
 * Created by cheyulin on 10/15/16.
 */
public class Finalize {
    protected void finalize() throws java.lang.Throwable {
        System.out.println("Finalize");
        super.finalize();
    }

    protected void sayHi(){
        System.out.println("Hi");
    }

    public static void main(String[] args) throws Throwable {
        Finalize finalize = new Finalize();
        finalize.sayHi();
        finalize.finalize();
    }
}
