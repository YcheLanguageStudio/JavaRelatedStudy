package Inheritence;

/**
 * Created by cheyulin on 10/13/16.
 */
public class Base {
    static{
        System.out.println("Loading Class Base");
    }

    {
        System.out.println("Initlization Block");
    }

    public Base(){
        System.out.println("Con Base");
        f();
    }

    public void f(){
        System.out.println("Base f");
    }
}
