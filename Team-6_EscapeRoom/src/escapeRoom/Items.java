/**
 * 
 */
package escapeRoom;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * @author Mr_El
 *
 */
public class Items extends JFrame {	
	Toolbar toolbar = new Toolbar();
	static boolean flaskpickup = false;
	static boolean jugpickup = false;
	
	public static Component btnFlask()
	{
		
		
		JButton btnFlask = new JButton();
		btnFlask.setIcon(new ImageIcon(ChemistryTeachersDesk.class.getResource("/Images/flask_blue.png")));
		btnFlask.setBounds(607, 351, 141, 103);
		btnFlask.setOpaque(false);
		btnFlask.setContentAreaFilled(false);
		btnFlask.setBorderPainted(false);
		
		
		btnFlask.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnFlask.setVisible(false);
				JOptionPane.showMessageDialog(new JPanel(),
						"It's a Flask of Hyrdrogen, still cold and liquified. Maybe you can combine this with something.",
					    "Flask of Hydrogen",
						JOptionPane.INFORMATION_MESSAGE);
				flaskpickup = true;
			}
		});
		
		//Toolbar.bar();
		return btnFlask;
	}
	
	public static Component btnJug()
	{
		JButton btnJug = new JButton();
		btnJug.setIcon(new ImageIcon(ChemistryDoor.class.getResource("/Images/waterjug1.png")));
		btnJug.setBounds(219, 409, 85, 87);
		btnJug.setOpaque(false);
		btnJug.setContentAreaFilled(false);
		btnJug.setBorderPainted(false);
		
		
		btnJug.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnJug.setVisible(false);
				JOptionPane.showMessageDialog(new JPanel(),
						"This water is cold and fresh, maybe you should add it to something.",
						"Jug of Water",
						JOptionPane.INFORMATION_MESSAGE);
				jugpickup = true;
			}
		});
		
		return btnJug;
	}
}


