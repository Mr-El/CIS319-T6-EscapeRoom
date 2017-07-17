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

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ChemistryRoom extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame("Escape Room - Game");
		frame.setSize(800, 650);
		frame.setVisible(true);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChemistryRoom frame = new ChemistryRoom();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		JFrame frame1 = new Items();
		frame1.setVisible(true);
		
		
	}

	/**
	 * Create the frame.
	 */
	public ChemistryRoom() {
		@SuppressWarnings("unused")
		JFrame frame = new JFrame();
		Items items = new Items();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//Rectangle toolbar experiment
		
		contentPane.add(Toolbar.bar()); //adds the toolbar class
		
		//Creates the button that leads to the door of the the room
		JButton btn2Door = new JButton();
		btn2Door.setBounds(-83, 132, 154, 184);
		contentPane.add(btn2Door);
		btn2Door.setOpaque(false); //makes button invisible
		btn2Door.setContentAreaFilled(false);
		btn2Door.setBorderPainted(false);
		
		btn2Door.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ChemistryDoor().setVisible(true);
				dispose();
			}
		});
		
		//Creates a button that leads to the teachers desk
		JButton btnTeachersDesk = new JButton();
		btnTeachersDesk.setBounds(644, 286, 169, 265);
		contentPane.add(btnTeachersDesk);
		btnTeachersDesk.setOpaque(false);
		btnTeachersDesk.setContentAreaFilled(false);
		btnTeachersDesk.setBorderPainted(false);
		
		btnTeachersDesk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ChemistryTeachersDesk().setVisible(true);
				dispose();
			}
		});
		
		//Creates a button that lets the user look at the periodic table
		JButton btnPeriodicTable = new JButton();
		btnPeriodicTable.setBounds(732, 26, 81, 222);
		contentPane.add(btnPeriodicTable);
		btnPeriodicTable.setOpaque(false);
		btnPeriodicTable.setContentAreaFilled(false);
		btnPeriodicTable.setBorderPainted(false);
		
		btnPeriodicTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new PeriodicTable().setVisible(true);
				dispose();
			}
		});
		
		//if statement that spawn items and keep them despawned after pickup
		if(items.bookpickup == 0)
		{
			contentPane.add(Items.btnBook());
		}
		
		if (items.gflaskpickup == 0) {
			contentPane.add(Items.btnGreenFlask());
		}
		
		//????
		JButton btnChair = new JButton();
		btnChair.setBounds(26, 329, 147, 222);
		contentPane.add(btnChair);
		btnChair.setOpaque(false);
		btnChair.setBorderPainted(false);
		btnChair.setContentAreaFilled(false);
		btnChair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sound1.sound3.play1();
			}
		});
		
		JLabel lblNewLabel = new JLabel("Image");
		lblNewLabel.setBounds(0, 0, 938, 578);
		lblNewLabel.setIcon(new ImageIcon(ChemistryRoom.class.getResource("/Images/Chemestry-Escape Room.png")));
		contentPane.add(lblNewLabel);
	}

}
