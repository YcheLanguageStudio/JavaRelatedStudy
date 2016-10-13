package Inheritence;

/**
 * Created by cheyulin on 10/13/16.
 */

public class Derived extends Base {
    static{
        System.out.println("Loading Class Derived");
    }

    Derived(){
        System.out.println("Con Derived");
    }

    @Override
    public void f(){
        super.f();
        System.out.println("Derived f");
    }

    public static void main(String[]args){
        Base derived = new Derived();
        System.out.println();
        Base derived1 = new Derived();
    }
}


