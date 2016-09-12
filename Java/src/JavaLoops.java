import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaLoops {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    String s = in.nextLine(); // consume enter key

    for (int i=0; i<t; i++)
    {
      s = in.nextLine();

      String[] nums = s.split("\\s");

      int a = Integer.parseInt(nums[0]);
      int b = Integer.parseInt(nums[1]);
      int n = Integer.parseInt(nums[2]);

      String result = "";
      for (int j=0; j<n; j++)
      {
        int sum = a;
        for (int k=0; k<=j; k++)
          sum += Math.pow(2,k) * b;
        result += sum + " ";
      }
      System.out.println(result);
    }
  }
}