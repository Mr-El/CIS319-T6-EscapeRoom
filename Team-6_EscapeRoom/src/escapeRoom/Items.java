
package escapeRoom;

/** * * * * * * * * * * * *
 * CIS319    -    Team 6  *
 * Chemistry Escape Room  *
 *                        *
 * By: Elliott Britton    *
 *     Matthew Hahm       *
 *     Malachi Manno      *
 *     Eric Barker        *
 *                        *
 ** * * * * * * * * * * * */

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * @author Mr_El
 *
 */
public class Items extends JFrame {	
	private static final long serialVersionUID = 1L;
	
	Toolbar toolbar = new Toolbar();
	
	//sets all the item pickups to false so the inventory starts empty and the items spawn
	static int flaskpickup = 0;
	static int jugpickup = 0;
	static int bookpickup = 0;
	static int gflaskpickup = 0;
	static int paperpickup = 0;
	static int keypickup = 0;
	static int lighterpickup = 0;
	static int key2pickup = 0;
	static int bunsonpickup = 0;
	
	int allitems = flaskpickup + gflaskpickup + lighterpickup + bunsonpickup + jugpickup;
	
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
				flaskpickup = 1;
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
				jugpickup = 1;
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
				bookpickup = 1;
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
				JOptionPane.showMessageDialog(new JFrame(), 
						"It's a strange chemical; hard to tell from the color. But the label says \"Flouride.\"",
						"Cheet Sheet",
						JOptionPane.INFORMATION_MESSAGE);
				//btnToolFlask.setVisible(true);
				//pickup is now set to true so the item will no longer spawn
				gflaskpickup = 1;
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
				JOptionPane.showMessageDialog(new JFrame(), 
						"This slip of paper says that to mix hydrogen with flouride to produce Hydroflouric acid.",
						"Cheet Sheet",
						JOptionPane.INFORMATION_MESSAGE);
				//pickup is now set to true so the item will no longer spawn
				paperpickup = 1;
				
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
				keypickup = 1;
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
				lighterpickup = 1;
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
				JOptionPane.showMessageDialog(new JFrame(), 
						"It's another key but I don't think it's to the door.",
						"Cheet Sheet",
						JOptionPane.INFORMATION_MESSAGE);
				key2pickup = 1;
			}
		});
		return btnKey;
	}
	
	public static Component btnBunsion() {
		JButton btnBunson = new JButton("");
		btnBunson.setIcon(new ImageIcon(Cabinet.class.getResource("/Images/bunsion.png")));
		btnBunson.setBounds(496, 271, 90, 76);
		btnBunson.setBorderPainted(false);
		btnBunson.setContentAreaFilled(false);
		btnBunson.setOpaque(false);
		btnBunson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnBunson.setVisible(false);
				JOptionPane.showMessageDialog(new JFrame(), 
						"This is a kit for a bunsen burner, maybe heating these chemicals together can make something for the door.",
						"Cheet Sheet",
						JOptionPane.INFORMATION_MESSAGE);
				bunsonpickup = 1;
			}
		});
		
		return btnBunson;
	}
}


