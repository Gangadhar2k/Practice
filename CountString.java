import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int count = 0;
        for(int i =0;i<name.length();i++){
            count++;
        }
        System.out.println("There are "+count+" character in Given String" );
    }
}


//    Input
//    Hello how are you

//    Output
//    There are 17 character in Given String