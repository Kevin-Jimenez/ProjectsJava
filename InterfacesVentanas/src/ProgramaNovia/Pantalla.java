package ProgramaNovia;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Pantalla  extends JFrame{
	public JPanel panel;
	public Pantalla() {
		setSize(500,500);
		setTitle("¿Quieres ser mi novia?");
		setLocationRelativeTo(null);
		setResizable(false);
		setMinimumSize(new Dimension(350,350));
		componetentes();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void componetentes() {
		panel();
		etiqueta();
		imagen();
		boton1();
		boton2();
		
	}
	
	private void panel() {
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.darkGray);
		this.getContentPane().add(panel);
	}
	
	private void etiqueta() {
		JLabel etiqueta = new JLabel();
		etiqueta.setText("¿Quieres ser mi novia?");
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta.setBounds(100, 50, 290, 60);
		etiqueta.setFont(new Font("cooper black",2,25));
		etiqueta.setForeground(Color.white);
		panel.add(etiqueta);
	}
	
	private void imagen() {
		ImageIcon imagen = new ImageIcon("pareja.jpg");
		JLabel etiqueta2 = new JLabel(imagen);
		etiqueta2.setBounds(200, 120, 85, 85);
		etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
		panel.add(etiqueta2);
	}
	
	private void boton1() {
		JButton boton1 = new JButton();
		boton1.setBounds(150, 250, 80, 55);
		boton1.setText("SI");
		boton1.setFont(new Font("cooper black",0,20));
		boton1.setForeground(Color.black);
		panel.add(boton1);
		MouseListener mouse = new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(boton1, "Te Amo, Sabia que dirias que si");
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		};
		boton1.addMouseListener(mouse);
		
		
	}
	private void boton2() {
		JButton boton2 = new JButton();
		boton2.setBounds(250, 250, 80, 55);
		boton2.setText("NO");
		boton2.setFont(new Font("cooper black",0,20));
		boton2.setForeground(Color.black);
		panel.add(boton2);
		
		MouseListener mouse = new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				boton2.setBounds((int) (Math.random()*panel.getWidth()), (int) (Math.random()*panel.getHeight()), 80, 55);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				boton2.setBounds((int) (Math.random()*panel.getWidth()), (int) (Math.random()*panel.getHeight()), 80, 55);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				boton2.setBounds((int) (Math.random()*panel.getWidth()), (int) (Math.random()*panel.getHeight()), 80, 55);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				boton2.setBounds((int) (Math.random()*panel.getWidth()), (int) (Math.random()*panel.getHeight()), 80, 55);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				boton2.setBounds((int) (Math.random()*panel.getWidth()), (int) (Math.random()*panel.getHeight()), 80, 55);
				
			}
			
		};
		boton2.addMouseListener(mouse);
		
		
	}
	
	

}
