package VentaBoletos;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class datosCompraJPanel extends JPanel implements ActionListener {

	
	ArrayList<sala> salas = new ArrayList<sala>();

	JButton asientosDisponibles ,costoTotal ,confirmar;
	JTextField textNumMenores ,textNumAdultos,nombreCompleto,telefono,email,numTarjeta,costoMenores,costoAdultos;
   
	private Panel panel;
	private Panel panelSecundario;
	private Panel panelCentral;
	
	@SuppressWarnings("deprecation")
	datosCompraJPanel(){
		
	
	  
		 panel = new Panel(); 
		GridBagLayout layout = new GridBagLayout();
		
		
		GridLayout experimentLayout = new GridLayout(0,2);
		
		
		
		
		panel.setLayout(layout);
		GridBagConstraints gbc = new GridBagConstraints();

		JLabel label1 = new JLabel();
		label1.setText("Menores");
		
		JLabel label2 = new JLabel();
		label2.setText("Adultos");
		
		JLabel label3 = new JLabel();
		label3.setText("    ");
		
		
		
		JLabel label4 = new JLabel();
		label4.setText("Datos del Comprador");
		
		
		
		
		
		
		
		
	
		
		 panelSecundario =new Panel();
		 panelCentral = new Panel();
		 
	   
		textNumMenores = new JTextField(3);
		costoMenores = new JTextField("$. . .");
		textNumAdultos = new JTextField(3);
		costoAdultos = new JTextField("$. . .");
		nombreCompleto = new JTextField(" Nombre Completo ");
		telefono       = new JTextField(" Telefono ");
		email          = new JTextField(" Correo Electronico ");
		numTarjeta     = new JTextField(" Num - Tarjeta");
		
		asientosDisponibles = new JButton("Asientos - Disponibles");
		costoTotal          = new JButton("costoTotal");
		confirmar           = new JButton("confirmar");
		
		
		
		 
		gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(textNumMenores, gbc);
        
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 2;
        gbc.gridy = 1;
        panel.add(label1, gbc);
        
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 5;
        gbc.gridy = 2;
        panel.add(costoTotal, gbc);
        
     
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 3;
        gbc.gridy = 1;
        panel.add(costoMenores, gbc);
         
      
        
  
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(textNumAdultos, gbc);


        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 2;
        gbc.gridy = 3;
        panel.add(label2, gbc);
       		 
	   gbc.fill = GridBagConstraints.HORIZONTAL;
       gbc.gridx = 3;
       gbc.gridy = 3;
       panel.add(costoAdultos, gbc);
       
       
       gbc.fill = GridBagConstraints.HORIZONTAL;
       gbc.gridx = 2;
       gbc.gridy = 4;
       panel.add(asientosDisponibles, gbc);
       
       gbc.fill = GridBagConstraints.HORIZONTAL;
       gbc.gridx = 2;
       gbc.gridy = 5;
       panel.add(label4, gbc);
       
       
       gbc.fill = GridBagConstraints.HORIZONTAL;
       gbc.gridx = 0;
       gbc.gridy = 7;
       panel.add(nombreCompleto, gbc);
       
       gbc.fill = GridBagConstraints.HORIZONTAL;
       gbc.gridx = 0;
       gbc.gridy = 8;
       panel.add(telefono, gbc);
       
       gbc.fill = GridBagConstraints.HORIZONTAL;
       gbc.gridx = 0;
       gbc.gridy = 9;
       panel.add(email, gbc);
       
       gbc.fill = GridBagConstraints.HORIZONTAL;
       gbc.gridx = 0;
       gbc.gridy = 10;
       panel.add(numTarjeta, gbc);
       
       
       gbc.fill = GridBagConstraints.HORIZONTAL;
       gbc.gridx = 2;
       gbc.gridy = 11;
       panel.add(confirmar, gbc);
       
       
       
       
    
		
		
		
		//panel.add(BorderLayout.WEST,asientosDisponibles);

		//panelSecundario.add(BorderLayout.EAST,costoTotal);
	//	panelSecundario.add(BorderLayout.SOUTH,asientosDisponibles);
		
		
		     
		 add(panel);
		 add(panelSecundario);
		  
	       
		
		
		 

           
    
      }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}  
		
		
		
		
		
	
	
	
	
}
