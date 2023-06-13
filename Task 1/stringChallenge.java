package Tasks;

public class stringChallenge {

public static String Str(String str1) {
    String answer;
    System.out.println("Given String : " + str1);
    String str2 = str1.trim();
    System.out.println("After Removing the leading and trailing spaces : " + str2);
    String str3 =str2.substring(0,5);
    System.out.println("Extracing the string from 0 to 1 : " + str3);
    answer = str3.toUpperCase();
    System.out.println("Converting the given string into the Uppercase " + answer);
  return  answer;
}
    public static void main(String[] args) {
     Str("     Celina    ");
    }
}
