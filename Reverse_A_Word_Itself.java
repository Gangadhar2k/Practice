import java.util.Scanner;

public class Reverse_A_Word_Itself {

    public void reverseAWord(String value){
       String arr[] = value.split(" ");
       for(int i=0;i<arr.length;i++) {
           StringBuilder rev = new StringBuilder(arr[i]);
           System.out.print(rev.reverse());
           if(i != arr.length-1)
           System.out.print(" ");
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        Reverse_A_Word_Itself rw = new Reverse_A_Word_Itself();
        rw.reverseAWord(value);

    }
}
