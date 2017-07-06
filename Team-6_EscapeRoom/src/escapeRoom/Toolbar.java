/**
 * 
 */
package escapeRoom;

import javax.swing.*;

/**
 * @author Mr_El
 *
 */
public class Toolbar extends JFrame {
	void ToolbarTest() {
		JToolBar toolbar = new JToolBar();
		
		JButton button = new JButton("test");
		toolbar.add(button);
		
		add(toolbar);
		pack();
	}
	
	
	
}
