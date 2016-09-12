import java.util.Scanner;

public class JavaStringTokens {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine().trim();
    scan.close();

    if (s.length() == 0) {
      System.out.println("0");
      return;
    }

    if (s.length()> 400000) {
      return;
    }

    String[] sList = s.split("[ !,?._'@]+");
    System.out.println(sList.length);

    for (String a: sList) {
      System.out.println(a);
    }
  }
}
