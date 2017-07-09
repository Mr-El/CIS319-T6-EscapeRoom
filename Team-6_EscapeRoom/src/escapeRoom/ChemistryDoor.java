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
		
		JButton btnBack = new JButton("");
		btnBack.setIcon(new ImageIcon(ChemistryDoor.class.getResource("/Images/back.png")));
		btnBack.setBounds(0, 0, 94, 64);
		contentPane.add(btnBack);
		btnBack.setOpaque(false);
		btnBack.setBorderPainted(false);
		btnBack.setContentAreaFilled(false);
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ChemistryRoom().setVisible(true);
				contentPane.setVisible(false);
			}
		});
		
		JButton btnJug = new JButton();
		btnJug.setIcon(new ImageIcon(ChemistryDoor.class.getResource("/Images/waterjug1.png")));
		btnJug.setBounds(219, 409, 85, 87);
		btnJug.setOpaque(false);
		btnJug.setContentAreaFilled(false);
		btnJug.setBorderPainted(false);
		contentPane.add(btnJug);
		
		JButton btnPaper = new JButton();
		btnPaper.setContentAreaFilled(false);
		btnPaper.setBorderPainted(false);
		btnPaper.setIcon(new ImageIcon(ChemistryDoor.class.getResource("/Images/paper1.png")));
		btnPaper.setBounds(513, 469, 99, 50);
		contentPane.add(btnPaper);
		
		JButton btnKey = new JButton();
		btnKey.setIcon(new ImageIcon(ChemistryDoor.class.getResource("/Images/key.png")));
		btnKey.setBounds(32, 469, 67, 50);
		contentPane.add(btnKey);
		btnKey.setOpaque(false);
		btnKey.setBorderPainted(false);
		
		
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
		
		JButton btnKey_1 = new JButton("Key");
		btnKey_1.setIcon(new ImageIcon(ChemistryDoor.class.getResource("/Images/key.png")));
		toolBar.add(btnKey_1);
		btnKey_1.setVisible(false);
		btnCheatSheet.setVisible(false);
		
		btnKey.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnKey.setVisible(false);
				JOptionPane.showMessageDialog(contentPane,
						"This key looks like it unlocks something you need.",
						"Key",
						JOptionPane.INFORMATION_MESSAGE);
				btnKey_1.setVisible(true);
			}
		});
		btnKey.setContentAreaFilled(false);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 782, 562);
		lblNewLabel.setIcon(new ImageIcon(ChemistryDoor.class.getResource("/Images/door-01.png")));
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
