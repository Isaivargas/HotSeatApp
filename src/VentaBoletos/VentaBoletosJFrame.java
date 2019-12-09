package VentaBoletos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Panel;
import javax.swing.JFrame;



public class VentaBoletosJFrame extends JFrame  {
	PanelAnuncio anuncio     = new PanelAnuncio();
	datosCompraJPanel compra = new datosCompraJPanel();
	backGroundJPanel   logo  = new backGroundJPanel();
	croquisAsientos    sala  = new croquisAsientos ();
	
	private Panel panelPrincipal,panel;
	
	public VentaBoletosJFrame() {
		
	super ("Venta de Boletos HotSeat");	
	
	       panelPrincipal = new Panel();
	       panel = new Panel();
	       
	    
			panel.setBackground(Color.BLACK);
				
			
         
	      // panelPrincipal.add(BorderLayout.NORTH,logo);
		   //panelPrincipal.add(BorderLayout.WEST, anuncio);
		 
		     
			  panelPrincipal.add(BorderLayout.CENTER, sala);
		   add(panelPrincipal);
		   setSize(800, 600);
		   setVisible(true);
		   setDefaultCloseOperation(EXIT_ON_CLOSE);

	 }
	
	
	
	}
