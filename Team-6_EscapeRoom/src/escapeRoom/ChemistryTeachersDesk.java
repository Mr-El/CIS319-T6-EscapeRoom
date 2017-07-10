package escapeRoom;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import java.awt.Color;

@SuppressWarnings("serial")
public class ChemistryTeachersDesk extends JFrame {

	private JPanel contentPane;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		
		JButton btnFlask = new JButton();
		btnFlask.setIcon(new ImageIcon(ChemistryTeachersDesk.class.getResource("/Images/flask_blue.png")));
		btnFlask.setBounds(607, 351, 141, 103);
		contentPane.add(btnFlask);
		btnFlask.setOpaque(false);
		btnFlask.setContentAreaFilled(false);
		btnFlask.setBorderPainted(false);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBackground(Color.RED);
		toolBar.setBounds(0, 504, 770, 49);
		contentPane.add(toolBar);
		
		JButton btnHydrogen = new JButton("Hydrogen");
		btnHydrogen.setIcon(new ImageIcon(ChemistryTeachersDesk.class.getResource("/Images/flask_small.png")));
		toolBar.add(btnHydrogen);
		btnHydrogen.setVisible(false);
		
		JLabel lblPicture = new JLabel("picture");
		lblPicture.setBounds(0, 0, 800, 600);
		lblPicture.setIcon(new ImageIcon(ChemistryTeachersDesk.class.getResource("/Images/periodicTable.jpg")));
		contentPane.add(lblPicture);
		
		
		btnFlask.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnFlask.setVisible(false);
				btnHydrogen.setVisible(true);
			}
		});
	}
}
