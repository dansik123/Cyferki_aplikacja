package miniGames.game1Pack;


import java.awt.Frame;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class NaukaCyferek {

	private JFrame frame;
	private JLabel exit;
	/**
	 * Launch the application.
	 * @wbp.parser.entryPoint
	 */
			public void run() {
				try {
					NaukaCyferek window = new NaukaCyferek();
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
		frame.getContentPane().setBackground(Color.BLACK);
		
	    frame.setExtendedState(Frame.MAXIMIZED_BOTH); 
	    frame.setUndecorated(true);
	    frame.setVisible(true);
		final int szerokosc=frame.getWidth();
		int buttonWidth=szerokosc/9;
		final int wysokosc=frame.getHeight();
		int buttonHeight=wysokosc/8;
	    frame.getContentPane().setBounds(0, 0, szerokosc,wysokosc );
		frame.getContentPane().setLayout(null);
		
		
		System.out.println(szerokosc+" "+wysokosc);
		
		JPanel controlPanel = new JPanel();
		controlPanel.setForeground(Color.LIGHT_GRAY);
		controlPanel.setBounds(0, 0, szerokosc,40);
		controlPanel.setLayout(null);
		frame.getContentPane().add(controlPanel);
		
		Image img=new ImageIcon(this.getClass().getResource("/cancel.png")).getImage();
		exit = new JLabel(new ImageIcon(img));
		exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				System.exit(0);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		exit.setBounds(szerokosc-40, 0, 40, 40);
		controlPanel.add(exit);
		
		drawIcon cyfra=new drawIcon();
		
		JButton button = new JButton("1");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		button.setBounds(buttonWidth, 0+40, buttonWidth, buttonHeight);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("2");
		button_1.setBounds(2*buttonWidth, 0+40, buttonWidth, buttonHeight);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("4");
		button_2.setBounds(buttonWidth, (2*buttonHeight)+40, buttonWidth, buttonHeight);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.setBounds(0, (2*buttonHeight)+40, buttonWidth, buttonHeight);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		button_4.setBounds(2*buttonWidth, (2*buttonHeight)+40, buttonWidth, buttonHeight);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("7");
		button_5.setBounds(buttonWidth, (4*buttonHeight)+40, buttonWidth, buttonHeight);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.setBounds(0, (4*buttonHeight)+40, buttonWidth, buttonHeight);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("9");
		button_7.setBounds(buttonWidth, (6*buttonHeight)+40, buttonWidth, buttonHeight);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("0");
		button_8.setBounds(0, 0+40, buttonWidth, buttonHeight);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("8");
		button_9.setBounds(2*buttonWidth, (4*buttonHeight)+40, buttonWidth, buttonHeight);
		frame.getContentPane().add(button_9);
		
	}
}

