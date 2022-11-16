package account;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Account {
	
    static String initChar;
    static boolean result;
    
    
    public static String createAccountNumber(String type) {
    	int lengthAccount = 10;

    	if (type == "TextoA") {
			initChar = "54";
		} else if (type == "TextoB") {
			initChar = "08";
		}
    	
    	final String  BANKCHAR = "1234567890";
    	
        String accountNumber = initChar + "";
        
        for (int x = 0; x < lengthAccount - 2; x++) {
			int aleatoryInt = getAleatoryNumberSet(0, BANKCHAR.length() - 1);
			char aleatoryChar = BANKCHAR.charAt(aleatoryInt);
			accountNumber += aleatoryChar;
		}
        
        return accountNumber;
    }
    
    
    
    private static int getAleatoryNumberSet(int min, int max) {
    	return ThreadLocalRandom.current().nextInt(min, max +1)	;
    	}    
    
    
    
    public static  boolean consultAcount(List<String> accountsList,String accountSearched) {
    	
    	if (accountsList.indexOf(accountSearched) >= 0) {
    		result =  false;
		} else if(accountsList.indexOf(accountSearched) < 0) {
			result =  true;
		}
    	
    	return result;
    	
    }
    
    };
    


