package escapeRoom;

import java.awt.Color;
import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JButton;
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
	
		/*if(Items.flaskpickup == true)
		{
			JButton btnHydrogen = new JButton("Hydrogen");
			btnHydrogen.setIcon(new ImageIcon(ChemistryTeachersDesk.class.getResource("/Images/flask_small.png")));
			btnHydrogen.setVisible(true);
			toolBar.add(btnHydrogen);
			return btnHydrogen;
		}*/
		return toolBar;
	}
	
	/*public static Component blueFlask() {
		JButton btnHydrogen = new JButton("Hydrogen");
		btnHydrogen.setIcon(new ImageIcon(ChemistryTeachersDesk.class.getResource("/Images/flask_small.png")));
		
		return btnHydrogen;
		
	}*/
}
