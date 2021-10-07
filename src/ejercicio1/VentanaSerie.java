package ejercicio1;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class VentanaSerie extends JFrame {

	private JPanel contentPane;
	private JTextField inpNumero1;
	private JTextField inpNumero2;
	private JTextField inpIteraciones;
	private JTextArea varSerie;

	public static void main(String[] args) {
		
					VentanaSerie frame = new VentanaSerie();
					frame.setVisible(true);
				} 
	
	public VentanaSerie() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 216);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(255, 72, 89, 23);
		contentPane.add(btnSalir);
		
		inpNumero1 = new JTextField();
		inpNumero1.setBounds(149, 11, 86, 20);
		contentPane.add(inpNumero1);
		inpNumero1.setColumns(10);
		
		inpNumero2 = new JTextField();
		inpNumero2.setColumns(10);
		inpNumero2.setBounds(149, 42, 86, 20);
		contentPane.add(inpNumero2);
		
		inpIteraciones = new JTextField();
		inpIteraciones.setColumns(10);
		inpIteraciones.setBounds(149, 73, 86, 20);
		contentPane.add(inpIteraciones);
		
		JLabel lblNumero1 = new JLabel("Numero inicial 1");
		lblNumero1.setBounds(59, 14, 80, 14);
		contentPane.add(lblNumero1);
		
		JLabel lblNumero2 = new JLabel("Numero inicial 2");
		lblNumero2.setBounds(59, 45, 80, 14);
		contentPane.add(lblNumero2);
		
		JLabel lblIteraciones = new JLabel("Iteraciones");
		lblIteraciones.setBounds(59, 76, 80, 14);
		contentPane.add(lblIteraciones);
		
		JButton btnGenerar = new JButton("Generar ");
		btnGenerar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String VarNumero1S = inpNumero1.getText();
				String VarNumero2S = inpNumero2.getText();
				String VarIteraS = inpIteraciones.getText();
				String cadena ="";
				
				int varNumero1I = Integer.parseInt(VarNumero1S);
				int varNumero2I = Integer.parseInt(VarNumero2S);
				int varIteraI = Integer.parseInt(VarIteraS);
				int suma     =0;
				
				cadena = cadena + VarNumero1S + " "+ VarNumero2S;
				
				 for (int x=0; x<=varIteraI ; x++){
				 suma=varNumero1I+varNumero2I;
				 
				 varNumero1I = varNumero2I;
				 varNumero2I = suma;
				 
				// System.out.println(suma);
				 cadena = cadena + " " + suma;
				 
				 }
				 
				 varSerie.setText(cadena);
				
			}
			
		});
		btnGenerar.setBounds(255, 10, 89, 23);
		contentPane.add(btnGenerar);
		
		varSerie = new JTextArea();
		varSerie.setBounds(59, 117, 176, 44);
		contentPane.add(varSerie);
		
		
	}
}
