package ejercicio1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ButtonGroup;

public class Ejercicio_JRadioButton extends JFrame {

	private JPanel contentPane;
	
	String[] arregloPreguntas= {"Los humanos brillan en la oscuridad:","La gran muralla china es la unica obra construida por el hombre visible a simple vista desde el espacio:","Los relampagos nunca caen en el mismo lugar:","Los humanos adultos tienen menos huesos que los bebes:","Si cortas una lombriz de tierra por la mitad, las dos partes pueden regenerar su cuerpo:"};
	int ContadorRespuestasCorrectas=0,ContadorCuestionario=0;
	String[] arregloRespuesta1= {"Verdadero","Falso","Falso","Verdadero","Falso"};
	String[] arregloRespuesta2= {"Falso","Verdadero","Verdadero","Falso","Verdadero"};
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable(){
		public void run() {
			try {
			Ejercicio_JRadioButton frame = new Ejercicio_JRadioButton();
					frame.setVisible(true);	
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
});
}


	public Ejercicio_JRadioButton() 
	{
		setTitle("CULTURA GENERAL");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 876, 243);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216, 191, 216));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblPregunta1 = new JLabel("Los humanos brillan en la oscuridad");
		lblPregunta1.setFont(new Font("Bodoni Bd BT", Font.PLAIN, 13));
		lblPregunta1.setBounds(10, 22, 840, 23);
		contentPane.add(lblPregunta1);
		
		JRadioButton rdbVerdadero = new JRadioButton("Verdadero");
		buttonGroup.add(rdbVerdadero);
		rdbVerdadero.setSelected(true);
		rdbVerdadero.setBackground(new Color(216, 191, 216));
		rdbVerdadero.setBounds(6, 54, 109, 23);
		contentPane.add(rdbVerdadero);
		
		JRadioButton rdbFalso = new JRadioButton("Falso");
		buttonGroup.add(rdbFalso);
		rdbFalso.setBackground(new Color(216, 191, 216));
		rdbFalso.setBounds(6, 93, 109, 23);
		contentPane.add(rdbFalso);
		
		JButton btnAnterior = new JButton("<Anterior");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ContadorCuestionario--;
				switch(ContadorCuestionario)
				{
				case 0:
					lblPregunta1.setText(arregloPreguntas[ContadorCuestionario].toString());
					rdbVerdadero.setText(arregloRespuesta1[ContadorCuestionario].toString());
					rdbFalso.setText(arregloRespuesta2[ContadorCuestionario].toString());
					;break;
				case 1:
					lblPregunta1.setText(arregloPreguntas[ContadorCuestionario].toString());
					rdbVerdadero.setText(arregloRespuesta1[ContadorCuestionario].toString());
					rdbFalso.setText(arregloRespuesta2[ContadorCuestionario].toString());
					;break;
				case 2:
					lblPregunta1.setText(arregloPreguntas[ContadorCuestionario].toString());
					rdbVerdadero.setText(arregloRespuesta1[ContadorCuestionario].toString());
					rdbFalso.setText(arregloRespuesta2[ContadorCuestionario].toString());
					;break;
				case 3:
					lblPregunta1.setText(arregloPreguntas[ContadorCuestionario].toString());
					rdbVerdadero.setText(arregloRespuesta1[ContadorCuestionario].toString());
					rdbFalso.setText(arregloRespuesta2[ContadorCuestionario].toString());
					;break;
				case 4:
					lblPregunta1.setText(arregloPreguntas[ContadorCuestionario].toString());
					rdbVerdadero.setText(arregloRespuesta1[ContadorCuestionario].toString());
					rdbFalso.setText(arregloRespuesta2[ContadorCuestionario].toString());
					;break;
				}
			}
		});
		btnAnterior.setBackground(new Color(216, 191, 216));
		btnAnterior.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnAnterior.setBounds(10, 141, 120, 23);
		contentPane.add(btnAnterior);
		
		
		JButton btnsiguiente = new JButton(">Siguiente");
		btnsiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						if (rdbVerdadero.isSelected())
						{
							ContadorRespuestasCorrectas++;
						}
						ContadorCuestionario++;
						switch(ContadorCuestionario)
						{
							case 0:
								lblPregunta1.setText(arregloPreguntas[ContadorCuestionario].toString());
								rdbVerdadero.setText(arregloRespuesta1[ContadorCuestionario].toString());
								rdbFalso.setText(arregloRespuesta2[ContadorCuestionario].toString());
								;break;
							case 1:
								lblPregunta1.setText(arregloPreguntas[ContadorCuestionario].toString());
								rdbVerdadero.setText(arregloRespuesta1[ContadorCuestionario].toString());
								rdbFalso.setText(arregloRespuesta2[ContadorCuestionario].toString());
								;break;
							case 2:
								lblPregunta1.setText(arregloPreguntas[ContadorCuestionario].toString());
								rdbVerdadero.setText(arregloRespuesta1[ContadorCuestionario].toString());
								rdbFalso.setText(arregloRespuesta2[ContadorCuestionario].toString());
								;break;
							case 3:
								lblPregunta1.setText(arregloPreguntas[ContadorCuestionario].toString());
								rdbVerdadero.setText(arregloRespuesta1[ContadorCuestionario].toString());
								rdbFalso.setText(arregloRespuesta2[ContadorCuestionario].toString());
								;break;
							case 4:
								lblPregunta1.setText(arregloPreguntas[ContadorCuestionario].toString());
								rdbVerdadero.setText(arregloRespuesta1[ContadorCuestionario].toString());
								rdbFalso.setText(arregloRespuesta2[ContadorCuestionario].toString());
								;break;
						}
					}
		});
		btnsiguiente.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnsiguiente.setBackground(new Color(216, 191, 216));
		btnsiguiente.setBounds(140, 142, 120, 23);
		contentPane.add(btnsiguiente);
		
		
		
		JButton btnEvaluar = new JButton("Evaluar");
		btnEvaluar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(contentPane,"Su puntuaje es de :  "+ContadorRespuestasCorrectas+ " puntos");;
			}
		});
		
		btnEvaluar.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnEvaluar.setBackground(new Color(216, 191, 216));
		btnEvaluar.setBounds(270, 142, 120, 23);
		contentPane.add(btnEvaluar);
		
		ButtonGroup radRespuestas=new ButtonGroup();
		radRespuestas.add(rdbVerdadero);
		radRespuestas.add(rdbFalso);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnSalir.setBackground(new Color(216, 191, 216));
		btnSalir.setBounds(400, 142, 120, 23);
		contentPane.add(btnSalir);
	}
}
