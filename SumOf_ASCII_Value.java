import java.util.Scanner;

public class SumOf_ASCII_Value {

    public void Add_ASCII(String value){
        int sum = 0;
        for(int i=0;i<value.length();i++){

            int k = (int)value.charAt(i);
            sum = sum+k;
        }

        System.out.println("Sum of ASCII Value in a given String is "+sum);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        SumOf_ASCII_Value ad = new SumOf_ASCII_Value();
        ad.Add_ASCII(value);

    }
}


//Input
//we print elements

//output
//Sum of ASCII Value in a given String is 1702
