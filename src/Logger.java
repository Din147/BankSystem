import java.util.ArrayList;

public class Logger {

	String driverName;
	public static ArrayList<Logger> Logger=new ArrayList<Logger>(); 

	public Logger(String driverName) {
		this.driverName = driverName;

	}

	public static void log(Log a) {
		System.out.println(a);

	}
public  ArrayList<Logger> getLogs(Log a) { 
       return Logger;
	}

}// end
