package Multilevel_inheritance;
import java.util.Scanner;
public class fa {
    public static void main(String[] args) {
        int height = 0;
        int i;
        int j;
        int k;
        int l = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------Pyramid Program--------------------------");
        System.out.println("Enter the height of the Pyramid::");
        height = sc.nextInt();
        int m = height;
        for (j = 0; j < height; j++) {
            for (i = 0; i < m; i++) {
                System.out.print(" ");
            }
            m--;
            for (k = 0; k < l; k++) {
                System.out.print("* ");
            }
            l++;
            System.out.println("");
        }
    }
}