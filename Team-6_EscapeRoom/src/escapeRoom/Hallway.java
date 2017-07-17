package escapeRoom;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Hallway extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hallway frame = new Hallway();
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
	public Hallway() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCongratulations = new JLabel("Congratulations!!!");
		lblCongratulations.setFont(new Font("Tele-Marines", Font.BOLD | Font.ITALIC, 24));
		lblCongratulations.setBounds(207, 159, 440, 95);
		contentPane.add(lblCongratulations);
		
		JLabel lblYouHaveEscaped = new JLabel("You have escaped the room!");
		lblYouHaveEscaped.setBounds(301, 237, 263, 16);
		contentPane.add(lblYouHaveEscaped);
		
		JLabel lblButItsNot = new JLabel("But it's not game over yet!!! Soon there will be more!!!");
		lblButItsNot.setBounds(231, 267, 346, 16);
		contentPane.add(lblButItsNot);
		
		JButton btnGameOver = new JButton("");
		btnGameOver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnGameOver.setIcon(new ImageIcon(Hallway.class.getResource("/Images/gameover.png")));
		btnGameOver.setBounds(618, 445, 152, 95);
		contentPane.add(btnGameOver);
		btnGameOver.setBorderPainted(false);
		btnGameOver.setOpaque(false);
		btnGameOver.setContentAreaFilled(false);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setFont(new Font("Tele-Marines", Font.BOLD | Font.ITALIC, 24));
		lblBackground.setIcon(new ImageIcon(Hallway.class.getResource("/Images/hallway-01.png")));
		lblBackground.setBounds(0, 0, 782, 553);
		contentPane.add(lblBackground);
	}
}
