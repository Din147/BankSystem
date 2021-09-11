
public class RegularClient extends Client {
	
	public RegularClient(int id, String name,Float balance) {
		super (id, name, balance);
		this.commisionRate= (float) 0.03;
		this.interestRate=(float) 0.001;
	 
	}
	@Override
	public String toString() {
		return this.getId()+" Client type RegularClient";
	}

}//end
