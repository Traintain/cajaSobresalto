package interfaz;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;


public class PanelBotones extends JPanel implements ActionListener {
	
	/**
     * Constante para cambiar el máximo
     */
    private static final String MAXIMO = "Definir máximo";
 
    /**
     * Constante para cambiar el mínimo
     */
    private static final String MINIMO = "Definir mínimo";
    
    /**
     * Constante para iniciar la toma de datos
     */
    private static final String ON = "Iniciar la medición";
    
    
    /**
     * Constante para guardar los datos
     */
    private static final String SAVE = "Guardar";
    
    /**
     * Ventana principal de la aplicación.
     */
    private InterfazPrincipal principal;
    
    /**
     * Botón máximo
     */
    private JButton btnMax;
    /**
     * Botón mínimo
     */
    private JButton btnMin;
    /**
     * Botón encendido/apagado
     */
    private JButton btnOnOff;
    /**
     * Botón Salvar
     */
    private JButton btnSave;
    /**
     * Etiqueta con el tiempo transcurrido
     */
    private JLabel tiempo;

    public PanelBotones(InterfazPrincipal pPrincipal) {
    	principal=pPrincipal;
    	setLayout(new GridLayout(5, 1));

    	btnMax = new JButton( "Definir máximo" );
    	btnMax.setActionCommand( MAXIMO );
    	btnMax.addActionListener( this );
    	add( btnMax );
    	
    	btnMin = new JButton( "Definir mínimo" );
    	btnMin.setActionCommand( MINIMO );
    	btnMax.addActionListener( this );
    	add( btnMin );
    	
    	btnMax = new JButton( "Iniciar" );
    	btnMax.setActionCommand( MAXIMO );
    	btnMax.addActionListener( this );
    	add( btnMax );
    	
    }
}
