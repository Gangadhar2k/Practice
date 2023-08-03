package openAcc;

import java.sql.SQLOutput;

public class Accinfo {

    public static int accNo = 1234567;
    public static String name = "Gangadhar";
    public static float balance = 4556.57f;

  public void m1(){
      System.out.println("acc info ::"+accNo);
      System.out.println("Name ::"+name);
      System.out.println("Current Balance::"+balance);
  }
}
