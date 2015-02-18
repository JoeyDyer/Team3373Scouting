package Package;
import java.net.*;

public class Tutorial10 {

	
	private static String host;
	public static void main(String[] args) {
		host = "localhost";
		for(int i = 1; i< 10001; i++){
			
				portThread t = new portThread(host, i);
					t.start();
				
			
		}
	}

}
