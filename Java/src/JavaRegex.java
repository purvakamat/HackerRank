import java.util.*;

public class JavaRegex {
  public static void main(String []args)
  {
    Scanner in = new Scanner(System.in);
    while(in.hasNext())
    {
      String IP = in.next();
      System.out.println(IP.matches(new myRegex().pattern));
    }

  }
}

class myRegex{
  public String pattern = "((\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])\\.){3}(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
}

