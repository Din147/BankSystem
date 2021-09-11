
public class GoldClient extends Client {
	public GoldClient(int id, String name,Float balance) {
		super (id, name, balance);
		this.commisionRate= (float) 0.02;
		this.interestRate=(float) 0.003;
	}
	
	@Override
	public String toString() {
		return this.getId()+" Client type GoldClient";

	}
}//end
