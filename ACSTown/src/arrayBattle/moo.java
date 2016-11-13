package arrayBattle;
import java.net.*;
import java.util.Set;

import org.jgrapht.*;
import org.jgrapht.graph.*;

public class moo {
	
	    public static void main(String [] args)
	    {
	        UndirectedGraph<String, DefaultEdge> stringGraph = createStringGraph();
	        System.out.println(stringGraph.toString());
	    }

	  
	    private static UndirectedGraph<String, DefaultEdge> createStringGraph()
	    {
	        UndirectedGraph<String, DefaultEdge> g =
	            new SimpleGraph<String, DefaultEdge>(DefaultEdge.class);

	        String v1 = "v1";
	        String v2 = "v2";
	        String v3 = "v3";
	        String v4 = "v4";
	        String v5 = "v5";
	        String v6 = "v6";
	        String v7 = "v7";
	        
	        // add the vertices
	        g.addVertex(v1);
	        g.addVertex(v2);
	        g.addVertex(v3);
	        g.addVertex(v4);
	        g.addVertex(v5);
	        g.addVertex(v6);
	        g.addVertex(v7);
	        

	        // add edges to create a circuit
	        g.addEdge(v1, v2);
	        g.addEdge(v2, v3);
	        g.addEdge(v2, v6);
	        g.addEdge(v3, v4);
	        g.addEdge(v4, v5);
	        g.addEdge(v5, v6);
	        g.addEdge(v6, v7);
	        
	        Set<String> list = g.vertexSet();

	        return g;
	    }
	}
