package miniGames.game3Pack;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class drawImage extends JComponent{


    /**
	 * 
	 */
	private int IsOrNot=0;
	private static final long serialVersionUID = 1L;
	private BufferedImage img;
	private JComponent panel=new JPanel();
	private JComponent com=this;
	private Point mousePoint;
	
	public int getIsOrNot()
	{
		return IsOrNot;
	}

    public drawImage()
    {
    	initialize();
    }

	public void getJComponent(JComponent panel)
	{
		this.panel=panel;
		
	}
    public void paint (Graphics g)
    {
    	g.drawImage(img, 0, 0, img.getWidth(),img.getHeight(),null);
    }
    
    public void draw(String name, int x,int y)
    {
    	try
    	{
    		img=ImageIO.read(getClass().getResourceAsStream("/"+name));
    	}catch(IOException e)
    	{
    		e.printStackTrace();
    	}
    	this.setBounds(x, y,img.getWidth(),img.getHeight());
    	repaint();
    
   
	     
}
    public void initialize()
    {
        com.addMouseListener(new MouseAdapter() 
        {
    		@Override
    		public void mousePressed(java.awt.event.MouseEvent point) 
    		{
    			mousePoint = point.getPoint();
    		}
    		@Override
    		public void mouseReleased(MouseEvent e) 
    		{
    			
    			Point cornerButon1=new Point(com.getLocation());
    			Point cornerButon2=new Point(com.getLocation().x+com.getWidth(),com.getLocation().y+com.getHeight());
    			Point cornerPanel1=new Point(panel.getLocation());
    			Point cornerPanel2=new Point(panel.getLocation().x+panel.getWidth(),panel.getLocation().y+panel.getHeight());
    			CheckerObjectIsOnPanel pointer=new CheckerObjectIsOnPanel();
    			if(pointer.checkObcject(cornerPanel1, cornerButon1, cornerPanel2, cornerButon2)==true&&IsOrNot==0)
    			{
    				IsOrNot++;

    			}
    			if(pointer.checkObcject(cornerPanel1, cornerButon1, cornerPanel2, cornerButon2)==false&&IsOrNot==1)
    			{
    				IsOrNot--;

    			}
    			System.out.println(IsOrNot);
    		}
    	});
        com.addMouseMotionListener(new MouseMotionAdapter()
        {

    		@Override
    		public void mouseDragged(java.awt.event.MouseEvent evt)
    		{
    			
    			 int thisX = com.getLocation().x;
    		     int thisY = com.getLocation().y;
    	
    		        // Determine how much the mouse moved since the initial click
    		        int xMoved = (thisX + evt.getX()) - (thisX +mousePoint.x);
    		        int yMoved = (thisY + evt.getY()) - (thisY + mousePoint.y);
    	
    		        // Move picture to this position
    		        int X = thisX + xMoved;
    		        int Y = thisY + yMoved;
    		        com.setLocation(X, Y);
    		        com.repaint();
    		        
    		}
        });
        
    	
    }
    	
}


