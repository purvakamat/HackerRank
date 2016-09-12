import java.util.Scanner;


public class JavaStringsIntro {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();

    System.out.println(a.length() + b.length());

    if (a.compareToIgnoreCase(b) > 0)
      System.out.println("Yes");
    else
      System.out.println("No");

    String c = a.replace(a.charAt(0),Character.toUpperCase(a.charAt(0))) + " " + b.replace(b.charAt(0),Character.toUpperCase(b.charAt(0)));
    System.out.println(c);
  }
}
