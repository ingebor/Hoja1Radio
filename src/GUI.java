import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JButton btnEliminar;
	private JButton btnSave;
	private JButton btnAm;
	private JButton btnPlay;
	private JButton btnFm;
	private JButton btnSubirF;
	private JButton btnBajarF;
	private JTextField tfVerCancion;
	private JTextField tfVolumen;
	private JTextField tfCanciones;
	private JTextField tfFavCanciones;
	private JButton btnPlay_1;
	private JButton btnOp1;
	private JButton btnOp2;
	private JButton btnOp3;
	private JButton btnOp4;
	private JButton btnOp5;
	private JButton btnOp6;
	private JButton btnOp7;
	private JButton btnOp8;
	private JButton btnOp9;
	private JButton btnOp10;
	private JButton btnOp11;
	private JButton btnOp12;
	private JButton btnOnOff;
	private JLabel lblFrecActual;
	
	private JTextField txtFrecuencia;

	private ModelRadio mod;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		GUI frame = new GUI();
		frame.setVisible(true);	
	}
	
	
	public GUI() {
		initialize();
		mod = new ModelRadio();
		
	}

	/**
	 * Create the frame.
	 */
	public void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 686, 510);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(224, 255, 255));
		panel.setBorder(new TitledBorder(null, "Maneje el Volumen", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(12, 172, 163, 97);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JSlider sldVol = new JSlider();
		sldVol.setBounds(0, 42, 163, 26);
		panel.add(sldVol);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(224, 255, 255));
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Frecuencia", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(200, 172, 298, 83);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		
		btnAm = new JButton("AM");
		btnAm.setBounds(12, 49, 89, 23);
		oyente prev = new oyente();
		btnAm.addActionListener(prev);
		panel_1.add(btnAm);
		
		btnFm = new JButton("FM");
		btnFm.setBounds(179, 49, 89, 23);
		oyente Fm = new oyente();
		btnFm.addActionListener(Fm);
		panel_1.add(btnFm);
		
		lblFrecActual = new JLabel("AM");
		lblFrecActual.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrecActual.setBounds(109, 13, 56, 16);
		panel_1.add(lblFrecActual);
		
		JLabel lblFrecuenciaActual = new JLabel("Frecuencia Actual");
		lblFrecuenciaActual.setBounds(179, 13, 107, 16);
		panel_1.add(lblFrecuenciaActual);
		oyente bon = new oyente();
		oyente sup = new oyente();
		oyente oy = new oyente();
		oyente oyente6 = new oyente();
		
		JPanel panelListFav = new JPanel();
		panelListFav.setBackground(new Color(224, 255, 255));
		panelListFav.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Frecuencia de radio", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelListFav.setBounds(71, 37, 581, 126);
		contentPane.add(panelListFav);
		panelListFav.setLayout(null);
		oyente oyente5 = new oyente();
		oyente oyente3 = new oyente();
		oyente oyente7 = new oyente();
		
		txtFrecuencia = new JTextField();
		txtFrecuencia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtFrecuencia.setText("530.0");
		txtFrecuencia.setHorizontalAlignment(SwingConstants.CENTER);
		txtFrecuencia.setBounds(34, 23, 510, 90);
		panelListFav.add(txtFrecuencia);
		txtFrecuencia.setColumns(10);
		
		btnSave = new JButton("Guardar");
		btnSave.setBounds(543, 344, 84, 25);
		oyente oyente4 = new oyente();
		btnSave.addActionListener(oyente4);
		contentPane.add(btnSave);
		
		JLabel lblEstado = new JLabel("");
		lblEstado.setBounds(487, 63, 209, 67);
		contentPane.add(lblEstado);
		
		btnSubirF = new JButton("+");
		btnSubirF.setBounds(407, 268, 61, 37);
		oyente subirFrec = new oyente();
		btnSubirF.addActionListener(subirFrec);
		contentPane.add(btnSubirF);
		
		
		btnBajarF = new JButton("-");
		btnBajarF.setBounds(221, 268, 68, 37);
		oyente bajarFrec = new oyente();
		btnBajarF.addActionListener(bajarFrec);
		contentPane.add(btnBajarF);
		
		JLabel lblRadio = new JLabel("Radio");
		lblRadio.setBounds(71, 8, 178, 16);
		contentPane.add(lblRadio);
		
		btnOp1 = new JButton("1");
		btnOp1.setBounds(12, 344, 68, 25);
		oyente op1 = new oyente();
		btnOp1.addActionListener(op1);
		contentPane.add(btnOp1);
		
		btnOp2 = new JButton("2");
		btnOp2.setBounds(92, 344, 68, 25);
		oyente op2 = new oyente();
		btnOp2.addActionListener(op2);
		contentPane.add(btnOp2);
		
		btnOp3 = new JButton("3");
		btnOp3.setBounds(172, 344, 68, 25);
		oyente op3 = new oyente();
		btnOp3.addActionListener(op3);
		contentPane.add(btnOp3);
		
		btnOp4 = new JButton("4");
		btnOp4.setBounds(252, 344, 68, 25);
		oyente op4 = new oyente();
		btnOp4.addActionListener(op4);
		contentPane.add(btnOp4);
		
		btnOp5 = new JButton("5");
		btnOp5.setBounds(332, 344, 68, 25);
		oyente op5 = new oyente();
		btnOp5.addActionListener(op5);
		contentPane.add(btnOp5);
		
		btnOp6 = new JButton("6");
		btnOp6.setBounds(412, 344, 61, 25);
		oyente op6 = new oyente();
		btnOp1.addActionListener(op6);
		contentPane.add(btnOp6);
		
		btnOp7 = new JButton("7");
		btnOp7.setBounds(12, 396, 68, 25);
		oyente op7 = new oyente();
		btnOp7.addActionListener(op7);
		contentPane.add(btnOp7);
		
		btnOp8 = new JButton("8");
		btnOp8.setBounds(92, 396, 70, 25);
		oyente op8 = new oyente();
		btnOp8.addActionListener(op8);
		contentPane.add(btnOp8);
		
		btnOp9 = new JButton("9");
		btnOp9.setBounds(172, 396, 68, 25);
		oyente op9 = new oyente();
		btnOp9.addActionListener(op9);
		contentPane.add(btnOp9);
		
	    btnOp10 = new JButton("10");
		btnOp10.setBounds(252, 396, 68, 25);
		oyente op10 = new oyente();
		btnOp10.addActionListener(op10);
		contentPane.add(btnOp10);
		
		btnOp11 = new JButton("11");
		btnOp11.setBounds(332, 396, 68, 25);
		oyente op11 = new oyente();
		btnOp11.addActionListener(op11);
		contentPane.add(btnOp11);
		
		btnOp12 = new JButton("12");
		btnOp12.setBounds(412, 396, 61, 25);
		oyente op12 = new oyente();
		btnOp12.addActionListener(op12);
		contentPane.add(btnOp12);
		
		btnOnOff = new JButton("On/Off");
		btnOnOff.setBounds(543, 13, 97, 25);
		oyente onOff = new oyente();
		btnOnOff.addActionListener(onOff);
		contentPane.add(btnOnOff);
		
		oyente oyente1 = new oyente();
		oyente oy1 = new oyente();
		
	}
	private class oyente implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == btnSave) {
				JOptionPane.showMessageDialog(null, "este boton deberia de guardar la frecuencia en alguno de los espacios");
			}
			
			if(e.getSource() == btnSubirF) {
				//int estacion = Integer.parseInt(txtFrecuencia.getText());
				if (Double.parseDouble(txtFrecuencia.getText())>=530) {
					Double estacion = Double.parseDouble(txtFrecuencia.getText());
					if (estacion!=1610) {
						estacion+=10;
						txtFrecuencia.setText(String.valueOf(estacion));
					}
					else
						txtFrecuencia.setText(String.valueOf(530.0));
				}
				else if(Double.parseDouble(txtFrecuencia.getText())>=87.9){//107.9
					double estacionFm = Double.parseDouble(txtFrecuencia.getText());
					if(estacionFm!=107.9) {
						estacionFm += 0.2;
						DecimalFormat df = new DecimalFormat("#.00");
						String fm = df.format(estacionFm);
						txtFrecuencia.setText(String.valueOf(fm));
					}
					else
						txtFrecuencia.setText(String.valueOf(87.96));
				}
			}

			
			/**
			 * ir a la emisora anterior
			 */
			if(e.getSource() == btnBajarF) {
				if (Double.parseDouble(txtFrecuencia.getText())>530) {
					Double estacion = Double.parseDouble(txtFrecuencia.getText());
					if (estacion<=1610) {
						estacion-=10;
						txtFrecuencia.setText(String.valueOf(estacion));
					}
				}
				else if(Double.parseDouble(txtFrecuencia.getText())>87.9) {
					double estacionFm = Double.parseDouble(txtFrecuencia.getText());
					if(estacionFm<=107.9) {
						estacionFm -= 0.2;
						DecimalFormat df = new DecimalFormat("#.00");
						String fm = df.format(estacionFm);
						txtFrecuencia.setText(String.valueOf(fm));
					}
				}
			}
			
			/**
			 * Accion para cuando se presione el boton fm
			 */
			if(e.getSource() == btnFm) { //Cuando se presiona el boton para cambiar a FM
				txtFrecuencia.setText("87.9");
				System.out.println("Esto es luego de haber presionado el boton FM");
				lblFrecActual.setText("FM");
			}
			
			/**
			 * Accion para cuando se presione el boton am
			 */
			if(e.getSource() == btnAm) {
				txtFrecuencia.setText("530.0");
				System.out.println("Esto es luego de haber presionado el boton AM");
				lblFrecActual.setText("AM");
			}
			
			/**
			 * Si se presiona el boton 1
			 */
			if(e.getSource() == btnOp1) {
				//mod.seleccionarEmisora(1);
				JOptionPane.showMessageDialog(null, "Este boton pone la frecuencia guardada en el boton 1");
			}
			/**
			 * Si se presiona el boton 2
			 */
			if(e.getSource() == btnOp2) {
				JOptionPane.showMessageDialog(null, "Este boton pone la frecuencia guardada en el boton 2");
			}
			/**
			 * Si se presiona el boton 3
			 */
			if(e.getSource() == btnOp3) {
				JOptionPane.showMessageDialog(null, "Este boton pone la frecuencia guardada en el boton 3");
			}
			/**
			 * Si se presiona el boton 4
			 */
			if(e.getSource() == btnOp4) {
				JOptionPane.showMessageDialog(null, "Este boton pone la frecuencia guardada en el boton 4");
			}
			/**
			 * Si se presiona el boton 5
			 */
			if(e.getSource() == btnOp5) {
				JOptionPane.showMessageDialog(null, "Este boton pone la frecuencia guardada en el boton 5");
			}
			/**
			 * Si se presiona el boton 6
			 */
			if(e.getSource() == btnOp6) {
				JOptionPane.showMessageDialog(null, "Este boton pone la frecuencia guardada en el boton 6");
			}
			/**
			 * Si se presiona el boton 7
			 */
			if(e.getSource() == btnOp7) {
				JOptionPane.showMessageDialog(null, "Este boton pone la frecuencia guardada en el boton 7");
			}
			/**
			 * Si se presiona el boton 8
			 */
			if(e.getSource() == btnOp8) {
				JOptionPane.showMessageDialog(null, "Este boton pone la frecuencia guardada en el boton 8");
			}
			/**
			 * Si se presiona el boton 9
			 */
			if(e.getSource() == btnOp9) {
				JOptionPane.showMessageDialog(null, "Este boton pone la frecuencia guardada en el boton 9");
			}
			/**
			 * Si se presiona el boton 10
			 */
			if(e.getSource() == btnOp10) {
				JOptionPane.showMessageDialog(null, "Este boton pone la frecuencia guardada en el boton 10");
			}
			/**
			 * Si se presiona el boton 11
			 */
			if(e.getSource() == btnOp11) {
				JOptionPane.showMessageDialog(null, "Este boton pone la frecuencia guardada en el boton 11");
			}
			/**
			 * Si se presiona el boton 12
			 */
			if(e.getSource() == btnOp12) {
				JOptionPane.showMessageDialog(null, "Este boton pone la frecuencia guardada en el boton 12");
			}
			
			/**
			 * Encender o apagar radio
			 */
			if(e.getSource()==btnOnOff) {
				mod.onOff();
				if(btnOp1.isEnabled()) {
					btnOp1.setEnabled(false);
					btnOp2.setEnabled(false);
					btnOp4.setEnabled(false);
					btnOp3.setEnabled(false);
					btnOp5.setEnabled(false);
					btnOp6.setEnabled(false);
					btnOp7.setEnabled(false);
					btnOp8.setEnabled(false);
					btnOp9.setEnabled(false);
					btnOp10.setEnabled(false);
					btnOp11.setEnabled(false);
					btnOp12.setEnabled(false);
					btnAm.setEnabled(false);
					btnFm.setEnabled(false);
					btnBajarF.setEnabled(false);
					btnSubirF.setEnabled(false);
					btnSave.setEnabled(false);
				}
				
				else {
					btnOp1.setEnabled(true);
					btnOp2.setEnabled(true);
					btnOp3.setEnabled(true);
					btnOp4.setEnabled(true);
					btnOp5.setEnabled(true);
					btnOp6.setEnabled(true);
					btnOp7.setEnabled(true);
					btnOp8.setEnabled(true);
					btnOp9.setEnabled(true);
					btnOp10.setEnabled(true);
					btnOp11.setEnabled(true);
					btnOp12.setEnabled(true);
					btnBajarF.setEnabled(true);
					btnSubirF.setEnabled(true);
					btnSave.setEnabled(true);
					btnAm.setEnabled(true);
					btnFm.setEnabled(true);
					}	
				
			
				
			}
			
				
			}
			
		}
	}
	
