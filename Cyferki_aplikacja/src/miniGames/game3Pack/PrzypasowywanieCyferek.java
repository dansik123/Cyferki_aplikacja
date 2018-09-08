package miniGames.game3Pack;

import java.awt.Frame;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import java.awt.Font;

public class PrzypasowywanieCyferek {
	private JFrame frame;
	private JLabel exit;
	private int ilosc;
	private drawImage []red;
	private int liczba;
	private int obiekty;
	private JTextField tekst;
	/**
	 * Launch the application.
	 * @wbp.parser.entryPoint
	 */
			public void run() {
				try {
					PrzypasowywanieCyferek window = new PrzypasowywanieCyferek();
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
		Random rand = new Random();
		liczba=rand.nextInt(10)+1;
		Random rand3 = new Random();
		obiekty=rand3.nextInt(10-liczba+1)+liczba;
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
		
		
		System.out.println(szerokosc+" "+wysokosc);
		frame.getContentPane().setLayout(null);
		
		JPanel controlPanel = new JPanel();
		controlPanel.setBounds(0, 0, szerokosc, 50);
		controlPanel.setForeground(Color.LIGHT_GRAY);
		frame.getContentPane().add(controlPanel);
		SpringLayout sl_panel = new SpringLayout();
		controlPanel.setLayout(sl_panel);
		
		Image img=new ImageIcon(this.getClass().getResource("/cancel.png")).getImage();
		exit = new JLabel(new ImageIcon(img));
		sl_panel.putConstraint(SpringLayout.EAST, exit, -10, SpringLayout.EAST, controlPanel);
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
		controlPanel.add(exit);

		final JPanel koszyk = new JPanel();
		koszyk.setBounds(szerokosc/2,50,500, 500);
		Random rand2 = new Random();
		int x=5,y=6;
		red=new drawImage[obiekty];
		for(int i=0;i<obiekty;i++)
		{	
		x = rand2.nextInt(200)+1;//-100 minus szerokosc dlugosc obrazka
		y = rand2.nextInt(wysokosc-controlPanel.getHeight()+1-150)+100;
		
		red[i]=new drawImage();
		red[i].draw("1.png",x,y);
		red[i].getPanel(koszyk);
		frame.getContentPane().add(red[i]);
		
		
		
		}
		
		frame.getContentPane().add(koszyk);
		
		final JPanel panel = new JPanel();
		panel.setBounds(0, 0,300, wysokosc-controlPanel.HEIGHT);
		panel.setBackground(new Color(0, 102, 204));
		frame.getContentPane().add(panel);
		
		JButton checkButton = new JButton("Sprawd\u017A");
		checkButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=0;i<obiekty;i++)
				{
					ilosc=ilosc+red[i].getIsOrNot();
				}
				if (ilosc==liczba)
				{
					koniec end=new koniec(true);
					end.start();	
				}
				else
				{
				koniec end=new koniec(false);
				end.start();
				}
				
			}
		});
		checkButton.setBounds(400, 400, 89, 23);
		frame.getContentPane().add(checkButton);
		String polecenie;
		if(liczba>=5)
		{
			polecenie="W³ó¿ do koszyka basi "+liczba+" ¿etonów";
		}
		else
		{
			polecenie="W³ó¿ do koszyka basi "+liczba+" ¿etony";
		}
		tekst = new JTextField(polecenie);
		tekst.setFont(new Font("Arial", Font.PLAIN, 17));
		tekst.setBounds(600, 600, 250, 40);
		frame.getContentPane().add(tekst);
		tekst.setColumns(10);
		
		
		
	}
	}
