import java.util.Scanner;

public class Count_Vowels_Consonents {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        int vowels = 0;
        int consonent =0;

        for(int i=0;i<value.length();i++){
            if(value.charAt(i) =='a'|| value.charAt(i) =='e'|| value.charAt(i) =='i'|| value.charAt(i) =='o'|| value.charAt(i) =='u'||
                    value.charAt(i) =='A'|| value.charAt(i) =='E'|| value.charAt(i) =='I'||  value.charAt(i) =='O'|| value.charAt(i) =='U')
            {
                vowels++;


            }else{
                if(value.charAt(i) != ' '){
                    consonent++;
                    System.out.println(value.charAt(i));
                }
            }
        }


        System.out.println("There are total "+vowels+" vowels and "+consonent+" consonents in the given String");
    }
}


//        Input
//        This is from run Time

//        Output
//        There are total 6 vowels and 11 consonents in the given String