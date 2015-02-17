package Package;
import java.util.*;
import java.io.*;

public class Tutorial7 {

	public static void main(String[] args) throws IOException {
		PrintWriter out = new PrintWriter("testing.bat");
		out.println("color 02");
		out.println("@title Test Window");
		out.println("@echo testing!");
		out.println("@pause");
		out.println("@echo Press enter to close this window.");
		out.println("@pause");
		out.close();
		Runtime rt = Runtime.getRuntime();
		rt.exec("cmd /c start" + "testing.bat");
	}

}
