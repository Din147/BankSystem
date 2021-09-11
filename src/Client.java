import java.util.ArrayList;


public abstract class Client {
	private int id;
	Integer id1=id;
	private String name;
	private float balance;
	Float balance1=balance;
	//private Account[] accounts;
	private ArrayList<Account> accounts;
	protected float commisionRate = 0;
	Float commisionRate1=commisionRate;
	protected float interestRate = 0;
	Float interestRate1=interestRate;

	// private Logger logger;
	
	// private Log a;
	// private int index=0;

	public Client(int id, String name, float balance) {
		this.accounts = new ArrayList<Account>();
		this.id1 = id;
		this.name = name;
		this.balance1 = balance;
	}

	public int getId() {
		return this.id1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance1;
	}

	public void setBalance(float balance) {
		this.balance1 = balance;
	}

	public void addAccount(Account account) {
		this.accounts.add(account);
		Logger.log(new Log(Log.timestamp, this.getId(), "add account", account.getBalance()));
	}
		
	
//	public void addAccount(Account account) { OLD
//		for (int i = 0; i < accounts.length; i++) {
//			if (this.accounts[i] == null) {
//				this.accounts[i] = account;
//				Logger.log(new Log(0, this.getId(), "add account", account.getBalance()));
//				break;
//			}
//		}
//	}

	public Account getAccount(int index) {
		if (index < this.accounts.size() ){
			return (Account)this.accounts.get(index);
		} else {
			System.out.println("error index must be less than " + this.accounts.size() + " or there is no accounts");
			return null;
		}
	}
	
//	public Account getAccount(int index) { OLD
//		if (index < this.accounts.length && this.accounts[index] != null) {
//			return this.accounts[index];
//		} else {
//			System.out.println("error index must be less than " + this.accounts.length + " or there is no accounts");
//			return null;
//		}
//	}

//	public void removeAccount(int id) { OLD
//		for (int i = 0; i < this.accounts.length; i++) {
//			if (this.accounts[i].getId() == id) {
//				this.balance += this.accounts[i].getBalance();
//				this.accounts[i] = null;
//				Logger.log(new Log(0, this.getId(), "remove account", getBalance()));
//
//			}
//
//		}
//	}

	public void removeAccount(Account a) {
		for (int i = 0; i < this.accounts.size(); i++) {
			if (a.equals(this.accounts.get(i).getId())) {
				this.balance +=  ((Account)this.accounts.get(i)).getBalance();
				this.accounts.remove(i);
				Logger.log(new Log(Log.timestamp, this.getId(), "remove account", getBalance()));
				break;
			}
		}
	}

	public void deposit(float amount) {
		this.balance1 += (amount - amount*this.commisionRate1);
	}

	public void withdraw(float amount) throws WithdrawException {
		float commision=0;
		if (this.balance1 - amount < 0) {
			throw new WithdrawException("eror you dont have such amount", this.getId(), this.getBalance(), amount);
		}
		commision = amount * this.commisionRate1;
		this.balance1 -= (amount - amount*commision);
		Bank.getInstance().addComission(commision);
	}

	public void autoUpdateAccounts() {
		for (int i = 0; i < this.accounts.size(); i++) {
			((Account)this.accounts.get(i)).setBalance(this.accounts.get(i).getBalance() * (1 + interestRate1));
			Logger.log(new Log(Log.timestamp, this.getId(), "autoUpdateAccount", getBalance()));
			
		}
	}

	
//	public void autoUpdateAccounts() { OLD
//		for (int i = 0; i < this.accounts.length; i++) {
//			if (this.accounts[i] != null) {
//				this.accounts[i].setBalance(this.accounts[i].getBalance() + interestRate);
//				Logger.log(new Log(0, this.getId(), "autoUpdateAccount", getBalance()));
//			}
//		}
//	}
	
	public float getFortune() {
		float sum = 0;
		for (int i = 0; i < this.accounts.size(); i++) {
			sum += ((Account)this.accounts.get(i)).getBalance();
		}
		sum += this.getBalance();
		return sum;
	}

	
//	public float getFortune() {
//		float sum = 0;
//		for (int i = 0; i < this.accounts.length; i++) {
//			if (this.accounts[i] != null) {
//				sum += this.accounts[i].getBalance();
//			}
//		}
//		sum += this.getBalance();
//		return sum;
//	}
	
	public boolean equals(int id) {
		if (this.getId() == id) {
			return true;
		} else {
			return false;
		}
	}
}// end
