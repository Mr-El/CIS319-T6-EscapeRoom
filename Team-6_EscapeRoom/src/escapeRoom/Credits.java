package escapeRoom;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.Map;

@SuppressWarnings("serial")
public class Credits extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Credits frame = new Credits();
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
	public Credits() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//jLabels to output the credits
		JLabel lblCredits = new JLabel("<HTML><U>Credits:</U></HTML>"); //Underlines font
		lblCredits.setFont(new Font("Tele-Marines", Font.BOLD | Font.ITALIC, 17));
		lblCredits.setBounds(0, 0, 126, 25);
		contentPane.add(lblCredits);
		
		JLabel lblDirectionAndComposition = new JLabel("Direction and Composition:");
		lblDirectionAndComposition.setBounds(10, 46, 160, 16);
		contentPane.add(lblDirectionAndComposition);
		
		JLabel lblIlustrationAndDesign = new JLabel("Ilustration and Design:");
		lblIlustrationAndDesign.setBounds(10, 93, 141, 16);
		contentPane.add(lblIlustrationAndDesign);
		
		JLabel lblBetaTesters = new JLabel("Beta Testers:");
		lblBetaTesters.setBounds(12, 224, 91, 16);
		contentPane.add(lblBetaTesters);
		
		JLabel lblMalachiteManno = new JLabel("Malachite Manno");
		lblMalachiteManno.setBounds(266, 46, 103, 16);
		contentPane.add(lblMalachiteManno);
		
		JLabel lblElliottBritton = new JLabel("Elliott Britton");
		lblElliottBritton.setBounds(266, 93, 103, 16);
		contentPane.add(lblElliottBritton);
		
		JLabel lblCisGroup = new JLabel("CIS319 - Group 6");
		lblCisGroup.setBounds(317, 2, 103, 16);
		contentPane.add(lblCisGroup);
		
		JLabel lblBackgroundCoding = new JLabel("Background Coding:");
		lblBackgroundCoding.setBounds(12, 141, 139, 16);
		contentPane.add(lblBackgroundCoding);
		
		JLabel lblMatthewHahm = new JLabel("Matthew Hahm");
		lblMatthewHahm.setBounds(266, 141, 91, 16);
		contentPane.add(lblMatthewHahm);
		
		JLabel lblJaniceElliottbritton = new JLabel("Janice Elliott-Britton");
		lblJaniceElliottbritton.setBounds(266, 224, 126, 16);
		contentPane.add(lblJaniceElliottbritton);
		
		JLabel lblMusic = new JLabel("Music:");
		lblMusic.setBounds(12, 184, 56, 16);
		contentPane.add(lblMusic);
		
		JLabel lblReloadedInstaller = new JLabel("Reloaded Installer #11");
		lblReloadedInstaller.setBounds(266, 184, 141, 16);
		contentPane.add(lblReloadedInstaller);
	}
}
