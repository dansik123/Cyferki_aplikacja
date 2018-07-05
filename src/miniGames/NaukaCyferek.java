package miniGames;


import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.Box;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class NaukaCyferek {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NaukaCyferek window = new NaukaCyferek();
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
	public void start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    frame.setSize(screenSize.width, screenSize.height);
	    frame.setVisible(true);
	    
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		final int szerokosc=frame.getWidth()/9;
		final int wysokosc=frame.getHeight()/8;
		System.out.print(szerokosc+" "+wysokosc);
		
		JButton button = new JButton("1");
		button.setBounds(szerokosc, 0, szerokosc, wysokosc);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("2");
		button_1.setBounds(2*szerokosc, 0, szerokosc, wysokosc);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("4");
		button_2.setBounds(szerokosc, 2*wysokosc, szerokosc, wysokosc);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.setBounds(0, 2*wysokosc, szerokosc, wysokosc);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		button_4.setBounds(2*szerokosc, 2*wysokosc, szerokosc, wysokosc);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("7");
		button_5.setBounds(szerokosc, 4*wysokosc, szerokosc, wysokosc);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.setBounds(0, 4*wysokosc, szerokosc, wysokosc);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("9");
		button_7.setBounds(szerokosc, 6*wysokosc, szerokosc, wysokosc);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("0");
		button_8.setBounds(0, 0, szerokosc, wysokosc);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("8");
		button_9.setBounds(2*szerokosc, 4*wysokosc, szerokosc, wysokosc);
		frame.getContentPane().add(button_9);
		
		Component glue = Box.createGlue();
		glue.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
			}
		});
		glue.setBounds(10, 107, 151, 72);
		frame.getContentPane().add(glue);
	}
}

