package Tasks;

public class Calculator {
    private int num1 , num2;
    public Calculator( int a , int b) {
         num1 = a;
         num2 = b;
    }
    public void add() {
      int  add = num1 + num2 ;
        System.out.println(add);
    }
    public void sub() {
        int  sub = num2 - num1 ;
        System.out.println(sub);
    }
    public void multiply() {
        int  mul = num1 * num2 ;
        System.out.println(mul);
    }
    public void divide() {
        double  div = (double)num2/(double)num1;
        System.out.println(div);
    }
    public static void main(String[] args) {
        Calculator cal = new Calculator(10,94);
        cal.add();
        cal.sub();
        cal.multiply();
        cal.divide();
    }
}
