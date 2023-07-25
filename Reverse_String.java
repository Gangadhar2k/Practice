import java.util.Scanner;
import java.lang.String.*;

public class Reverse_String {
   public void Reverse (String value){
       String rev = "";
       for(int i = value.length()-1;i>=0;i--){
           rev = rev+value.charAt(i);
       }
       System.out.println("The Reverse of a given String is "+rev);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        Reverse_String rs = new Reverse_String();
        rs.Reverse(value);
    }
}


        //Input
        //Hello

        //OutPut
        //The Reverse of a given String is olleH
