import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {

  static boolean isAnagram(String a, String b){
    char[] A = a.toLowerCase().toCharArray();
    char[] B = b.toLowerCase().toCharArray();
    Arrays.sort(A);
    Arrays.sort(B);
    return Arrays.equals(A,B);
  }

  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    String b = scan.next();
    scan.close();
    boolean ret = isAnagram(a,b);
    System.out.println(ret? "Anagram":"Not Anagram");
  }
}
