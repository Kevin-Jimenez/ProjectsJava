package Interfaces;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicButtonListener;

public class Ventana extends JFrame {
	public Ventana() {
		setSize(500,500);//tama?o
		setTitle("Primera Ventana");
		//setLocation(400,150);Para que cuando se ejecute abra lla ventana donde yo quiera
		//setBounds(400,150,500,500);// Hace el setSize y setLocation juntos
		setLocationRelativeTo(null);//Aparece la ventana en el centro de la pantalla
		setResizable(false);//Estable ci cambia de tam?o o no
		setMinimumSize(new Dimension(200,200));//tama?o minimo
		//this.getContentPane().setBackground(Color.DARK_GRAY);//color de ventana
		iniciarComponentes();
		setDefaultCloseOperation(EXIT_ON_CLOSE);// para que al dar click en la x se deje de ejecutar el programa
	}
	//se crea un panel sobre la ventana para poder poner componentes
	private void iniciarComponentes() {
		JPanel panel = new JPanel();//creacacion de panel
		panel.setLayout(null);
		panel.setBackground(Color.darkGray);
		this.getContentPane().add(panel);//se agrega panel
		
		JLabel etiqueta = new JLabel();//etiqueta de texto
		etiqueta.setText("Kevin's Bank");
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);//Alinear el texto
		etiqueta.setForeground(Color.white);//color de la letra
		//etiqueta.setBackground(Color.black);//Background al texto
		//etiqueta.setOpaque(true);//permiso para poder camvbiar el background del texto
		etiqueta.setBounds(85,10,300,80);
		etiqueta.setFont(new Font("cooper black",2,40));//Fuente de letra
		panel.add(etiqueta);
		
		//etiqueta tipo iamgen
		ImageIcon imagen = new ImageIcon("javacode.jpg");
		JLabel etiqueta2 = new JLabel(imagen);
		etiqueta2.setBounds(150,80,180,30);
		etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(),etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
		panel.add(etiqueta2);
		
		//Botones -1.Texto
		JButton boton1 = new JButton();
		boton1.setText("Iniciar Sesion");
		boton1.setFont(new Font("cooper black",2,10));
		boton1.setForeground(Color.black);//color de fuente
		//boton1.setEnabled();true or false
		boton1.setBounds(150, 120, 180, 20);
		boton1.setMnemonic('a');//Alt + letar que yo ponga es un click
		panel.add(boton1);	
		//Botones -2.Imagen
		JButton boton2 = new JButton();
		boton2.setBackground(Color.blue);
		//boton1.setEnabled();true or false
		boton2.setBounds(150, 150, 180, 50);
		ImageIcon click = new ImageIcon("boton.jpg");//seleccionamios imagen
		boton2.setIcon(new ImageIcon(click.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));//ponerla en el boton
		boton2.setMnemonic('a');//Alt + letar que yo ponga es un click
		panel.add(boton2);
		
		// botones3 3.radio botones
		JRadioButton radio1 = new JRadioButton("Option 1",true);
		radio1.setBounds(5,5, 100, 50);
		panel.add(radio1);
		
		JRadioButton radio2 = new JRadioButton("Option 2",false);
		radio2.setBounds(5,50, 100, 50);
		panel.add(radio2);
		
		JRadioButton radio3 = new JRadioButton("Option 3",false);
		radio3.setBounds(5,100, 100, 50);
		panel.add(radio3);
		//Se crea un grupo
		ButtonGroup grupobotones = new ButtonGroup();
		grupobotones.add(radio1);
		grupobotones.add(radio2);
		grupobotones.add(radio3);
		
		//Cajas de texto
		JTextField text = new JTextField();
		text.setBounds(300, 5, 100, 20);
		text.setText("Hola Kevin");
		System.out.print("Texto: "+text.getText());
		panel.add(text);
		
		//contrase?a
		JPasswordField contrasena = new JPasswordField();
		contrasena.setBounds(200,300,150,20);
		contrasena.setText("Kevin123");
		panel.add(contrasena);
		///Obtener contrase?a 
		String pas = " ";
		for (int i =0;i < contrasena.getPassword().length;i++) {
			pas += contrasena.getPassword()[i];
		}
		System.out.println("Contrase?a: " + pas);
		
		//AREAS DE TEXTO
		JTextArea areaT = new JTextArea();
		areaT.setBounds(5, 160, 140, 80);
		areaT.setEditable(true);
		//areaT.setText("Texto");
		panel.add(areaT);
		
		//Combobox
		String [] paises = {"Colombia","Argentina","Uruguay","Barcelona"};
		JComboBox listd = new JComboBox(paises);
		listd.addItem("Brasil");//A?adir
		listd.setSelectedItem("Uruguay");//para seleccionar cual aparazca al inicio
		listd.setBounds(350, 65, 100, 40);
		panel.add(listd);
		
		//EJERCICIO EVENTO
		JTextField textEje = new JTextField();
		textEje.setBounds(20, 270, 200, 20);
		panel.add(textEje);
		
		JLabel EtiEje = new JLabel();
		EtiEje.setText("Inserte un texto");
		EtiEje.setHorizontalAlignment(SwingConstants.CENTER);
		EtiEje.setForeground(Color.white);
		EtiEje.setBounds(5,215,150,80);
		EtiEje.setFont(new Font("cooper black",2,15));
		panel.add(EtiEje);
		
		JButton botEje = new JButton();
		botEje.setText("?Click Aqui!");
		botEje.setBounds(20, 295, 100, 20);
		panel.add(botEje);
		
		JLabel saludo = new JLabel();
		saludo.setBounds(20, 315, 100, 20);
		saludo.setFont(new Font("cooper black",1,15));
		saludo.setForeground(Color.white);
		panel.add(saludo);
		//Accionistener
		ActionListener oyentedeAccion = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				saludo.setText("Hola "+textEje.getText());
			}
		};
		botEje.addActionListener(oyentedeAccion);
		
		//MouseListener
		MouseListener mouse = new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent me) {// se ejecuta cuando se haga click
				areaT.append("mouseClicked\n");
			}
			@Override
			public void mousePressed(MouseEvent me) {// se ejecuta solo cuando se presione 
				areaT.append("mousePressed\n");
			}
			@Override
			public void mouseReleased(MouseEvent me) {
				areaT.append("mouseReleased\n");
			}
			@Override
			public void mouseEntered(MouseEvent me) {//funciona como un hover buton
				areaT.append("mouseEntered\n");
				botEje.setBounds((int) (Math.random()*10), (int) (Math.random()*10), 100, 20);//Ejemplo del si o no
			}
			@Override
			public void mouseExited(MouseEvent me) {//Siempre que se quirte el mause del boton sin presionar
				areaT.append("mouseExited\n");
				
			}
		};
		botEje.addMouseListener(mouse);
		
		//Eventos teclado
		KeyListener teclado = new KeyListener() {
			@Override
			public void keyTyped(KeyEvent ke) {//Solo se ejecuta cuando se presiona alguna letra,numero o simbolo
				areaT.append("KeyTyped\n");
			}
			public void keyPressed(KeyEvent ke) {// se ejecuta siempre que se presione cualquier tecla
				areaT.append("KeyPresed\n");		
			}
			public void keyReleased(KeyEvent ke) {//Se ejecuta siempre que presione y suelte cualquier tecla
				areaT.append("KeyReleased\n");
			}
		};
		textEje.addKeyListener(teclado);
	}

}
