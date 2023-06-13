package Tasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Add_family_members {
    static int i = 1;
    public static String ch, name;
    private static ArrayList<String> namelist = new ArrayList<String>();
    private static ArrayList<Integer> agelist = new ArrayList<Integer>();

    public static void add_a_member() {      //function to add a member
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        name = s.nextLine();
        namelist.add(name); // adding the members into the arraylist
        System.out.print("Enter your Age : ");
        int age = s.nextInt();
        agelist.add(age);   // adding the member's age into the another arraylist

    }


    public static void greet_all() {  // Welcoming the members
        System.out.println("------Family members------");
         Iterator listitem = namelist.iterator();//iterating the list elements
        while(listitem.hasNext()) {
            System.out.println(listitem.next());
        }
        System.out.println("Welcomes You all!");
    }

    public static void Exit() {
        System.out.println("Your exiting.... ");
        System.exit(0);
    }

    public static void main(String[] args) {
        while (i > 0) {
            System.out.println("           Family Group         ");
            System.out.println("-------------------------------------");
            System.out.println("A). Add a member" + "\n" + "G). Greet all" + "\n" + "E). Exit");
            Scanner s = new Scanner(System.in);
            System.out.print("Type an option(A,G,E) : ");
            String ch = s.next();


//        System.out.println(ch.toUpperCase());


            switch (ch.toUpperCase()) {
                case ("A"):
                    add_a_member();
                    break;
                case ("G"):
                    greet_all();
                    break;
                case ("E") :
                    Exit();
                    break;
                default:
                    System.out.println("Please enter a valid option !");
            }

            System.out.println("-------Thanks for Coming--------");

        }
    }
}



