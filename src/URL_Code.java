
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

class URL_Code
{
static int apples = 4;	
 public static void main(String args[]) throws Exception
 {
 
 // Create Desktop object


 

	 loop();


 
 
 }
 public static void loop() throws URISyntaxException, IOException{
	 
	 Desktop d=Desktop.getDesktop();
	 
	 

		d.browse(new URI("http://baconsizzling.com/"));
		d.browse(new URI("http://www.breadfish.co.uk/"));
		d.browse(new URI("http://baconsizzling.com/"));
		d.browse(new URI("http://www.breadfish.co.uk/"));
		d.browse(new URI("http://baconsizzling.com/"));
		d.browse(new URI("http://www.breadfish.co.uk/"));
		d.browse(new URI("http://baconsizzling.com/"));
		d.browse(new URI("http://www.breadfish.co.uk/"));
		d.browse(new URI("http://baconsizzling.com/"));
		d.browse(new URI("http://www.breadfish.co.uk/"));
		d.browse(new URI("http://baconsizzling.com/"));
		d.browse(new URI("http://www.breadfish.co.uk/"));

		if(apples==4){
	loop();
	 
		}
		
		else{
			System.out.println("Failed");
		}
 
	 
 }
}