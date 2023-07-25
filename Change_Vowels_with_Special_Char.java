import java.util.Scanner;

public class Change_Vowels_with_Special_Char {

    public void Replace(String value){
        String Replaced = "";
        for (int i = 0; i < value.length(); i++) {
            if(value.charAt(i) =='a'|| value.charAt(i) =='e'|| value.charAt(i) =='i'|| value.charAt(i) =='o'|| value.charAt(i) =='u'||
                    value.charAt(i) =='A'|| value.charAt(i) =='E'|| value.charAt(i) =='I'||  value.charAt(i) =='O'|| value.charAt(i) =='U')
            {
                Replaced = Replaced+'$';
            }
            else {
                Replaced += value.charAt(i);
            }
        }

        System.out.println("After Replacing Vowels with $ "+Replaced);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        Change_Vowels_with_Special_Char sp = new Change_Vowels_with_Special_Char();
        sp.Replace(value);

    }
}



        //Input
        //Hello From run Time

        //Output
        //After Replacing Vowels with $ H$ll$ Fr$m r$n T$m$
