package escapeRoom;

import java.awt.EventQueue;
import java.awt.Frame;
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

public class ChemistryRoom extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame("Escape Room - Game");
		frame.setSize(800, 600);
		frame.setVisible(true);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChemistryRoom frame = new ChemistryRoom();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		JFrame frame1 = new Items();
		frame1.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public ChemistryRoom() {
		@SuppressWarnings("unused")
		JFrame frame = new JFrame();
		Items items = new Items();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 631);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton btn2Door = new JButton();
		btn2Door.setBounds(-83, 132, 154, 184);
		contentPane.add(btn2Door);
		btn2Door.setOpaque(false); //makes button invisible
		btn2Door.setContentAreaFilled(false);
		btn2Door.setBorderPainted(false);
		
		btn2Door.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ChemistryDoor().setVisible(true);
				dispose();
			}
		});
		
		JButton btnTeachersDesk = new JButton();
		btnTeachersDesk.setBounds(645, 279, 169, 265);
		contentPane.add(btnTeachersDesk);
		btnTeachersDesk.setOpaque(false);
		btnTeachersDesk.setContentAreaFilled(false);
		btnTeachersDesk.setBorderPainted(false);
		
		btnTeachersDesk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ChemistryTeachersDesk().setVisible(true);
				dispose();
			}
		});
		
		JButton btnPeriodicTable = new JButton();
		btnPeriodicTable.setBounds(732, 26, 81, 222);
		contentPane.add(btnPeriodicTable);
		btnPeriodicTable.setOpaque(false);
		btnPeriodicTable.setContentAreaFilled(false);
		btnPeriodicTable.setBorderPainted(false);
		
		btnPeriodicTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new PeriodicTable().setVisible(true);
				dispose();
			}
		});
		
		if(items.bookpickup == false)
		{
			contentPane.add(Items.btnBook());
		}
		
		if (items.gflaskpickup == false) {
			contentPane.add(Items.btnGreenFlask());
		}
		
		JToolBar toolBar = new JToolBar("Items");
		toolBar.setBackground(Color.RED);
		toolBar.setForeground(new Color(0, 0, 0));
		toolBar.setToolTipText("");
		toolBar.setBounds(0, 495, 955, 81);
		contentPane.add(toolBar);
		
		JButton btnBook_1 = new JButton("Book");
		btnBook_1.setBackground(new Color(8, 128, 0));
		btnBook_1.setIcon(new ImageIcon(ChemistryRoom.class.getResource("/Images/textbook_green.png")));
		toolBar.add(btnBook_1);
		btnBook_1.setVisible(false);
		
		btnBook_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Book().setVisible(true);
			}
		});
		
		JButton btnToolFlask = new JButton("Flask");
		btnToolFlask.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnToolFlask.setIcon(new ImageIcon(ChemistryRoom.class.getResource("/Images/flask.png")));
		toolBar.add(btnToolFlask);
		btnToolFlask.setVisible(false);
		btnToolFlask.setOpaque(false);
		
		
		
		
		
		
		
		JLabel lblNewLabel = new JLabel("Image");
		lblNewLabel.setBounds(0, 0, 955, 576);
		lblNewLabel.setIcon(new ImageIcon(ChemistryRoom.class.getResource("/Images/Chemestry-Escape Room.png")));
		contentPane.add(lblNewLabel);
	}
}
