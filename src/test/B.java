package test;

public class B extends A {
    @Override
    public void doStuff(int Num) {
        System.out.println(Num + 1);
    }

    public static void main(String[] args) {
        B b = new B();
        b.doStuff(5);
        b.Test();
    }
}
