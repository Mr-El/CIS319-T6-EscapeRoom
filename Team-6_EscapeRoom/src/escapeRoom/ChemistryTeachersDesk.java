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

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChemistryTeachersDesk extends JFrame {
	private static final long serialVersionUID = 1L;
	public JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChemistryTeachersDesk frame = new ChemistryTeachersDesk();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ChemistryTeachersDesk() {
		//Creates the frame 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Items items = new Items();
		Toolbar toolbar = new Toolbar();
		setBounds(100, 100, 800, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Toolbar.bar();
		
		//Regular Buttons
		if(Items.flaskpickup == false) {
			contentPane.add(Items.btnFlask());
		}
		
		//adds/updates the toolbar
		contentPane.add(Toolbar.bar());
		
		//creates a button to view the periodic table
		JButton btnPeriodicTable = new JButton();
		btnPeriodicTable.setOpaque(false);
		btnPeriodicTable.setContentAreaFilled(false);
		btnPeriodicTable.setBorderPainted(false);
		
		btnPeriodicTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new PeriodicTable().setVisible(true);
				dispose();
			}
		});
		
		//creates a back button to let you return to your previous location
		JButton btnBack = new JButton("");
		btnBack.setIcon(new ImageIcon(ChemistryTeachersDesk.class.getResource("/Images/back.png")));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new ChemistryRoom().setVisible(true);
				dispose(); //closes the previous window saving memory
			}
		});
		btnBack.setBounds(-18, 0, 109, 54);
		contentPane.add(btnBack);
		btnPeriodicTable.setBounds(77, 24, 293, 293);
		contentPane.add(btnPeriodicTable);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
		
		//toolbar update
		if(Items.flaskpickup == true) {
			Toolbar.bar();
		}
		
		//creates a button for the monitor
		JButton btnMonitor = new JButton("Monitor");
		btnMonitor.setIcon(new ImageIcon(ChemistryTeachersDesk.class.getResource("/Images/desktop.png")));
		btnMonitor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnMonitor.setVisible(false);
			}
		});
		btnMonitor.setBounds(397, 336, 128, 69);
		contentPane.add(btnMonitor);
		btnMonitor.setVisible(true);
		btnMonitor.setOpaque(false);
		btnMonitor.setContentAreaFilled(false);
		btnMonitor.setBorderPainted(false);
		
		//creates a button that plays a locked sound for items unreachable
		JButton btnLocked = new JButton("");
		btnLocked.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Items.keypickup == true) {
					new ChemistryTeachersDrawer().setVisible(true);
					dispose();
				}
				else {
					Sound1.sound2.play1(); //plays locked sound effect
				}
				
			}
		});
		
		
		btnLocked.setBounds(636, 477, 97, 54);
		contentPane.add(btnLocked);
		btnLocked.setOpaque(false);
		btnLocked.setContentAreaFilled(false);
		btnLocked.setBorderPainted(false);
		
		//???
		JButton btnChair = new JButton("");
		btnChair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sound1.sound3.play1();
			}
		});
		btnChair.setBounds(68, 381, 191, 173);
		contentPane.add(btnChair);
		btnChair.setOpaque(false);
		btnChair.setContentAreaFilled(false);
		btnChair.setBorderPainted(false);
		
		JLabel lblPicture = new JLabel("");
		lblPicture.setBounds(0, 0, 800, 600);
		lblPicture.setIcon(new ImageIcon(ChemistryTeachersDesk.class.getResource("/Images/TeachersDesk-01.png")));
		contentPane.add(lblPicture);
		
	}
}
