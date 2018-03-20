package interfaz;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import cajaSobresalto.cajaSobresalto;
import uniandes.cupi2.triangulo.interfaz.PanelBotones;


public class InterfazPrincipal extends JFrame{
	
	public cajaSobresalto caja;
	
	 /**
     * Panel de los botones.
     */
    private PanelBotones panelBotones;
    /**
     * Panel de la gráfica
     */
	private PanelGrafica grafica;
	
	public InterfazPrincipal() {
		setTitle( "Caja de sobresalto" );
        setSize( 600, 490 );
        setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );

        grafica = new PanelGrafica(this, caja.getDatos());
        getContentPane( ).add( grafica, BorderLayout.SOUTH);

        panelBotones = new PanelBotones( this );
        getContentPane( ).add( panelBotones, BorderLayout.WEST );

        getContentPane( ).setLayout( new BorderLayout( ) );

 

        setLocationRelativeTo( null );
        setResizable( false );

        actualizar( );
	}
}
