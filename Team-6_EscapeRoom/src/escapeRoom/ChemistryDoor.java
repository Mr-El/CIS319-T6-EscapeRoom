package escapeRoom;

import java.awt.BorderLayout;
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Items items = new Items();
		
		if (items.jugpickup == false) {
			contentPane.add(Items.btnJug());
		}
		
		if (items.paperpickup == false) {
			contentPane.add(Items.Paper());
		}

		if (items.keypickup == false) {
			contentPane.add(Items.btnKey());
		}
		
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
				contentPane.setVisible(false);
			}
		});
		
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
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon(ChemistryDoor.class.getResource("/Images/door-01.png")));
		lblBackground.setBounds(0, 0, 782, 553);
		contentPane.add(lblBackground);
	}
}
