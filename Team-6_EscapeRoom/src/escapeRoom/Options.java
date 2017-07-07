package escapeRoom;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class Options extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame("Options");
		frame.setSize(800, 600);
		frame.setVisible(true);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Options frame = new Options();
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
	public Options() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblVolume = new JLabel("Volume");
		contentPane.add(lblVolume);
		
		JLabel lblAudio = new JLabel("Audio");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblAudio, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblVolume, 62, SpringLayout.SOUTH, lblAudio);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblVolume, 0, SpringLayout.WEST, lblAudio);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblAudio, 10, SpringLayout.NORTH, contentPane);
		contentPane.add(lblAudio);
		
		JRadioButton rdbtnStereo = new JRadioButton("Stereo");
		sl_contentPane.putConstraint(SpringLayout.NORTH, rdbtnStereo, -4, SpringLayout.NORTH, lblAudio);
		sl_contentPane.putConstraint(SpringLayout.EAST, rdbtnStereo, -104, SpringLayout.EAST, contentPane);
		contentPane.add(rdbtnStereo);
		
		JRadioButton rdbtnMono = new JRadioButton("Mono");
		sl_contentPane.putConstraint(SpringLayout.NORTH, rdbtnMono, 6, SpringLayout.SOUTH, rdbtnStereo);
		sl_contentPane.putConstraint(SpringLayout.WEST, rdbtnMono, 0, SpringLayout.WEST, rdbtnStereo);
		contentPane.add(rdbtnMono);
		
		JSlider slider = new JSlider();
		sl_contentPane.putConstraint(SpringLayout.NORTH, slider, 0, SpringLayout.NORTH, lblVolume);
		sl_contentPane.putConstraint(SpringLayout.EAST, slider, -63, SpringLayout.EAST, contentPane);
		contentPane.add(slider);
		
		JLabel label = new JLabel("0");
		sl_contentPane.putConstraint(SpringLayout.NORTH, label, 5, SpringLayout.SOUTH, slider);
		sl_contentPane.putConstraint(SpringLayout.WEST, label, 0, SpringLayout.WEST, slider);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("100");
		sl_contentPane.putConstraint(SpringLayout.NORTH, label_1, 0, SpringLayout.NORTH, label);
		sl_contentPane.putConstraint(SpringLayout.EAST, label_1, -70, SpringLayout.EAST, contentPane);
		contentPane.add(label_1);
		
		JButton button = new JButton("<- Back");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, button, 0, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, button, 0, SpringLayout.EAST, contentPane);
		contentPane.add(button);
		
		JLabel lblResolution = new JLabel("Resolution");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblResolution, 0, SpringLayout.WEST, lblVolume);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblResolution, -49, SpringLayout.SOUTH, contentPane);
		contentPane.add(lblResolution);
		
		@SuppressWarnings("rawtypes")
		JComboBox comboBox = new JComboBox();
		sl_contentPane.putConstraint(SpringLayout.NORTH, comboBox, -3, SpringLayout.NORTH, lblResolution);
		sl_contentPane.putConstraint(SpringLayout.EAST, comboBox, 0, SpringLayout.EAST, label_1);
		contentPane.add(comboBox);
	}
}
