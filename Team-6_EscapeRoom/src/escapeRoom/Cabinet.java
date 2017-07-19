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

public class Cabinet extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cabinet frame = new Cabinet();
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
	public Cabinet() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Items items = new Items();
		
		contentPane.add(TimerTest.Timer());
		
		if (items.bunsonpickup == 0) {
			contentPane.add(Items.btnBunsion());
		}
		
		JButton btnBack = new JButton("");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ChemistryDoor().setVisible(true);
				dispose();
			}
		});
		btnBack.setIcon(new ImageIcon(Cabinet.class.getResource("/Images/back.png")));
		btnBack.setBounds(0, 0, 97, 61);
		contentPane.add(btnBack);
		btnBack.setOpaque(false);
		btnBack.setBorderPainted(false);
		btnBack.setContentAreaFilled(false);
		
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon(Cabinet.class.getResource("/Images/cabinet-01.png")));
		lblBackground.setBounds(0, 0, 782, 553);
		contentPane.add(lblBackground);
	}
}
