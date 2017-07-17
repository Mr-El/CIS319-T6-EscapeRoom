/**
 * 
 */
package escapeRoom;

import java.awt.Color;
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
	//sets all the item pickups to false so the inventory starts empty and the items spawn
	static boolean flaskpickup = false;
	static boolean jugpickup = false;
	static boolean bookpickup = false;
	static boolean gflaskpickup = false;
	static boolean paperpickup = false;
	static boolean keypickup = false;
	static boolean lighterpickup = false;
	static boolean key2pickup = false;
	
	//method for item Hydrogen Flask
	public static Component btnFlask()
	{
		//creates the button for the flask
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
				//pickup is now set to true so the item will no longer spawn
				flaskpickup = true;
				Toolbar.bar();
			}
		});
		return btnFlask;
	}
	
	//Method for the item Water Jug
	public static Component btnJug()
	{
		//creates the Water Jug button
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
				//pickup is now set to true so the item will no longer spawn
				jugpickup = true;
			}
		});
		
		return btnJug;
	}
	
	//Method for the item Textbook
	public static Component btnBook() {
		JButton btnBook = new JButton();
		btnBook.setIcon(new ImageIcon(ChemistryRoom.class.getResource("/Images/textbook.png")));
		//btnBook.setOpaque(false);
		btnBook.setContentAreaFilled(false);
		btnBook.setBorderPainted(false);
		btnBook.setBounds(505, 258, 87, 65);
		
		btnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnBook.setVisible(false);
				JOptionPane.showMessageDialog(new JPanel(),
						"By the cover, it seems this is a textbook for chemistry. Maybe it contains the answers to getting out of this room.",
						"Chemistry Textbook",
						JOptionPane.INFORMATION_MESSAGE);
				//pickup is now set to true so the item will no longer spawn
				bookpickup = true;
			}
		});
		
		
		return btnBook;
	}
	
	//Method for the item Green Flask
	public static Component btnGreenFlask() {
		JButton btngFlask = new JButton();
		btngFlask.setContentAreaFilled(false);
		btngFlask.setBorderPainted(false);
		btngFlask.setIcon(new ImageIcon(ChemistryRoom.class.getResource("/Images/flask.png")));
		btngFlask.setBounds(265, 265, 58, 58);
		
		btngFlask.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btngFlask.setVisible(false);
				//btnToolFlask.setVisible(true);
				//pickup is now set to true so the item will no longer spawn
				gflaskpickup = true;
			}
		});
		
		return btngFlask;
		
	}
	
	//Method for the item Paper
	public static Component Paper() {
		//creates the paper button
		JButton btnPaper = new JButton();
		btnPaper.setContentAreaFilled(false);
		btnPaper.setBorderPainted(false);
		btnPaper.setIcon(new ImageIcon(ChemistryDoor.class.getResource("/Images/paper1.png")));
		btnPaper.setBounds(513, 465, 99, 50);
		
		btnPaper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnPaper.setVisible(false);
				JOptionPane.showMessageDialog(new JFrame(), "This slip of paper says that to mix chemical one with chemical two",
						"Cheet Sheet",
						JOptionPane.INFORMATION_MESSAGE);
				//pickup is now set to true so the item will no longer spawn
				paperpickup = true;
				
			}
		});
		return btnPaper;
	}
	
	//Method for the item Key
	public static Component btnKey() {
		//creates the key button
		JButton btnKey = new JButton();
		btnKey.setIcon(new ImageIcon(ChemistryDoor.class.getResource("/Images/key.png")));
		btnKey.setBounds(32, 469, 67, 50);
		btnKey.setOpaque(false);
		btnKey.setBorderPainted(false);
		btnKey.setContentAreaFilled(false);
		
		btnKey.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnKey.setVisible(false);
				JOptionPane.showMessageDialog(new JFrame(),
						"This key looks like it unlocks something you need.",
						"Key",
						JOptionPane.INFORMATION_MESSAGE);
				//btnKey_1.setVisible(true);
				//pickup is now set to true so the item will no longer spawn
				keypickup = true;
			}
		});
		
		return btnKey;
	}
	
	//Method for the item Lighter
	public static Component btnLighter() {
		//creates the lighter button
		JButton btnLighter = new JButton();
		btnLighter.setIcon(new ImageIcon(ChemistryTeachersDrawer.class.getResource("/Images/lighter.png")));
		btnLighter.setBounds(527, 397, 118, 61);
		btnLighter.setOpaque(false);
		btnLighter.setContentAreaFilled(false);
		btnLighter.setBorderPainted(false);
		btnLighter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnLighter.setVisible(false);
				lighterpickup = true;
			}
		});
		
		return btnLighter;
	}
	
	//Method for the item Key 2
	public static Component btnKey2() {
		//creates the key 2 button
		JButton btnKey = new JButton();
		btnKey.setIcon(new ImageIcon(ChemistryTeachersDrawer.class.getResource("/Images/key.png")));
		btnKey.setBounds(260, 87, 97, 25);
		btnKey.setOpaque(false);
		btnKey.setBorderPainted(false);
		btnKey.setContentAreaFilled(false);
		btnKey.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnKey.setVisible(false);
				//pickup is now set to true so the item will no longer spawn
				key2pickup = true;
			}
		});
		return btnKey;
	}
}


