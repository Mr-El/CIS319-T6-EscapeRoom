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

public class ChemistryTeachersDrawer extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChemistryTeachersDrawer frame = new ChemistryTeachersDrawer();
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
	public ChemistryTeachersDrawer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		if (Items.lighterpickup == false) {
			contentPane.add(Items.btnLighter());
		}
		
		contentPane.add(Toolbar.bar());
		
		JButton btnBack = new JButton("");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new ChemistryTeachersDesk().setVisible(true);
				dispose();
			}
		});
		btnBack.setIcon(new ImageIcon(ChemistryTeachersDrawer.class.getResource("/Images/back.png")));
		btnBack.setBounds(-11, 0, 103, 61);
		contentPane.add(btnBack);
		btnBack.setOpaque(false);
		btnBack.setBorderPainted(false);
		btnBack.setContentAreaFilled(false);
		
		
		
		JLabel lblBackground = new JLabel();
		lblBackground.setIcon(new ImageIcon(ChemistryTeachersDrawer.class.getResource("/Images/TeachersDrawer-01.png")));
		lblBackground.setBounds(0, -11, 782, 614);
		contentPane.add(lblBackground);
	}
}
