package single_inheritance;

import java.util.Scanner;

public class class_b extends class_a{

    public void method_two() {
        System.out.println("enter your name: ");
        Scanner s = new Scanner(System.in);
        String d = s.nextLine();
        System.out.println(d);
    }


    public static void main(String[] args) {
        class_b b = new class_b();
        b.method_two();
        b.method_one();
    }
}