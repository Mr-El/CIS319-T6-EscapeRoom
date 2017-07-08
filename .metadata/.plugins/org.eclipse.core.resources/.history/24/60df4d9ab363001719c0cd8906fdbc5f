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

@SuppressWarnings("serial")
public class Book extends JFrame {

	private JPanel contentPane;

	/**
	 * TODO: move items to their own .java - Matthew
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Book frame = new Book();
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
	public Book() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 477, 301);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBook = new JLabel("Book");
		lblBook.setIcon(new ImageIcon(Book.class.getResource("/escapeRoom/book.jpg")));
		lblBook.setBounds(161, 58, 330, 196);
		contentPane.add(lblBook);
		
		JLabel lblThisIsThe = new JLabel("This is the Chemistry Book. It contains information on the chemicals you need.");
		lblThisIsThe.setBounds(0, 13, 447, 43);
		contentPane.add(lblThisIsThe);
		
		JButton button = new JButton("<- Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button.setBounds(12, 229, 97, 25);
		contentPane.add(button);
	}

}
