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
	static boolean flaskpickup = false;
	static boolean jugpickup = false;
	static boolean bookpickup = false;
	static boolean gflaskpickup = false;
	static boolean paperpickup = false;
	static boolean keypickup = false;
	static int test;
	
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
				test = 1;
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
				bookpickup = true;
			}
		});
		
		
		return btnBook;
	}
	
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
				gflaskpickup = true;
			}
		});
		
		return btngFlask;
		
	}
	
	public static Component Paper() {
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
				paperpickup = true;
				
			}
		});
		return btnPaper;
	}
	
	public static Component btnKey() {
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
				keypickup = true;
			}
		});
		
		return btnKey;
	}
}


