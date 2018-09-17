package miniGames.game2Pack;

import javax.swing.JFrame;
import javax.swing.JLabel;

import miniGames.game3Pack.drawIcon;

public class koniec {

	private JFrame frame;
	String napis;
	drawIcon obrazek;
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
		frame.setBounds(100, 100, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);
		
		final int szerokosc=frame.getWidth();
		
		JLabel elo = new JLabel("witaj swiecie");
		elo.setBounds((szerokosc/2)-65, 140, 130, 50);
		frame.getContentPane().add(elo);
			napis="Brawo wygrywasz";
			elo.setText(napis);
			obrazek=new drawIcon();
			obrazek.draw("image.png",szerokosc/2,25);
			frame.getContentPane().add(obrazek);

		
		drawIcon backToMenu = new drawIcon();
		backToMenu.draw("menu_end.png", (szerokosc/2)-100, 200);
		frame.getContentPane().add(backToMenu);
		
		
		
		
		
		
	}
}
