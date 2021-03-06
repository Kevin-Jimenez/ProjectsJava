package Ejercicio1;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{
	private JPanel panel;
	private JLabel etiqueta;
	private JButton boton;
	private int count = 0;
	public Ventana() {
		this.setSize(400,400);
		setLocationRelativeTo(null);
		setTitle("Ejercicio 1");
		setResizable(false);
		iniciarComponentes();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void iniciarComponentes() {
		panel();
		etiqueta();
		boton();
	}
	
	private void panel() {
		panel = new JPanel();
		panel.setLayout(null);
		this.add(panel);
	}
	
	private void etiqueta() {
		etiqueta = new JLabel();
		etiqueta.setBounds(0, 50, 400, 40);
		etiqueta.setText("Pulsa el boton");
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta.setFont(new Font("arial",0,20));
		panel.add(etiqueta);
	}
	
	private void boton() {
		boton = new JButton();
		boton.setBounds(90, 250, 200, 50);
		boton.setText("Pulsa aqui");
		boton.setFont(new Font("cooper black",0,20));
		panel.add(boton);
		
		eventoAccion();
	}
	
	private void eventoAccion() {
		ActionListener eventoAccion = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				count++;
				if(count == 1) {
					etiqueta.setText("Has precionado el boton 1 vez");
				}else {
					etiqueta.setText("Has precionado el boton "+count+" veces");
				}
			}
		};
		
		boton.addActionListener(eventoAccion);
	}
	
	

}
