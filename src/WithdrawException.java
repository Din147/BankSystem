
public class WithdrawException extends Exception {
 int ClientId; 
 float currentbalance; 
 float withdrawAmount; 

 public WithdrawException (String messeage,int ClientId,float currentbalance , float withdrawAmount) {
	 
 }

public int getClientId() {
	return ClientId;
}

public float getCurrentbalance() {
	return currentbalance;
}

public float getWithdrawAmount() {
	return withdrawAmount;
}

 
}//end
