import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RepeatedStrings {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.next();
    long n = in.nextLong();
    long m = new RepeatedStrings().countA(s,n);
    System.out.println("a count: " + m);
  }

  private long countA(String s, long n){
    int singleCount = 0;
    for(char c : s.toCharArray()){
      if(c == 'a')
        singleCount++;
    }

    long stringRepeats = (long)Math.floor(n/s.length());
    int stringRemainder = (int) (n - (stringRepeats * s.length()));
    int remainderCount = 0;
    for(char c : s.substring(0,stringRemainder).toCharArray()){
      if(c=='a')
        remainderCount++;
    }

    long totalCount = (singleCount * stringRepeats) + remainderCount;
    return totalCount;
  }
}
