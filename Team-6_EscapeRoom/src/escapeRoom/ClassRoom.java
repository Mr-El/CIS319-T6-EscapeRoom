/**
 * 
 */
package escapeRoom;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

/**
 * @author Mr_El
 *
 */
public class ClassRoom {
	private Game game;
	Image img;
	public ClassRoom() { //constructor
		//loads the background image and stores it in img object.
		img = Toolkit.getDefaultToolkit().createImage("StartScene.jpg");
	}
	
	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
}