package miniGames.game3Pack;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

import main.MainMenuRun;

public class koniec {

	private JFrame frame;
	private  boolean isWin;
	String napis;
	drawIcon obrazek;
	private JFrame closeFrame;
	private drawIcon backToMenu = new drawIcon();
	private drawIcon end_exit = new drawIcon();
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
		this.closeFrame=frame2;
		
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
		
		backToMenu.draw("menu_end.png", (szerokosc/2)-100, 170);
		backToMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MainMenuRun menu=new MainMenuRun();
				menu.main(null);
				frame.dispose();
				closeFrame.dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				backToMenu.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		
		frame.getContentPane().add(backToMenu);
		
		end_exit.draw("exit_end.png", (szerokosc/2)+100, 170);
		end_exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				end_exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		frame.getContentPane().add(end_exit);
		
		
		
		
	}
}
