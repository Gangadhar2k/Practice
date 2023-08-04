package ExceptionHandling;

public class MultipleCatches {
    public static void main(String[] args) {
        try{
//           int a = 100/2;
//            System.out.println(a);
//            String a = "rani";
//            int i=Integer.parseInt(a);
//            System.out.println(i);
            int a[]={33,3,4,5};
            System.out.println(a[7]);
        }
        catch(ArithmeticException e)
        {

            e.printStackTrace();
            System.out.println("Arithmetic");
        }
        catch(NumberFormatException e)
        {

            e.printStackTrace();
            System.out.println("NumberFormatException");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {

            e.printStackTrace();
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch(Exception e)
        {

            e.printStackTrace();
            System.out.println("Exception");
        }

    }
}
