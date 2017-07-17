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

public class ChemistryDoor extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChemistryDoor frame = new ChemistryDoor();
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
	public ChemistryDoor() {
		//creates the game frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Items items = new Items();
		
		contentPane.add(Toolbar.bar()); //adds the toolbar
		
		//if statments that spawn the items
		if (items.jugpickup == false) {
			contentPane.add(Items.btnJug());
		}
		
		if (items.paperpickup == false) {
			contentPane.add(Items.Paper());
		}

		if (items.keypickup == false) {
			contentPane.add(Items.btnKey());
		}
		
		//Creates a back button that will bring you to the main area
		JButton btnBack = new JButton("");
		btnBack.setIcon(new ImageIcon(ChemistryDoor.class.getResource("/Images/back.png")));
		btnBack.setBounds(0, 0, 95, 61);
		contentPane.add(btnBack);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
		btnBack.setOpaque(false);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new ChemistryRoom().setVisible(true);
				dispose();
			}
		});
		
		//Creates a button for the lock on the door
		JButton btnLock = new JButton("");
		btnLock.setBounds(530, 253, 40, 61);
		contentPane.add(btnLock);
		btnLock.setContentAreaFilled(false);
		btnLock.setBorderPainted(false);
		btnBack.setOpaque(false);
		btnLock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sound1.sound2.play1();
			}
		});
		//allows the player to attempt opening the door
		JButton btnKnock = new JButton("");
		btnKnock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sound1.sound4.play1();
			}
		});
		btnKnock.setBounds(431, 126, 110, 99);
		contentPane.add(btnKnock);
		btnKnock.setOpaque(false);
		btnKnock.setContentAreaFilled(false);
		btnKnock.setBorderPainted(false);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon(ChemistryDoor.class.getResource("/Images/door-01.png")));
		lblBackground.setBounds(0, 0, 782, 553);
		contentPane.add(lblBackground);
	}
}
