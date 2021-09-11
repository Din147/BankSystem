import java.util.ArrayList;

public class Bank {
	//private Client[] clients; 
	//private Logger logService; 
	//private accountUpdater;
	private Logger logger; 
	private float bankbalance;
	Float bankbalance1=bankbalance;
	private static Bank single_instance = null;
	private static float commisionSum;
	Float commisionSum1 =commisionSum;
	private ArrayList<Client> clients; 

	public Bank() {
		//this.clients=new Client[100]; 
		this.clients = new ArrayList<Client>();
		this.logger = new Logger(""); 
	}

	public float getBalance() {
		return bankbalance1; 
	}

	public void setBalance() {
		bankbalance1=(float) 0;
		for (int i=0; i<this.clients.size(); i++) {
			bankbalance1 += ((Client)this.clients.get(i)).getFortune();
		}
		bankbalance1+= commisionSum1;
	}

//	public void setBalance() {
//		bankbalance=0;
//		for (int i=0; i<this.clients.length; i++) {
//			if (this.clients[i]!=null) {
//				bankbalance += this.clients[i].getFortune();
//			}
//		}
//		bankbalance+= commisionSum;
//	}
	
	public void addClients(Client a) {
		this.clients.add(a);
		setBalance();
		logger.log( new Log(Log.timestamp,a.getId(),"add Client",a.getFortune()));
	}
	
	
	
//	public void addClients(Client a) { OLD
//		for (int i=0; i<this.clients.length; i++) {
//			if (this.clients[i]==null) {
//				this.clients[i]=a; 
//				setBalance();
//				logger.log( new Log(0,a.getId(),"add Client",a.getFortune()));
//				break;
//			}
//		}
//	}
//	public void removeClient(int id) {  OLD
//		for (int i=0; i<this.clients.length; i++) {
//			if (this.clients[i].getId()==id) {
//				this.clients[i]=null; 
//				setBalance();
//				this.logger.log( new Log(0,id,"remove Client",0));
//			}
//		}
//	}
	
	public void removeClient(Client a) {
			for (int i=0; i<this.clients.size(); i++) {
			if (a.equals(((Client)this.clients.get(i)).getId())){
				this.clients.remove(i);
				setBalance();
				this.logger.log( new Log(Log.timestamp,this.clients.get(i).getId(),"remove Client",0));
			}
		}
	}
	
//	public void removeClient(Client a) { OLD
//		for (int i=0; i<this.clients.length; i++) {
//		if (a.equals(this.clients[i].getId())) {
//			this.clients[i]=null; 
//			setBalance();
//			this.logger.log( new Log(0,this.clients[i].getId(),"remove Client",0));
//		}
//	}
//}
	public ArrayList<Client> getClinet() {
		return clients;
	}

//	public Client[] getClinet() { OLD
//		return clients;
//	}
	
	public static Bank getInstance(){
    
        if (single_instance== null)
        	single_instance = new Bank();
 
        return single_instance;
    }

	public void addComission(float commision) {
		commisionSum1 += commision; 
		
		
	}
	
	public void printClientList() {
	System.out.println(toString()); //to get back
	
	}
}// end
