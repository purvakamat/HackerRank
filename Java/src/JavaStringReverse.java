import java.util.Scanner;

public class JavaStringReverse {

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String sRev = new StringBuilder(s).reverse().toString();

    if (s.equals(sRev))
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}
