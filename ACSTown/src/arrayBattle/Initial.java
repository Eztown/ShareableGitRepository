package arrayBattle;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Initial extends JFrame{

		public Initial()
		{
			super("Graphics Runner");

			getContentPane().add(new Runner());
			
			setSize(600,600);

			setVisible(true);

			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

		public static void main( String args[] )
		{
			Initial run = new Initial();
		}
}
