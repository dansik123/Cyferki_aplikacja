package miniGames.game2Pack;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class koniec {

	private JFrame frame;
	String napis;
	drawImage obrazek;
	/**
	 * Launch the application.
	 * @wbp.parser.entryPoint
	 */
		
	public koniec()
	{
		
	}
	
		public void run() {
			try {
				koniec window = new koniec();
				window.start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	/**
	 * Create the application.
	 */
	public void start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);
		
		JLabel elo = new JLabel("witaj swiecie");
		elo.setBounds(40, 40, 100, 14);
		frame.getContentPane().add(elo);

			napis="Brawo wygrywasz";
			elo.setText(napis);
			obrazek=new drawImage();
			obrazek.draw("image.png",100,100);
			frame.getContentPane().add(obrazek);
		
		
	}
}
