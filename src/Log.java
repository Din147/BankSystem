import java.util.Date;

public class Log {

	//public  long timestamp;
	public static  Date timestamp;
	private  int ClientId;
	Integer ClientId1 =  ClientId;
	private  String description;
	private  float amount; 
	Float amount1=amount;
	public Log (Date timestamp,int ClientId,String description,float amount ) {
		
	//this.timestamp= timestamp;
	this.ClientId1=ClientId; 
	this.description=description; 
	this.amount1=amount; 
	
	}
public String toString() {
	return getData();
}

public  String getData() {
	return timestamp + " , " + ClientId1 + " , " + description + " , " + amount1; 
	
}



}//End
