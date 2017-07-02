package escapeRoom;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpringLayout;
import java.awt.Color;

/**
 * @author Mr_El
 * Commit only the classes and metadata to the github!!!
 */

public class Game {

	private JFrame frame;
	
	Player player = new Player(this);
	//ClassRoom background = new ClassRoom();
	
	private void move() {
		player.move();
	}
	
	public void paint(Graphics g) {
		//super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, //turns on anitialising
				RenderingHints.VALUE_ANTIALIAS_ON);
		player.paint(g2d);
		//background.paint(g2d);
	}
	
	private void btnPlayActionPreformed(java.awt.event.ActionEvent evt) {
		new ChemistryRoom().setVisible(true);
	}
		
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame("Escape Room");
		frame.getContentPane().setBackground(Color.GREEN);
		frame.setSize(800, 600); //Standard window size
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JLabel lblClassroomEscape = new JLabel("Classroom Escape");
		springLayout.putConstraint(SpringLayout.NORTH, lblClassroomEscape, 178, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblClassroomEscape, 152, SpringLayout.WEST, frame.getContentPane());
		lblClassroomEscape.setFont(new Font("Tele-Marines", Font.BOLD, 26));
		frame.getContentPane().add(lblClassroomEscape);
		
		JButton btnOptions = new JButton("Options");
		springLayout.putConstraint(SpringLayout.WEST, btnOptions, 89, SpringLayout.WEST, frame.getContentPane());
		btnOptions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnOptions.setFont(new Font("Stencil", Font.PLAIN, 17));
		frame.getContentPane().add(btnOptions);
		
		JButton btnPlay = new JButton("Play");
		springLayout.putConstraint(SpringLayout.NORTH, btnOptions, 0, SpringLayout.NORTH, btnPlay);
		springLayout.putConstraint(SpringLayout.SOUTH, btnPlay, -159, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnPlay, -162, SpringLayout.EAST, frame.getContentPane());
		btnPlay.setFont(new Font("Stencil", Font.PLAIN, 17));
		frame.getContentPane().add(btnPlay);
		
		//Links windows together
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ChemistryRoom().setVisible(true);
				new ChemistryRoom().setSize(800, 600);
				frame.setVisible(false);
			}
		});
		
		btnOptions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Options().setVisible(true);
				frame.setVisible(false);
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Game() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
