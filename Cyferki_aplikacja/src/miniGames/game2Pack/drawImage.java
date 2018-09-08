package miniGames.game2Pack;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.management.timer.Timer;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class drawImage extends JLabel{


	/**
	 * 
	 */
	private int memoNumber;
	private static final long serialVersionUID = 1L;
	private ImageIcon img;
	
	public void setMemoNumber(int number)
	{
		this.memoNumber=number;
	}
	
	public int getMemoNumber()
	{
		return memoNumber;
	}
    
    public void draw(String name, int x,int y)
    {
    		img=new ImageIcon(this.getClass().getResource("/"+name));
    		this.setIcon(img);
    		this.setBounds(x, y, img.getIconWidth(), img.getIconHeight());
	     
    }
    	
}


