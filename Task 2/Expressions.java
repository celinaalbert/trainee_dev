package Tasks;

import java.util.Scanner;

public class Expressions {
     private static float x , y , z;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of x :" );
         x = s.nextFloat();
        System.out.println("Enter the value of y :" );
         y = s.nextFloat();
//        double sum = Math.pow(x,2) + Math.pow(y,2);

//        System.out.println("Sum of the two numbers with powers : " + sum);
        System.out.println("Enter the  value of z : ");
        z = s.nextFloat();
//        double sub = sum- Math.abs(z);
        double expression = Math.pow(x,2) + Math.pow(y,2) - Math.abs(z);
        System.out.println("The value of x^2+y^2-|z| : " + expression);
        System.out.println( "The final value of this expression cube root of(x^2+y^2-|z|) is : " + Math.cbrt(expression));
    }
}