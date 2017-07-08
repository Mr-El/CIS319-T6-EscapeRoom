package escapeRoom;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;
import java.awt.Color;

@SuppressWarnings("serial")
public class ChemistryDoor extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
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
		setBounds(100, 100, 800, 624);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnDoor = new JButton();
		btnDoor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Sound1.sound2.play1();
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
		btnJug.setIcon(new ImageIcon(ChemistryDoor.class.getResource("/Images/waterjug.png")));
		btnJug.setBounds(136, 432, 99, 87);
		btnJug.setOpaque(false);
		btnJug.setContentAreaFilled(false);
		btnJug.setBorderPainted(false);
		contentPane.add(btnJug);
		
		JButton btnPaper = new JButton();
		btnPaper.setContentAreaFilled(false);
		btnPaper.setBorderPainted(false);
		btnPaper.setIcon(new ImageIcon(ChemistryDoor.class.getResource("/Images/paper.png")));
		btnPaper.setBounds(547, 469, 99, 50);
		contentPane.add(btnPaper);
		
		JToolBar toolBar = new JToolBar("Items");
		toolBar.setBackground(Color.RED);
		toolBar.setBounds(0, 524, 775, 53);
		contentPane.add(toolBar);
		
		JButton btnWaterJug = new JButton("Water Jug");
		btnWaterJug.setIcon(new ImageIcon(ChemistryDoor.class.getResource("/Images/waterjug.png")));
		toolBar.add(btnWaterJug);
		btnWaterJug.setVisible(false);
		
		JButton btnCheatSheet = new JButton("Cheat Sheet");
		btnCheatSheet.setIcon(new ImageIcon(ChemistryDoor.class.getResource("/Images/paper.png")));
		toolBar.add(btnCheatSheet);
		btnCheatSheet.setVisible(false);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 775, 522);
		lblNewLabel.setIcon(new ImageIcon(ChemistryDoor.class.getResource("/Images/door.jpg")));
		contentPane.add(lblNewLabel);
		
		btnPaper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnPaper.setVisible(false);
				JOptionPane.showMessageDialog(contentPane, "This slip of paper says that to mix chemical one with chemical two",
						"Cheet Sheet",
						JOptionPane.INFORMATION_MESSAGE);
				btnCheatSheet.setVisible(true);
			}
		});
		
		btnJug.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnJug.setVisible(false);
				JOptionPane.showMessageDialog(contentPane,
						"This water is cold and fresh, maybe you should add it to something.",
						"Jug of Water",
						JOptionPane.INFORMATION_MESSAGE);
				btnWaterJug.setVisible(true);
			}
		});
		
		btnWaterJug.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(contentPane,
						"This water is cold and fresh, maybe you should add it to something.",
						"Jug of Water",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		btnCheatSheet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(contentPane, "This slip of paper says that to mix chemical one with chemical two",
						"Cheet Sheet",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
	}
}
