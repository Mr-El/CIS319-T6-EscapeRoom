package escapeRoom;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import java.awt.event.ActionListener;
import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import java.awt.Font;
import java.awt.BorderLayout;

public class TimerTest {

	/**
	 * @wbp.parser.entryPoint
	 */
	public static Component Timer() {

        final JFrame frm = new JFrame("Countdown");
        final JLabel countdownLabel = new JLabel("03:00");
        countdownLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
        final Timer t = new Timer(1000, new ActionListener() {
        	int time = 180;
			@Override
			public void actionPerformed(ActionEvent e) {
				time--;
				countdownLabel.setText(format(time / 60) + ":" + format(time % 60));
				if (time == 0) {
					final Timer timer = (Timer) e.getSource();
					timer.stop();
				}
				
			}
        	
        });
        frm.getContentPane().add(countdownLabel, BorderLayout.SOUTH);
        t.start();
        frm.pack();
        frm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frm.setVisible(true);
		return countdownLabel;
    }

    private static String format(int i) {
        String result = String.valueOf(i);
        if (result.length() == 1) {
            result = "0" + result;
        }
        return result;
    }
}
