package challenge;
import java.util.ArrayList;

import account.Account;

public class Main {


    public static void main (String args[]) {
        String type = "TextoB";
        //String type = "TextoB";
        String result = Account.createAccountNumber(type,10);
        System.out.println(result);
        
        ArrayList<String> AccountsList = new ArrayList<String>();
        AccountsList.add("0894587996");
        AccountsList.add("5412455296");
        AccountsList.add("5452984118");
        AccountsList.add("0864378427");
        boolean data = Account.consultAcount(AccountsList, "0894587996");
        System.out.println("" + data);
    }


}
