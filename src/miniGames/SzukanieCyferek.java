package miniGames;


import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class SzukanieCyferek {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SzukanieCyferek window = new SzukanieCyferek();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SzukanieCyferek() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    frame.setSize(screenSize.width, screenSize.height);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		Image img=new ImageIcon(this.getClass().getResource("/1.png")).getImage();
		JLabel imageLabel = new JLabel(new ImageIcon(img));
		Random random=new Random();
		int liczba=random.nextInt(100)+2;
		System.out.println(liczba);
		imageLabel.setBounds(74, 74, 172, 170);
		frame.getContentPane().add(imageLabel);
		
		final int szerokosc=frame.getWidth()/9;
		final int wysokosc=frame.getHeight()/8;
		System.out.print(szerokosc+" "+wysokosc);
		
		

	}
}

