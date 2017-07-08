/**
 * 
 */
package escapeRoom;

import javax.sound.sampled.*;

/**
 * @author Mr_El
 *
 */
public class Sound1 {
private Clip clip1;
	
	// Change file name to match yours, of course
	public static Sound1 sound1 = new Sound1("/escapeRoom/RLD_Installer_11.wav");
	public static Sound1 sound2 = new Sound1("/escapeRoom/locked.wav");
	
	public Sound1(String filename) {
		try {
			AudioInputStream ais = AudioSystem.getAudioInputStream(Sound1.class.getResource(filename));
			clip1 = AudioSystem.getClip();
			clip1.open(ais);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void play1() {
		try {
			if (clip1 != null) {
				new Thread() {
					public void run() {
						synchronized (clip1) {
							clip1.stop();
							clip1.setFramePosition(0);
							clip1.start();
						}
					}
				}.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void stop1(){
		if(clip1 == null) return;
		clip1.stop();
	}
	
	public void loop1() {
		try {
			if (clip1 != null) {
				new Thread() {
					public void run() {
						synchronized (clip1) {
							clip1.stop();
							clip1.setFramePosition(0);
							clip1.loop(Clip.LOOP_CONTINUOUSLY);
						}
					}
				}.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean isActive1(){
		return clip1.isActive();
	}
}