import java.util.Scanner;

public class Count_Sepcial_Character {

    public  void countSpecial(String value){
        int count = 0;
        for (int i = 0; i < value.length(); i++) {
            char ch = value.charAt(i);
            if(! ((ch >= 'a' && ch<='z') || (ch >= 'A' && ch<='Z')) ) {
                count++;
            }
        }
        System.out.println("There are "+count+" Special character in the given String");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        Count_Sepcial_Character cs= new Count_Sepcial_Character();
        cs.countSpecial(value);

    }
}


        //Input
        //hai! this is Gangadhar. how are You?

        //Output
        //There are 9 Special character in the given String