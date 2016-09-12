import java.util.Scanner;

/**
 * Created by kamat on 7/16/2016.
 */
public class JavaIntToString {

  public static void main(String[] args){
    try{
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();

      String s = String.valueOf(n);

      if (n==Integer.parseInt(s))
        System.out.println("Good Job");
      else
        System.out.println("Wrong answer");
    }
    catch (Exception e){
      System.out.println(e);
    }

  }
}
