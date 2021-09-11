
public class PlatinumClient extends Client {
	public PlatinumClient(int id, String name,Float balance) {
		super (id, name, balance);
		this.commisionRate= (float) 0.01;
		this.interestRate=(float) 0.005;
	}
	
	@Override
	public String toString() {
		return this.getId()+" Client type PlatinumClient";

	}
}//end
