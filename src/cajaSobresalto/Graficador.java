package cajaSobresalto;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;
//https://www.youtube.com/watch?v=_RbqU0TBl28
//https://www.java-forums.org/new-java/7995-how-plot-graph-java-given-samples.html

public class Graficador extends JPanel {

	private Queue<Integer> datosQ;
	private int [] datos;
	
	
	final int PAD=20;
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		int w=getWidth();
		int h=getHeight();
		 // Draw ordinate. Constructs and initializes a Line with coordinates (0, 0) -> (0, 0).
        g2d.draw(new Line2D.Double(PAD, PAD, PAD, h-PAD));
        //Dibuje abscisas
        g2d.draw(new Line2D.Double(PAD, h-PAD, w-PAD, h-PAD));
        
        
	}
}
