package escapeRoom;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

@SuppressWarnings("serial")
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
		setBounds(100, 100, 795, 570);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnDoor = new JButton();
		btnDoor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnDoor.setBounds(527, 259, 85, 81);
		contentPane.add(btnDoor);
		btnDoor.setOpaque(false);
		btnDoor.setContentAreaFilled(false);
		btnDoor.setBorderPainted(false);
		
		JButton btnBack = new JButton("<- Back");
		btnBack.setBounds(5, 5, 59, 25);
		contentPane.add(btnBack);
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ChemistryRoom().setVisible(true);
				dispose();
			}
		});
		
		JButton btnJug = new JButton();
		btnJug.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnJug.setVisible(false);
			}
		});
		btnJug.setIcon(new ImageIcon(ChemistryDoor.class.getResource("/escapeRoom/waterjug.png")));
		btnJug.setBounds(136, 432, 99, 87);
		btnJug.setOpaque(false);
		btnJug.setContentAreaFilled(false);
		btnJug.setBorderPainted(false);
		contentPane.add(btnJug);
		
		JButton btnPaper = new JButton();
		btnPaper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				btnPaper.setVisible(false);
			}
		});
		btnPaper.setContentAreaFilled(false);
		btnPaper.setBorderPainted(false);
		btnPaper.setIcon(new ImageIcon(ChemistryDoor.class.getResource("/escapeRoom/paper.png")));
		btnPaper.setBounds(547, 469, 99, 50);
		contentPane.add(btnPaper);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 775, 522);
		lblNewLabel.setIcon(new ImageIcon(ChemistryDoor.class.getResource("/escapeRoom/door.jpg")));
		contentPane.add(lblNewLabel);
	}
}
