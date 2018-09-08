package miniGames.game3Pack;

import java.awt.Point;


public class CheckerObjectIsOnPanel {
	
	private boolean IsIn=false;
	
	public boolean getIsIn()
	{
	return IsIn;	
	}
	
	
	public boolean checkObcject(Point panel1,Point buton1,Point panel2, Point buton2)
	{
		if(buton1.x > panel1.x && buton1.y > panel1.y)
		{
			if(buton2.x < panel2.x && buton2.y < panel2.y)
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}
		else
		{
			return false;
		}
		
		
		
	}

}
