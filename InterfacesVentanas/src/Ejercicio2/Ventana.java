package Ejercicio2;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ventana extends JFrame{
	private JPanel panel;
	private JLabel etiqueta,imagen;
	private JRadioButton r1,r2,r3,r4;
	
	public Ventana() {
		setSize(700,400);
		setTitle("Ejercicio 2");
		setLocationRelativeTo(null);
		iniciarComponetes();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void iniciarComponetes() {
		panel();
		etiqueta();
		deportes();
	}
	
	private void panel() {
		panel = new JPanel();
		panel.setLayout(null);
		this.add(panel);
	}

	private void etiqueta() {
		etiqueta = new JLabel("Escoja su deporte favorito");
		etiqueta.setBounds(20, 10, 300, 40);
		etiqueta.setFont(new Font("arial",0,18));
		panel.add(etiqueta);
	}
	
	private void deportes() {
		r1 = new JRadioButton();
		r1.setText("Futbol");
		r1.setBounds(20, 80, 100, 40);
		r1.setFont(new Font("arial roundesd nt bold",0,20));
		panel.add(r1);
		
		r2 = new JRadioButton();
		r2.setText("Baloncesto");
		r2.setBounds(20, 140, 150, 40);
		r2.setFont(new Font("arial roundesd nt bold",0,20));
		panel.add(r2);
		
		r3 = new JRadioButton();
		r3.setText("Rugby");
		r3.setBounds(20, 200, 100, 40);
		r3.setFont(new Font("arial roundesd nt bold",0,20));
		panel.add(r3);
		
		r4 = new JRadioButton();
		r4.setText("Natacion");
		r4.setBounds(20, 260, 150, 40);
		r4.setFont(new Font("arial roundesd nt bold",0,20));
		panel.add(r4);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(r1);
		grupo.add(r2);
		grupo.add(r3);
		grupo.add(r4);
		
		eventoAccion();
	}
	
	private void eventoAccion() {
		imagen = new JLabel();
		imagen.setBounds(200, 80, 400, 220);
		panel.add(imagen);
		
		final ImageIcon imagenFutbol = new ImageIcon(getClass().getResource("/Imagenes/futbol.jpg"));
		final ImageIcon imagenBasket = new ImageIcon(getClass().getResource("/Imagenes/basket.jpg"));
		final ImageIcon imagenRugby = new ImageIcon(getClass().getResource("/Imagenes/rugby.jpg"));
		final ImageIcon imagenNata = new ImageIcon(getClass().getResource("/Imagenes/natacion.jpg"));
		
		ActionListener ev1 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				imagen.setIcon(new ImageIcon(imagenFutbol.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
			}	
		};
		
		r1.addActionListener(ev1);
		
		ActionListener ev2 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				imagen.setIcon(new ImageIcon(imagenBasket.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
			}	
		};
		
		r2.addActionListener(ev2);
		
		ActionListener ev3 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				imagen.setIcon(new ImageIcon(imagenRugby.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
			}	
		};
		
		r3.addActionListener(ev3);
		
		ActionListener ev4 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				imagen.setIcon(new ImageIcon(imagenNata.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
			}	
		};
		
		r4.addActionListener(ev4);
	}
}
