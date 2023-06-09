package Herirachical_inheritance;

public class class_b extends class_a {
    public void display2() {
        System.out.println("is my friend");
    }

    public static void main(String args[]) {
        class_b c = new class_b();
        c.display();
        c.display2();

    }
}