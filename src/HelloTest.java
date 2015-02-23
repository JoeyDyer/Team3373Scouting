import java.util.*;
import javax.swing.*;
public class HelloTest {

	public static void main(String[] args) {
		System.out.println("Sup MAM?!?!");
				
		JOptionPane.showMessageDialog(null, "Window1");
		JOptionPane.showMessageDialog(null, "Window2");
		
		
		JOptionPane pane1 = new JOptionPane("Hello Bob!");
		JDialog dialog1 = pane1.createDialog(null, "Window1");
		dialog1.setModal(false); 
		dialog1.setVisible(true);

		JOptionPane pane2 = new JOptionPane("Hello Bobito!");
		JDialog dialog2 = pane2.createDialog(null, "Window2");
		dialog2.setModal(false); 
		dialog2.setVisible(true);
		

	}

}