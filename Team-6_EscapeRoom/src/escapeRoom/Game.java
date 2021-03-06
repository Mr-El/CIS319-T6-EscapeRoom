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


//test
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * @author Mr_El
 * Commit only the classes and metadata to the github!!!
 */

public class Game {

	private JFrame frame;

	private Image img;
	//ClassRoom background = new ClassRoom();
	
	public void paint(Graphics g) {
		//super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, //turns on anitialising
				RenderingHints.VALUE_ANTIALIAS_ON);
		g.drawImage(img , 0, 0, null);
	}
	
	
		
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame("Escape Room");
		
		frame.setSize(800, 600); //Standard window size
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblClassroomEscape = new JLabel("ClassRoom Escape");
		lblClassroomEscape.setForeground(new Color(255, 255, 255));
		lblClassroomEscape.setBackground(new Color(0, 255, 0));
		lblClassroomEscape.setFont(new Font("Tele-Marines", Font.BOLD | Font.ITALIC, 26));
		lblClassroomEscape.setBounds(173, 152, 437, 91);
		frame.getContentPane().add(lblClassroomEscape);
				
		Sound1.sound1.play1(); //plays the music
		
		//Below creates the buttons and listeners for "Play" "Options" "Credits" "Music"
		JButton btnPlay = new JButton("Play");
		btnPlay.setBounds(540, 367, 97, 25);
		frame.getContentPane().add(btnPlay);
		
		JButton btnOptions = new JButton("Options");
		btnOptions.setBounds(114, 367, 97, 25);
		frame.getContentPane().add(btnOptions);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(404, 450, 97, 25);
		frame.getContentPane().add(btnExit);
		
		JButton btnCredits = new JButton("Credits");
		btnCredits.setBounds(219, 450, 97, 25);
		frame.getContentPane().add(btnCredits);
		

		JButton btnMusicOnoff = new JButton("Music Off");
		btnMusicOnoff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sound1.sound1.stop1();
			}
		});
		btnMusicOnoff.setBounds(303, 367, 124, 25);
		frame.getContentPane().add(btnMusicOnoff);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(46, 139, 87));
		panel.setBounds(173, 153, 437, 91);
		frame.getContentPane().add(panel);
		
		//sets the background for the main menu
		JLabel lblBackground = new JLabel();
		lblBackground.setIcon(new ImageIcon(Game.class.getResource("/Images/Chemestry-Escape Room.png")));
		lblBackground.setBounds(0, 0, 782, 553);
		frame.getContentPane().add(lblBackground);
		lblBackground.revalidate();
		lblBackground.repaint();
		
		//Performs actions on buttons
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				try {
					new ChemistryRoom().setVisible(true);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}	
			}	
		});
		
		btnOptions.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				new Options().setVisible(true);
			}
		});
		
		btnCredits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Credits().setVisible(true);
			}
		});
		
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	//public Game() {
	//	initialize();
	//}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
