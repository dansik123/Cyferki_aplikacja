package main;

import java.awt.EventQueue;

import javax.swing.JFrame;

import miniGames.game1Pack.NaukaCyferek;
import miniGames.game2Pack.SzukanieCyferek;
import miniGames.game3Pack.PrzypasowywanieCyferek;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainMenuRun {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenuRun window = new MainMenuRun();
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
	public MainMenuRun() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton runCyferki = new JButton("W\u0142\u0105cz Cyferki");
		runCyferki.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				NaukaCyferek nauka=new NaukaCyferek();
				nauka.run();
				frame.dispose();
			}
		});
		runCyferki.setBounds(109, 46, 132, 39);
		frame.getContentPane().add(runCyferki);
		
		JButton runSzukanieCyferek = new JButton("W\u0142\u0105cz Szukanie");
		runSzukanieCyferek.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SzukanieCyferek nauka=new SzukanieCyferek();
				nauka.run();
				frame.dispose();
			}
		});
		runSzukanieCyferek.setBounds(109, 107, 132, 39);
		frame.getContentPane().add(runSzukanieCyferek);
		
		JButton runPrzypasowywanieCyferek = new JButton("W\u0142\u0105cz Przypasowywanie");
		runPrzypasowywanieCyferek.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PrzypasowywanieCyferek nauka=new PrzypasowywanieCyferek();
				nauka.run();
				frame.dispose();
			}
			
		});
		runPrzypasowywanieCyferek.setBounds(109, 157, 132, 39);
		frame.getContentPane().add(runPrzypasowywanieCyferek);
	}
}
