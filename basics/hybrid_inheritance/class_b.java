package hybrid_inheritance;

public class class_b extends class_a {
    public void Method_three () {
        System.out.print(" Username : Celina");
    }
    public void Method_four () {
        System.out.println("Helan");
    }

    public static void main(String[] args) {
        class_b b = new class_b();
        b.method_one();
        b.method_two();
        b.Method_three();
        b.Method_four();
    }
}


