package miniGames.game2Pack;


import java.awt.Frame;
import java.awt.Image;
import java.awt.Point;

import javax.swing.JFrame;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JPanel;
import javax.swing.Timer;

import miniGames.game2Pack.drawImage;

import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;


public class SzukanieCyferek{

	private JFrame frame;
	private JLabel exit;
	private drawImage[] image;
	private int numberOfClick=0;
	private int[] memoCardNumbers= {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10};
	private int[] card=new int[2];
	private BufferedImage picture;
	final Timer timer = new Timer(2000, null);
	private int para=0;
	private int pomylka=0;
	
	
	/**
	 * Launch the application.
	 * @wbp.parser.entryPoint
	 */
			public void run() {
				try {
					SzukanieCyferek window = new SzukanieCyferek();
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
		final JLabel store=new JLabel();
		store.setText("Pomy³ki: "+pomylka);
		store.setBounds(szerokosc-200,wysokosc/2, 100, 40);
		frame.getContentPane().add(store);
		
    	try
    	{
    		picture=ImageIO.read(getClass().getResourceAsStream("/memoNone.png"));
    		
    	}catch(IOException e)
    	{
    		e.printStackTrace();
    	}
		
		//shufle the cards
		
		Random rand=new Random();
		for (int i=0; i<memoCardNumbers.length; i++) {
		    int randomPosition = rand.nextInt(memoCardNumbers.length);
		    int temp = memoCardNumbers[i];
		    memoCardNumbers[i] = memoCardNumbers[randomPosition];
		    memoCardNumbers[randomPosition] = temp;
		}
		//show the cards 
		int x=50;
		int y=150;
		
		int h=(((wysokosc-40)/100)+1);
		int w=((szerokosc/100)+1);
		image=new drawImage[20];
		for(int i=1;i<=20;i++)
		{
			image[i-1]=new drawImage();
			image[i-1].draw("memoNone.png", x*2, (y*((i-1)%4))+100);
			image[i-1].setMemoNumber(memoCardNumbers[i-1]);
			image[i-1].addMouseListener(new MouseAdapter() 
	        {
				
				public void mouseExited(MouseEvent e)
				{
		  			if(numberOfClick%2==0 && image[card[0]].getMemoNumber()!=image[card[1]].getMemoNumber())
	    			{
		  				
	    				image[card[0]].draw("memoNone.png",image[card[0]].getX() , image[card[0]].getY());
						image[card[1]].draw("memoNone.png",image[card[1]].getX(), image[card[1]].getY());
	    			}
					
				}
				
	    		public void mouseClicked(MouseEvent e) 
	    		{
	    			
	    			numberOfClick++;
	    			int i=0;
	    			while(e.getSource()!=image[i])
	    			{
	    				i++;				
	    			}
					image[i].setIcon(new ImageIcon(this.getClass().getResource("/memo"+image[i].getMemoNumber()+".png")));
					System.out.println("onclick:"+numberOfClick);
					System.out.println("memo number:"+image[i].getMemoNumber());
					card[numberOfClick%2]=i;
	    			
					System.out.println("id number"+card[numberOfClick%2]);
	    			if(numberOfClick%2==0)
	    			{

	    				if(card[0]!=card[1])
	    				{
	    					if(image[card[0]].getMemoNumber()==image[card[1]].getMemoNumber())
	    					{
	    						System.out.println("dobrze");
	    						image[card[0]].setEnabled(false);
	    						image[card[1]].setEnabled(false);
	    						para++;
	    						if(para==10)
	    						{
	    							System.out.println("koniec");
	    							koniec end=new koniec();
	    							end.start();
	    						}
	    					}
	    					else
	    					{
	    						pomylka++;
	    		  				store.setText("Pomy³ka: "+pomylka);
	    					}
	    					
	    				}
	    				else
	    				{
	    					numberOfClick--;
	    				}
	    			}
	    			
	    			
	    		}
	    		
				public void mouseEntered(MouseEvent e) {
					e.getComponent().setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
	    		
	    		
	    		
	        });
			
			frame.getContentPane().add(image[i-1]);
			
			if(i%4==0)
			{
				x=x+100;	
			}
		}
		}

		
		
		
		
		
	
}
