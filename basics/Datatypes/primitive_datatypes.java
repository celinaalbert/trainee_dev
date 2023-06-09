package Datatypes;

public class primitive_datatypes {
    int a = 10;
    String s = "celina";
     static float f  = 12.33f;
     double d = 1111.2222;
      byte b = -127;

     public void Method_one () {
         d = 444.88;
         System.out.println(d);
     }


    public static void main(String[] args) {

     primitive_datatypes pri = new primitive_datatypes();
     System.out.println(pri.d);
     System.out.println(pri.b);
     pri.Method_one();
     System.out.println(pri.s);
     System.out.println(f);

    }

    
}
