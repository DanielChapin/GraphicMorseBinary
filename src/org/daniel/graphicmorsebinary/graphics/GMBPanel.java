package org.daniel.graphicmorsebinary.graphics;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GMBPanel extends JPanel {
	
	int currentIndex = 0;
	
	public GMBPanel(byte[] binary) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 300);
		frame.setContentPane(this);
		frame.setVisible(true);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		long now = System.nanoTime(), lastLoop = now, loopNanos = 1000000000 / 5;
		
		while(true)
			if((now = System.nanoTime()) - lastLoop >= loopNanos) {
				lastLoop = now;
				if(currentIndex == binary.length) break;
				this.setBackground((binary[currentIndex++] == 1) ? Color.black : Color.white);
				this.repaint();
			}
		frame.setVisible(false);
	}

}
