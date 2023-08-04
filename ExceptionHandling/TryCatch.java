package ExceptionHandling;

public class TryCatch {

    public static void main(String[] args) {
        try{
//            int a = 100/2;
            int a = 100/0;
            System.out.println(a);
        }catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
            System.out.println("Error");
        }
    }
}
