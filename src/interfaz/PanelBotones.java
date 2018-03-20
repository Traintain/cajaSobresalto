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
     * Constante para cambiar el m�ximo
     */
    private static final String MAXIMO = "Definir m�ximo";
 
    /**
     * Constante para cambiar el m�nimo
     */
    private static final String MINIMO = "Definir m�nimo";
    
    /**
     * Constante para iniciar la toma de datos
     */
    private static final String ON = "Iniciar la medici�n";
    
    
    /**
     * Constante para guardar los datos
     */
    private static final String SAVE = "Guardar";
    
    /**
     * Ventana principal de la aplicaci�n.
     */
    private InterfazPrincipal principal;
    
    /**
     * Bot�n m�ximo
     */
    private JButton btnMax;
    /**
     * Bot�n m�nimo
     */
    private JButton btnMin;
    /**
     * Bot�n encendido/apagado
     */
    private JButton btnOnOff;
    /**
     * Bot�n Salvar
     */
    private JButton btnSave;
    /**
     * Etiqueta con el tiempo transcurrido
     */
    private JLabel tiempo;

    public PanelBotones(InterfazPrincipal pPrincipal) {
    	principal=pPrincipal;
    	setLayout(new GridLayout(5, 1));

    	btnMax = new JButton( "Definir m�ximo" );
    	btnMax.setActionCommand( MAXIMO );
    	btnMax.addActionListener( this );
    	add( btnMax );
    	
    	btnMin = new JButton( "Definir m�nimo" );
    	btnMin.setActionCommand( MINIMO );
    	btnMax.addActionListener( this );
    	add( btnMin );
    	
    	btnMax = new JButton( "Iniciar" );
    	btnMax.setActionCommand( MAXIMO );
    	btnMax.addActionListener( this );
    	add( btnMax );
    	
    }
}
