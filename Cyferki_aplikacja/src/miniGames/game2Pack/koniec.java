package miniGames.game2Pack;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

import main.MainMenuRun;
import miniGames.game3Pack.drawIcon;

public class koniec {

	private JFrame frame;
	String napis;
	drawIcon obrazek;
	private drawIcon backToMenu = new drawIcon();
	private JFrame closeFrame;
	private drawIcon end_exit = new drawIcon();
	/**
	 * Launch the application.
	 * @param frame2 
	 * @wbp.parser.entryPoint
	 */
		
	public koniec(JFrame frame2)
	{
		this.closeFrame=frame2;
		
	}
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
		elo.setBounds((szerokosc/2)-65, 120, 130, 50);
		frame.getContentPane().add(elo);

			napis="Brawo wygrywasz";
			elo.setText(napis);
			obrazek=new drawIcon();
			obrazek.draw("image.png",szerokosc/2,10);
			frame.getContentPane().add(obrazek);

		
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
