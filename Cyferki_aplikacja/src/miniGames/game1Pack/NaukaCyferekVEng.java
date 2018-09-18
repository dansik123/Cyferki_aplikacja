package miniGames.game1Pack;


import java.awt.Frame;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import main.MainMenuRun;
import miniGames.game3Pack.drawIcon;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class NaukaCyferekVEng {

	private JFrame frame;
	private JLabel exit;
	private drawIcon cyfra=new drawIcon();
	private drawIcon backToMenu = new drawIcon();
	private drawIcon end_exit = new drawIcon();
	/**
	 * Launch the application.
	 * @wbp.parser.entryPoint
	 */
			public void run() {
				try {
					NaukaCyferekVEng window = new NaukaCyferekVEng();
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
		frame.getContentPane().setBackground(new Color(84, 53, 40));
		
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
		controlPanel.setBounds(0, 0, szerokosc, 30);
		controlPanel.setForeground(Color.LIGHT_GRAY);
		frame.getContentPane().add(controlPanel);
		SpringLayout sl_panel = new SpringLayout();
		controlPanel.setLayout(sl_panel);
		
		Image img=new ImageIcon(this.getClass().getResource("/cancel.png")).getImage();
		exit = new JLabel(new ImageIcon(img));
		sl_panel.putConstraint(SpringLayout.EAST, exit, 0, SpringLayout.EAST, controlPanel);
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
		
		cyfra.draw("null.png",(szerokosc/2)+200,100);
		frame.getContentPane().add(cyfra);
		
		JButton button = new JButton("1");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cyfra.draw("eng1.png",(szerokosc/2)+200,100);
				
			}
		});
		button.setBounds(buttonWidth, 0+60, buttonWidth, buttonHeight);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("2");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cyfra.draw("eng2.png",(szerokosc/2)+200,100);
			}
		});
		button_1.setBounds(2*buttonWidth, 0+60, buttonWidth, buttonHeight);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("4");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cyfra.draw("eng4.png",(szerokosc/2)+200,100);
			}
		});
		button_2.setBounds(buttonWidth, (2*buttonHeight)+60, buttonWidth, buttonHeight);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cyfra.draw("eng3.png",(szerokosc/2)+200,100);
			}
		});
		button_3.setBounds(0, (2*buttonHeight)+60, buttonWidth, buttonHeight);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cyfra.draw("eng5.png",(szerokosc/2)+200,100);
			}
		});
		
		button_4.setBounds(2*buttonWidth, (2*buttonHeight)+60, buttonWidth, buttonHeight);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("7");
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cyfra.draw("eng7.png",(szerokosc/2)+200,100);
			}
		});
		button_5.setBounds(buttonWidth, (4*buttonHeight)+60, buttonWidth, buttonHeight);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cyfra.draw("eng6.png",(szerokosc/2)+200,100);
			}
		});
		button_6.setBounds(0, (4*buttonHeight)+60, buttonWidth, buttonHeight);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("9");
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cyfra.draw("eng9.png",(szerokosc/2)+200,100);
			}
		});
		button_7.setBounds(buttonWidth, (6*buttonHeight)+60, buttonWidth, buttonHeight);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("0");
		button_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cyfra.draw("eng0.png",(szerokosc/2)+200,100);
			}
		});
		button_8.setBounds(0, 0+60, buttonWidth, buttonHeight);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("8");
		button_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cyfra.draw("eng8.png",(szerokosc/2)+200,100);
			}
		});
		button_9.setBounds(2*buttonWidth, (4*buttonHeight)+60, buttonWidth, buttonHeight);
		frame.getContentPane().add(button_9);
		
		
		backToMenu.draw("menu_end.png", (szerokosc/2)+100, wysokosc-200);
		backToMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MainMenuRun menu=new MainMenuRun();
				menu.main(null);
				frame.dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				backToMenu.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		
		frame.getContentPane().add(backToMenu);
		
		end_exit.draw("exit_end.png", (szerokosc/2)+300, wysokosc-200);
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

