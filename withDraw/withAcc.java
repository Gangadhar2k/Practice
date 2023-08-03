package withDraw;
import openAcc.Accinfo;
public class withAcc {

    public void m2(){
        int amt = 1000;
        if(Accinfo.accNo == 1234567){
            float bal = Accinfo.balance - amt;
            System.out.println("After Withdraw"+bal);
        }else{
            System.out.println("Account Not Found");
        }
    }
}
