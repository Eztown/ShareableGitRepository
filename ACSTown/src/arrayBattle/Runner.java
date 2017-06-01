package arrayBattle;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Window;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.jgrapht.UndirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

import java.awt.Color;
import java.awt.Canvas;

public class Runner extends Canvas{
	
	UndirectedGraph<Location, DefaultEdge> map = new SimpleGraph<Location, DefaultEdge>(DefaultEdge.class);
	BufferedImage img;
	Resolver resolve;
	boolean game = true;
	
	public Runner(){
		 try{
		    	img = ImageIO.read(new File("euro.jpg"));
		    }
		    catch(Exception e){
		    	System.out.println("Image load fail");
		    }
		
	    setBackground(Color.WHITE);   	
	}
	public void paint(Graphics w){
		w.drawImage(img, 0, 0, null);
		for(Location l:map.vertexSet()){
			w.setColor(Color.BLUE);
			w.fillRect((int)l.getLocX(), (int)l.getLocY(), 10, 10);
			map.getAllEdges(l, l);
		}	
	}
}
