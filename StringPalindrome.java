import java.util.Scanner;

public class StringPalindrome {

    public void isPalindrome (String value){
        int i =0;
        int j = value.length()-1;
        int flag = 0;
        while(i<j){
            if(value.charAt(i) != value.charAt(j)){
                flag++;
                break;
            }
            i++;
            j--;
        }

        if(flag <= 0){
            System.out.println("The Given String is Palindrome");
        }
        else{
          System.out.println("The Given String is Not a Palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        StringPalindrome rs = new StringPalindrome();
        rs.isPalindrome(value);
    }
}


        //Input
        //ram

        //OutPut
        //The Given String is Not a Palindrome

        //Input
        //malayalam

        //OutPut
        //The Given String is Palindrome

