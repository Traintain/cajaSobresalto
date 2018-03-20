package interfaz;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import javax.swing.JPanel;
//https://www.youtube.com/watch?v=_RbqU0TBl28
//https://www.java-forums.org/new-java/7995-how-plot-graph-java-given-samples.html

import cajaSobresalto.Queue;

public class PanelGrafica extends JPanel {

	private InterfazPrincipal principal;
	
	private ArrayList<Integer> datosArray;
	private int [] datos;
	
	final int nDatos=20;
	
	public PanelGrafica(InterfazPrincipal nPrinipal, ArrayList<Integer> nDatos) {
		principal=nPrinipal;
	//	datosArray=new ArrayList<>();
		datosArray=nDatos;
		setBackground(Color.WHITE);
	}
	
	protected void paintComponent(Graphics pLienzo){
		
		super.paintComponent(pLienzo);
		Graphics2D g2d = (Graphics2D) pLienzo;
		
		g2d.setColor(Color.BLACK);
		
		int ancho=getWidth();
		int alto=getHeight();
		
		//Dibuja el eje del tiempo
		g2d.drawLine(0, alto-20, ancho, alto-20);
		//Dibuja el eje del movimiento de la caja
		g2d.drawLine(20, 0, 20, alto);        
        
		//Dibuja los puntos
		int tamDatos=datosArray.size();
		int espacioEntreDatos=(ancho-25)/tamDatos;
		int alturaBase=(alto-20)/principal.caja.getRangoDatos();
		int j=0;
		int min=principal.caja.getMin();
		//Saco primero el dato más reciente
		for(int i=tamDatos-1;i>=0;i--) {
			//En la primera iteración debería darme el dato más reciente
			int valor=datosArray.get(i);
			g2d.drawString("."+valor, 25+j*espacioEntreDatos, (alto-20)-((valor-min)*espacioEntreDatos));
		}
	}
}
