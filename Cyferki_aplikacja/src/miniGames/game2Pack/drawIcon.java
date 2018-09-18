package miniGames.game2Pack;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class drawIcon extends JLabel{


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
    		this.setBounds(x-(img.getIconWidth()/2)-15, y, img.getIconWidth(), img.getIconHeight());
	     
    }
    
    	
}


