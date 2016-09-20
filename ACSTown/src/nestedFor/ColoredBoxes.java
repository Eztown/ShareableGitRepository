package nestedFor;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

class ColoredBoxes extends Canvas
{
	public int size;
	public ColoredBoxes(int a)
	{
		setBackground(Color.WHITE);
		setSize(a);
	}
	public void setSize(int a){
		size = a;
	}

	public void paint( Graphics window )
	{
		window.setColor(Color.RED);
		window.setFont(new Font("TAHOMA",Font.BOLD,12));
	  	window.drawString("Graphics Lab Lab11g ", 20, 40 );
	  	window.drawString("Drawing boxes with nested loops ", 20, 80 );

	  	drawBoxes(window);
	}

	public void drawBoxes(Graphics window)
	{
		int R = (int) (Math.random( )*256);
		int G = (int)(Math.random( )*256);
		int B= (int)(Math.random( )*256);
		Color randomColor = new Color(R, G, B);
		
		for(int a = 0; a<size; a++){
			
			for(int b = 0; b<size; b++){
				window.setColor(randomColor);
				window.fillRect((b*30), (a*30)+150, 20, 20);
			}	
		}
	}
}