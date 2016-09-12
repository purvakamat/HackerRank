import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class JavaStringCompare {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = sc.nextInt();

    SortedSet<String> sList = new TreeSet<String>();

    for (int i = 0; i<=s.length()-n; i++){
      sList.add(s.substring(i,i+n));
    }

    System.out.println(sList.first());
    System.out.println(sList.last());

  }
}
