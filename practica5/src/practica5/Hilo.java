package practica5;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Hilo extends Thread {
	
	private JLabel _labelgif;
	private ImageIcon img; 
	
	public Hilo() {
		// TODO Auto-generated constructor stub
	}

	public Hilo(JLabel labelgif) {
		super();
		
		_labelgif = labelgif;
	
	}

	public void run () {
		int i= 1;
		while (true) {
				
				img = new ImageIcon(i+".gif");
				_labelgif.setIcon(img);
				i++;
				if(i==21)
					i=0;
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
}
