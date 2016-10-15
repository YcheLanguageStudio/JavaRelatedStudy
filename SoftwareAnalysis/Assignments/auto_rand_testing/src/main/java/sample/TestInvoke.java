package sample;

public class TestInvoke {
    private static int calls = 0;
    private int number;

    {
        number = 0;
    }

    public TestInvoke(int number) {
        this.number = number;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            foo();
        }
        System.out.println("I made " + calls + " static calls");
        new TestInvoke(3).display();
    }

    public void display() {
        System.out.println(number);
        ;
    }

    private static void foo() {
        calls++;
        bar();
    }

    private static void bar() {
        calls++;
    }
}