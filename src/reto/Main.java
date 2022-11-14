package reto;
import account.Account;

public class Main {


    public static void main (String args[]) {
        String type = "TextoB";
        //String type = "TextoB";
        String result = Account.createAccountNumber(type,10);
        System.out.println(result);
    }


}
