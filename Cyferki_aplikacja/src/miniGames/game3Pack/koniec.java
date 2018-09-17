package miniGames.game3Pack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SpringLayout;

public class koniec {

	private JFrame frame;
	private  boolean isWin;
	String napis;
	drawIcon obrazek;
	private JFrame poprzedniFrame;
	/**
	 * Launch the application.
	 * @wbp.parser.entryPoint
	 */
		
	public koniec(boolean isWin)
	{
		this.isWin=isWin;
		
	}
	public koniec()
	{
		
	}
	/**
	 * @wbp.parser.entryPoint
	 */
	public koniec(boolean isWin, JFrame frame2)
	{
		this.isWin=isWin;
		poprzedniFrame=frame2;
		
	}
	
		/**
		 * @wbp.parser.entryPoint
		 */
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
	 * @wbp.parser.entryPoint
	 */
	public void start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);
		
		final int szerokosc=frame.getWidth();
		
		JLabel elo = new JLabel("witaj swiecie");
		elo.setBounds((szerokosc/2)-65, 120, 130, 50);
		frame.getContentPane().add(elo);
		if(isWin)
		{
			napis="Brawo wygrywasz";
			elo.setText(napis);
			obrazek=new drawIcon();
			obrazek.draw("image.png",szerokosc/2,10);
			frame.getContentPane().add(obrazek);
		}
		else
		{
			napis="Niestety nie uda³o siê";
			elo.setText(napis);
			obrazek=new drawIcon();
			obrazek.draw("1.png",szerokosc/2,10);
			frame.getContentPane().add(obrazek);
		}
		
		drawIcon backToMenu = new drawIcon();
		backToMenu.draw("menu_end.png", (szerokosc/2)-100, 170);
		frame.getContentPane().add(backToMenu);
		
		drawIcon end_exit = new drawIcon();
		end_exit.draw("exit_end.png", (szerokosc/2)+100, 170);
		frame.getContentPane().add(end_exit);
		
		
		
		
	}
}
