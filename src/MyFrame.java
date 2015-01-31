import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class MyFrame {

	public static void main(String[] args) {
		JButton butt = new JButton("Click me!");
		butt.addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent evt) {
			  JOptionPane.showMessageDialog(null, "POMASUPA \n IS THA \n BESTEREST?!?!?!");
		  }
		});

	}
	
	public class MyFram extends JFrame implements ActionListener {
		  private JButton button1 = new JButton("Click me!");
		  private JButton button2 = new JButton("Click me too!");

		  public MyFram() {
		    button1.addActionListener(this);
		    button2.addActionListener(this);
		  }

		  public void actionPerformed(ActionEvent evt) {
		    Object src = evt.getSource();
		    if (src == button1) {
		    	JOptionPane.showMessageDialog(null, "POMASUPA \n IS THA \n BESTEREST?!?!?!");
		    } else if (src == button2) {
		    	JOptionPane.showMessageDialog(null, "POMASUPA \n IS THA \n BESTEREST?!?!?!");
		    }
		  }
	}
}
		  