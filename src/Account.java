
public class Account {

	private int id;
	Integer id1= id; 
	private float balance;
	Float balance1= balance;
	
	public Account(int id, float balance) {
		this.id = id;
		
		this.balance1 = balance;

	}

	public int getId() {
		return id;
	}

	public float getBalance() {
		return balance1;
	}

	public void setBalance(float balance) {
		this.balance1 = balance;
		// Log(timestamp,Id,description,amount );
	}


	public boolean equals(int id) {
		if (id == this.getId()) {
			return true;
		} else {
			return false;

		}
	}
}// end
