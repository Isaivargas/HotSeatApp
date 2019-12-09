package VentaBoletos;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import org.ietf.jgss.GSSName;

public class croquisAsientos extends JPanel implements ActionListener{
	

	private JButton a1, a2, a3, a4, a5, a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19,a20,a21,a22,a23,a24,a25,a26,a27,a28,a29,a30,a31,a32,a33,a34,a35,a36,a37,a38,a39,a40,a45,a42,a41,a43,a44,
	a46,a47,a48,a49,a50,a51,a52,a53,a54,a55,a56,a57,a58,a59,a60,a61,a62,a63,a64,a65,a66,a67,a68;
	private JButton pantalla = new JButton();
	private ImageIcon i1, i2, i3, i4, i5, i6,i7,i8,i9,i10,i11,i12,i13,i14,i15,i16,i17,i18,i19,i20,i21,i22,i23,i24,i25,i26,i27,i28,i29,i30,i31,i32,i33,i34,i35,i36,i37,i38,i39,i40,i41,i42,i43,i44,i45
	,i46,i47,i48,i49,i50,i51,i52,i53,i54,i55,i56,i57,i58,i59,i60,i61,i62,i63,i64,i65,i66,i67,i68;
	private Scrollbar scrollbar;
	
	Panel panel = new Panel();
	
      String disponibilidad ;
	
	
	public croquisAsientos( ) {
	
		
		
		
		a1 = new JButton();
		i1 = new ImageIcon("caliente.png");
		i1.setDescription("caliente.png");
		a1.setIcon(i1);
	
		
		
		a2 = new JButton(new ImageIcon());
		i2 = new ImageIcon("caliente.png");
		a2.setIcon(i2);
		
		a3 = new JButton(new ImageIcon());
		i3 = new ImageIcon("caliente.png");
		a3.setIcon(i3);
		
		a4 = new JButton(new ImageIcon());
		i4 = new ImageIcon("caliente.png");
		a4.setIcon(i4);
		
		a5 = new JButton(new ImageIcon());
		i5 = new ImageIcon("caliente.png");
		a5.setIcon(i5);
		
		a6 = new JButton(new ImageIcon());
		i6= new ImageIcon("caliente.png");
		a6.setIcon(i6);
		
		a7 = new JButton(new ImageIcon());
		i7= new ImageIcon("caliente.png");
		a7.setIcon(i7);
		
		a8 = new JButton(new ImageIcon());
		i8= new ImageIcon("caliente.png");
		a8.setIcon(i8);
		
		a9 = new JButton(new ImageIcon());
		i9= new ImageIcon("caliente.png");
		a9.setIcon(i9);
		
		a10 = new JButton(new ImageIcon());
		i10= new ImageIcon("caliente.png");
		a10.setIcon(i10);
		
		a11 = new JButton(new ImageIcon());
		i11= new ImageIcon("caliente.png");
		a11.setIcon(i11);
		
		a12 = new JButton(new ImageIcon());
		i12= new ImageIcon("caliente.png");
		a12.setIcon(i12);
		
		a13 = new JButton(new ImageIcon());
		i13= new ImageIcon("caliente.png");
		a13.setIcon(i13);
		
		a14 = new JButton(new ImageIcon());
		i14= new ImageIcon("caliente.png");
		a14.setIcon(i14);
		
		a15 = new JButton(new ImageIcon());
		i15= new ImageIcon("caliente.png");
		a15.setIcon(i15);
		
		a16 = new JButton(new ImageIcon());
		i16= new ImageIcon("caliente.png");
		a16.setIcon(i16);
		
		a17 = new JButton(new ImageIcon());
		i17= new ImageIcon("caliente.png");
		a17.setIcon(i17);
		
		a18 = new JButton(new ImageIcon());
		i18= new ImageIcon("caliente.png");
		a18.setIcon(i18);
		
		a19 = new JButton(new ImageIcon());
		i19= new ImageIcon("caliente.png");
		a19.setIcon(i19);
		
		a20 = new JButton(new ImageIcon());
		i20= new ImageIcon("caliente.png");
		a20.setIcon(i20);
		
		a21 = new JButton(new ImageIcon());
		i21= new ImageIcon("caliente.png");
		a21.setIcon(i21);
		
		a22 = new JButton(new ImageIcon());
		i22= new ImageIcon("caliente.png");
		a22.setIcon(i22);
		
		a23 = new JButton(new ImageIcon());
		i23= new ImageIcon("caliente.png");
		a23.setIcon(i23);
		
		a24 = new JButton(new ImageIcon());
		i24= new ImageIcon("caliente.png");
		a24.setIcon(i24);
		
		a25 = new JButton(new ImageIcon());
		i25= new ImageIcon("caliente.png");
		a25.setIcon(i25);
		
		a26 = new JButton(new ImageIcon());
		i26= new ImageIcon("caliente.png");
		a26.setIcon(i26);
		
		a27 = new JButton(new ImageIcon());
		i27= new ImageIcon("caliente.png");
		a27.setIcon(i27);
		
		a28 = new JButton(new ImageIcon());
		i28= new ImageIcon("caliente.png");
		a28.setIcon(i28);
		
		a29 = new JButton(new ImageIcon());
		i29= new ImageIcon("caliente.png");
		a29.setIcon(i29);
		
		a30 = new JButton(new ImageIcon());
		i30= new ImageIcon("caliente.png");
		a30.setIcon(i30);
		
		a31 = new JButton(new ImageIcon());
		i31= new ImageIcon("caliente.png");
		a31.setIcon(i31);
		
		a32 = new JButton(new ImageIcon());
		i32= new ImageIcon("caliente.png");
		a32.setIcon(i32);
		
		a33 = new JButton(new ImageIcon());
		i33= new ImageIcon("caliente.png");
		a33.setIcon(i33);
		
		a34 = new JButton(new ImageIcon());
		i34= new ImageIcon("caliente.png");
		a34.setIcon(i34);
		
		a35 = new JButton(new ImageIcon());
		i35= new ImageIcon("caliente.png");
		a35.setIcon(i35);
		
		a36 = new JButton(new ImageIcon());
		i36= new ImageIcon("caliente.png");
		a36.setIcon(i36);
		
		a37 = new JButton(new ImageIcon());
		i37= new ImageIcon("caliente.png");
		a37.setIcon(i37);
		
		a38 = new JButton(new ImageIcon());
		i38= new ImageIcon("caliente.png");
		a38.setIcon(i38);
		
		a39 = new JButton(new ImageIcon());
		i39= new ImageIcon("caliente.png");
		a39.setIcon(i39);
		
		a40 = new JButton(new ImageIcon());
		i40= new ImageIcon("caliente.png");
		a40.setIcon(i40);
		
		a41 = new JButton(new ImageIcon());
		i41= new ImageIcon("caliente.png");
		a41.setIcon(i41);
		
		a42 = new JButton(new ImageIcon());
		i42= new ImageIcon("caliente.png");
		a42.setIcon(i42);
		
		a43 = new JButton(new ImageIcon());
		i43= new ImageIcon("caliente.png");
		a43.setIcon(i43);
		
		a44 = new JButton(new ImageIcon());
		i44= new ImageIcon("caliente.png");
		a44.setIcon(i44);
		
		a45 = new JButton(new ImageIcon());
		i45= new ImageIcon("caliente.png");
		a45.setIcon(i45);
		
		a46 = new JButton(new ImageIcon());
		i46= new ImageIcon("caliente.png");
		a46.setIcon(i46);
		
		a47 = new JButton(new ImageIcon());
		i47= new ImageIcon("caliente.png");
		a47.setIcon(i47);
		
		a48 = new JButton(new ImageIcon());
		i48= new ImageIcon("caliente.png");
		a48.setIcon(i48);
		
		a49 = new JButton(new ImageIcon());
		i49= new ImageIcon("caliente.png");
		a49.setIcon(i49);
		
		a50 = new JButton(new ImageIcon());
		i50= new ImageIcon("caliente.png");
		a50.setIcon(i50);
		
		a51 = new JButton(new ImageIcon());
		i51= new ImageIcon("caliente.png");
		a51.setIcon(i51);
		
		a52 = new JButton(new ImageIcon());
		i52= new ImageIcon("caliente.png");
		a52.setIcon(i52);
		
		a53 = new JButton(new ImageIcon());
		i53= new ImageIcon("caliente.png");
		a53.setIcon(i53);
		
		a54 = new JButton(new ImageIcon());
		i54= new ImageIcon("caliente.png");
		a54.setIcon(i54);
		
		a55 = new JButton(new ImageIcon());
		i55= new ImageIcon("caliente.png");
		a55.setIcon(i55);
		
		a56 = new JButton(new ImageIcon());
		i56= new ImageIcon("caliente.png");
		a56.setIcon(i56);
		
		a57 = new JButton(new ImageIcon());
		i57= new ImageIcon("caliente.png");
		a57.setIcon(i57);
		
		a58 = new JButton(new ImageIcon());
		i58= new ImageIcon("caliente.png");
		a58.setIcon(i58);
		
		a59 = new JButton(new ImageIcon());
		i59= new ImageIcon("caliente.png");
		a59.setIcon(i59);
		
		a60 = new JButton(new ImageIcon());
		i60= new ImageIcon("caliente.png");
		a60.setIcon(i60);
		
		a61 = new JButton(new ImageIcon());
		i61= new ImageIcon("caliente.png");
		a61.setIcon(i61);
		
		a62 = new JButton(new ImageIcon());
		i62= new ImageIcon("caliente.png");
		a62.setIcon(i62);
		
		a63 = new JButton(new ImageIcon());
		i63= new ImageIcon("caliente.png");
		a63.setIcon(i63);
		
		a64 = new JButton(new ImageIcon());
		i64= new ImageIcon("caliente.png");
		a64.setIcon(i64);
		
		a65 = new JButton(new ImageIcon());
		i65= new ImageIcon("caliente.png");
		a65.setIcon(i65);
		
		a66 = new JButton(new ImageIcon());
		i66= new ImageIcon("caliente.png");
		a66.setIcon(i66);
		
		
		a67 = new JButton(new ImageIcon());
		i67= new ImageIcon("caliente.png");
		a67.setIcon(i67);
		
		a68 = new JButton(new ImageIcon());
		i68= new ImageIcon("caliente.png");
		a68.setIcon(i68);
		
 
		
			
		
		this.setLayout(new GridLayout(6,0, 1, 1));
		
		add(a1);
		add(a2);
		add(a3);
		add(a4);
		add(a5);
		add(a6);
		add(a7);
		add(a8);
		add(a9);
		add(a10);
		add(a11);
		add(a12);
		add(a13);
		add(a14);
		add(a15);
		add(a16);
		add(a17);
		add(a18);
		add(a19);
		add(a20);
		add(a21);
		add(a22);
		add(a23);
		add(a24);
		add(a25);
		add(a26);
		add(a27);
		add(a28);
		add(a29);
		add(a30);
		add(a31);
		add(a32);
		add(a33);
		add(a34);
		add(a35);
		add(a36);
		add(a37);
		add(a38);
		add(a39);
		add(a40);
		add(a41);
		add(a42);
		add(a43);
		add(a44);
		add(a45);
		add(a46);
		add(a47);
		add(a48);
		add(a49);
		add(a50);
		add(a51);
		add(a52);
		add(a53);
		add(a54);
		add(a55);
		add(a56);
		add(a57);
		add(a58);
		add(a59);
		add(a60);
		add(a61);
		add(a62);
		add(a63);
		add(a64);
		add(a65);
		add(a66);
		
	    
		
		//scrollbar = new Scrollbar(Scrollbar.VERTICAL, 0, 1, 0, 800);
		//setLayout(new FlowLayout());
		//add(scrollbar);
		
		//this.add(BorderLayout.CENTER, peliculasPanel);
		//this.add(BorderLayout.EAST, scrollPanel);
		
		this.paintComponents(getGraphics());

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	

}
