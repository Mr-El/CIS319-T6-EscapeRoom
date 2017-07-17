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

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class Toolbar {

	public static Component bar()
	{
		JPanel panel = new JPanel();
		JToolBar toolBar = new JToolBar();
		toolBar.setBackground(Color.RED);
		toolBar.setBounds(0, 553, 782, 50);
		panel.add(toolBar);
		
		//TODO: Toolbar
		if(Items.flaskpickup == true)
		{
			JButton btnHydrogen = new JButton("Hydrogen");
			btnHydrogen.setIcon(new ImageIcon(ChemistryTeachersDesk.class.getResource("/Images/flask_small.png")));
			//there was no setbounds so the program did not know where to put the button
			//btnHydrogen.setBounds(100, 500, 50, 50);
			btnHydrogen.setContentAreaFilled(false);
			btnHydrogen.setBorderPainted(false);
			btnHydrogen.setVisible(true);
			btnHydrogen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(new JPanel(),
							"It's a Flask of Hyrdrogen, still cold and liquified. Maybe you can combine this with something.",
						    "Flask of Hydrogen",
							JOptionPane.INFORMATION_MESSAGE);
				}
			});
			toolBar.add(btnHydrogen);
			return btnHydrogen;
		}
		return toolBar;
	}
	
	
}
