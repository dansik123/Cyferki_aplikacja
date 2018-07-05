package main;

import java.awt.EventQueue;

import javax.swing.JFrame;

import miniGames.NaukaCyferek;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton runCyferki = new JButton("W\u0142\u0105cz Cyferki");
		runCyferki.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				NaukaCyferek nauka=new NaukaCyferek();
				nauka.start();
			}
		});
		runCyferki.setBounds(109, 92, 132, 39);
		frame.getContentPane().add(runCyferki);
	}
}
