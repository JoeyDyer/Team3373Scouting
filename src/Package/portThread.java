package Package;
import java.net.*;
	public class portThread extends Thread{

		private String host;
		private int port;
		public portThread (String host, int port){
			this.host=host;
			this.port=port;
		}
		public void run(){
			try {
				Socket socket = new Socket(host, port);
				System.out.println("The port(" + port +") is open!");
				socket.close();
				return;
			} catch (Exception e) {
			}
		}

}
