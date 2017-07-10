package escapeRoom;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class Toolbar 
{
	
	public static void bar()
	{
		JPanel panel = new JPanel();
		JToolBar toolBar = new JToolBar();
		toolBar.setBackground(Color.RED);
		toolBar.setBounds(0, 504, 770, 49);
		panel.add(toolBar);
	
		if(Items.flaskpickup == true)
		{
			JButton btnHydrogen = new JButton("Hydrogen");
			btnHydrogen.setIcon(new ImageIcon(ChemistryTeachersDesk.class.getResource("/Images/flask_small.png")));
			toolBar.add(btnHydrogen);
			btnHydrogen.setVisible(false);
		}
	}
}
