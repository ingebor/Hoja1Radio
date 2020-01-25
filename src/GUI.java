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
	
	private double save1;
	private double save2;
	private double save3;
	private double save4;
	private double save5;
	private double save6;
	private double save7;
	private double save8;
	private double save9;
	private double save10;
	private double save11;
	private double save12;
	private double save1Fm;
	private double save2Fm;
	private double save3Fm;
	private double save4Fm;
	private double save5Fm;
	private double save6Fm;
	private double save7Fm;
	private double save8Fm;
	private double save9Fm;
	private double save10Fm;
	private double save11Fm;
	private double save12Fm;

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
		setBounds(100, 100, 686, 586);
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
		oyente oyente4 = new oyente();
		
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
		oyente op1 = new oyente();
		oyente op2 = new oyente();
		oyente op3 = new oyente();
		oyente op4 = new oyente();
		oyente op5 = new oyente();
		oyente op6 = new oyente();
		oyente op7 = new oyente();
		oyente op8 = new oyente();
		oyente op9 = new oyente();
		oyente op10 = new oyente();
		oyente op11 = new oyente();
		oyente op12 = new oyente();
		
		btnOnOff = new JButton("On/Off");
		btnOnOff.setBounds(543, 13, 97, 25);
		oyente onOff = new oyente();
		btnOnOff.addActionListener(onOff);
		contentPane.add(btnOnOff);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(224, 255, 255));
		panel_2.setBounds(71, 389, 537, 107);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		btnOp1 = new JButton("1");
		btnOp1.setBounds(12, 13, 68, 25);
		panel_2.add(btnOp1);
		
		btnOp2 = new JButton("2");
		btnOp2.setBounds(94, 13, 68, 25);
		panel_2.add(btnOp2);
		
		btnOp3 = new JButton("3");
		btnOp3.setBounds(174, 13, 68, 25);
		panel_2.add(btnOp3);
		
		btnOp4 = new JButton("4");
		btnOp4.setBounds(265, 13, 68, 25);
		panel_2.add(btnOp4);
		
		btnOp5 = new JButton("5");
		btnOp5.setBounds(355, 13, 68, 25);
		panel_2.add(btnOp5);
		
		btnOp6 = new JButton("6");
		btnOp6.setBounds(447, 13, 67, 25);
		panel_2.add(btnOp6);
		
		btnOp7 = new JButton("7");
		btnOp7.setBounds(12, 63, 68, 25);
		panel_2.add(btnOp7);
		
		btnOp8 = new JButton("8");
		btnOp8.setBounds(94, 63, 66, 25);
		panel_2.add(btnOp8);
		
		btnOp9 = new JButton("9");
		btnOp9.setBounds(174, 63, 68, 25);
		panel_2.add(btnOp9);
		
	    btnOp10 = new JButton("10");
	    btnOp10.setBounds(265, 63, 68, 25);
	    panel_2.add(btnOp10);
	    
	    btnOp11 = new JButton("11");
	    btnOp11.setBounds(355, 63, 68, 25);
	    panel_2.add(btnOp11);
	    
	    btnOp12 = new JButton("12");
	    btnOp12.setBounds(447, 63, 67, 25);
	    panel_2.add(btnOp12);
	    btnOp12.addActionListener(op12);
	    btnOp11.addActionListener(op11);
	    btnOp10.addActionListener(op10);
		btnOp9.addActionListener(op9);
		btnOp8.addActionListener(op8);
		btnOp7.addActionListener(op7);
		btnOp6.addActionListener(op6);
		btnOp5.addActionListener(op5);
		btnOp4.addActionListener(op4);
		btnOp3.addActionListener(op3);
		btnOp2.addActionListener(op2);
		btnOp1.addActionListener(op1);
		
		oyente oyente1 = new oyente();
		oyente oy1 = new oyente();
		
	}
	
	
	private class oyente implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
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
				String[] opciones = {"Guardar", "Seleccionar"};
				int resultado = JOptionPane.showOptionDialog(null, "Escoger accion que desea realizar", "Opcion a elegir", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
				if(lblFrecActual.getText().equals("AM")) {
					if(resultado==0) {//Guardar
						save1 = Double.parseDouble(txtFrecuencia.getText());
						}
					else if(resultado==1) {//Seleccionar
						if(save1!=0) {
							txtFrecuencia.setText(String.valueOf(save1));
							}
						}
					}
				else if(lblFrecActual.getText().equals("FM")) {
					if(resultado==0) {//Guardar
						save1Fm = Double.parseDouble(txtFrecuencia.getText());
					}
					else if(resultado==1) {//Seleccionar
						if(save1Fm!=0) {
							txtFrecuencia.setText(String.valueOf(save1Fm));
						}
					}
				}
			}
			
			
			/**
			 * Si se presiona el boton 2
			 */
			if(e.getSource() == btnOp2) {
				String[] opciones = {"Guardar", "Seleccionar"};
				int resultado = JOptionPane.showOptionDialog(null, "Escoger accion que desea realizar", "Opcion a elegir", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
				if(lblFrecActual.getText().equals("AM")) {
					if(resultado==0) {//Guardar
						save2 = Double.parseDouble(txtFrecuencia.getText());
						}
					else if(resultado==1) {//Seleccionar
						if(save2!=0) {
							txtFrecuencia.setText(String.valueOf(save2));
							}
						}
					}
				else if(lblFrecActual.getText().equals("FM")) {
					if(resultado==0) {//Guardar
						save2Fm = Double.parseDouble(txtFrecuencia.getText());
					}
					else if(resultado==1) {//Seleccionar
						if(save2Fm!=0) {
							txtFrecuencia.setText(String.valueOf(save2Fm));
						}
					}
				}
			}
			/**
			 * Si se presiona el boton 3
			 */
			if(e.getSource() == btnOp3) {
				String[] opciones = {"Guardar", "Seleccionar"};
				int resultado = JOptionPane.showOptionDialog(null, "Escoger accion que desea realizar", "Opcion a elegir", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
				if(lblFrecActual.getText().equals("AM")) {
					if(resultado==0) {//Guardar
						save3 = Double.parseDouble(txtFrecuencia.getText());
						}
					else if(resultado==1) {//Seleccionar
						if(save3!=0) {
							txtFrecuencia.setText(String.valueOf(save3));
							}
						}
					}
				else if(lblFrecActual.getText().equals("FM")) {
					if(resultado==0) {//Guardar
						save3Fm = Double.parseDouble(txtFrecuencia.getText());
					}
					else if(resultado==1) {//Seleccionar
						if(save3Fm!=0) {
							txtFrecuencia.setText(String.valueOf(save3Fm));
						}
					}
				}
			}
			/**
			 * Si se presiona el boton 4
			 */
			if(e.getSource() == btnOp4) {
				String[] opciones = {"Guardar", "Seleccionar"};
				int resultado = JOptionPane.showOptionDialog(null, "Escoger accion que desea realizar", "Opcion a elegir", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
				if(lblFrecActual.getText().equals("AM")) {
					if(resultado==0) {//Guardar
						save4 = Double.parseDouble(txtFrecuencia.getText());
						}
					else if(resultado==1) {//Seleccionar
						if(save4!=0) {
							txtFrecuencia.setText(String.valueOf(save4));
							}
						}
					}
				else if(lblFrecActual.getText().equals("FM")) {
					if(resultado==0) {//Guardar
						save4Fm = Double.parseDouble(txtFrecuencia.getText());
					}
					else if(resultado==1) {//Seleccionar
						if(save4Fm!=0) {
							txtFrecuencia.setText(String.valueOf(save4Fm));
						}
					}
				}
			}
			/**
			 * Si se presiona el boton 5
			 */
			if(e.getSource() == btnOp5) {
				String[] opciones = {"Guardar", "Seleccionar"};
				int resultado = JOptionPane.showOptionDialog(null, "Escoger accion que desea realizar", "Opcion a elegir", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
				if(lblFrecActual.getText().equals("AM")) {
					if(resultado==0) {//Guardar
						save5 = Double.parseDouble(txtFrecuencia.getText());
						}
					else if(resultado==1) {//Seleccionar
						if(save5!=0) {
							txtFrecuencia.setText(String.valueOf(save5));
							}
						}
					}
				else if(lblFrecActual.getText().equals("FM")) {
					if(resultado==0) {//Guardar
						save5Fm = Double.parseDouble(txtFrecuencia.getText());
					}
					else if(resultado==1) {//Seleccionar
						if(save5Fm!=0) {
							txtFrecuencia.setText(String.valueOf(save5Fm));
						}
					}
				}
			}
			/**
			 * Si se presiona el boton 6
			 */
			if(e.getSource() == btnOp6) {
				String[] opciones = {"Guardar", "Seleccionar"};
				int resultado = JOptionPane.showOptionDialog(null, "Escoger accion que desea realizar", "Opcion a elegir", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
				if(lblFrecActual.getText().equals("AM")) {
					if(resultado==0) {//Guardar
						save6 = Double.parseDouble(txtFrecuencia.getText());
						}
					else if(resultado==1) {//Seleccionar
						if(save6!=0) {
							txtFrecuencia.setText(String.valueOf(save6));
							}
						}
					}
				else if(lblFrecActual.getText().equals("FM")) {
					if(resultado==0) {//Guardar
						save6Fm = Double.parseDouble(txtFrecuencia.getText());
					}
					else if(resultado==1) {//Seleccionar
						if(save6Fm!=0) {
							txtFrecuencia.setText(String.valueOf(save6Fm));
						}
					}
				}
			}
			/**
			 * Si se presiona el boton 7
			 */
			if(e.getSource() == btnOp7) {
				String[] opciones = {"Guardar", "Seleccionar"};
				int resultado = JOptionPane.showOptionDialog(null, "Escoger accion que desea realizar", "Opcion a elegir", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
				if(lblFrecActual.getText().equals("AM")) {
					if(resultado==0) {//Guardar
						save7 = Double.parseDouble(txtFrecuencia.getText());
						}
					else if(resultado==1) {//Seleccionar
						if(save7!=0) {
							txtFrecuencia.setText(String.valueOf(save7));
							}
						}
					}
				else if(lblFrecActual.getText().equals("FM")) {
					if(resultado==0) {//Guardar
						save7Fm = Double.parseDouble(txtFrecuencia.getText());
					}
					else if(resultado==1) {//Seleccionar
						if(save7Fm!=0) {
							txtFrecuencia.setText(String.valueOf(save7Fm));
						}
					}
				}
			}
			/**
			 * Si se presiona el boton 8
			 */
			if(e.getSource() == btnOp8) {
				String[] opciones = {"Guardar", "Seleccionar"};
				int resultado = JOptionPane.showOptionDialog(null, "Escoger accion que desea realizar", "Opcion a elegir", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
				if(lblFrecActual.getText().equals("AM")) {
					if(resultado==0) {//Guardar
						save8 = Double.parseDouble(txtFrecuencia.getText());
						}
					else if(resultado==1) {//Seleccionar
						if(save8!=0) {
							txtFrecuencia.setText(String.valueOf(save8));
							}
						}
					}
				else if(lblFrecActual.getText().equals("FM")) {
					if(resultado==0) {//Guardar
						save8Fm = Double.parseDouble(txtFrecuencia.getText());
					}
					else if(resultado==1) {//Seleccionar
						if(save8Fm!=0) {
							txtFrecuencia.setText(String.valueOf(save8Fm));
						}
					}
				}
			}
			/**
			 * Si se presiona el boton 9
			 */
			if(e.getSource() == btnOp9) {
				String[] opciones = {"Guardar", "Seleccionar"};
				int resultado = JOptionPane.showOptionDialog(null, "Escoger accion que desea realizar", "Opcion a elegir", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
				if(lblFrecActual.getText().equals("AM")) {
					if(resultado==0) {//Guardar
						save9 = Double.parseDouble(txtFrecuencia.getText());
						}
					else if(resultado==1) {//Seleccionar
						if(save9!=0) {
							txtFrecuencia.setText(String.valueOf(save9));
							}
						}
					}
				else if(lblFrecActual.getText().equals("FM")) {
					if(resultado==0) {//Guardar
						save9Fm = Double.parseDouble(txtFrecuencia.getText());
					}
					else if(resultado==1) {//Seleccionar
						if(save9Fm!=0) {
							txtFrecuencia.setText(String.valueOf(save9Fm));
						}
					}
				}
			}
			/**
			 * Si se presiona el boton 10
			 */
			if(e.getSource() == btnOp10) {
				String[] opciones = {"Guardar", "Seleccionar"};
				int resultado = JOptionPane.showOptionDialog(null, "Escoger accion que desea realizar", "Opcion a elegir", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
				if(lblFrecActual.getText().equals("AM")) {
					if(resultado==0) {//Guardar
						save10 = Double.parseDouble(txtFrecuencia.getText());
						}
					else if(resultado==1) {//Seleccionar
						if(save10!=0) {
							txtFrecuencia.setText(String.valueOf(save10));
							}
						}
					}
				else if(lblFrecActual.getText().equals("FM")) {
					if(resultado==0) {//Guardar
						save10Fm = Double.parseDouble(txtFrecuencia.getText());
					}
					else if(resultado==1) {//Seleccionar
						if(save10Fm!=0) {
							txtFrecuencia.setText(String.valueOf(save10Fm));
						}
					}
				}
			}
			/**
			 * Si se presiona el boton 11
			 */
			if(e.getSource() == btnOp11) {
				String[] opciones = {"Guardar", "Seleccionar"};
				int resultado = JOptionPane.showOptionDialog(null, "Escoger accion que desea realizar", "Opcion a elegir", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
				if(lblFrecActual.getText().equals("AM")) {
					if(resultado==0) {//Guardar
						save11 = Double.parseDouble(txtFrecuencia.getText());
						}
					else if(resultado==1) {//Seleccionar
						if(save11!=0) {
							txtFrecuencia.setText(String.valueOf(save11));
							}
						}
					}
				else if(lblFrecActual.getText().equals("FM")) {
					if(resultado==0) {//Guardar
						save11Fm = Double.parseDouble(txtFrecuencia.getText());
					}
					else if(resultado==1) {//Seleccionar
						if(save11Fm!=0) {
							txtFrecuencia.setText(String.valueOf(save11Fm));
						}
					}
				}
			}
			/**
			 * Si se presiona el boton 12
			 */
			if(e.getSource() == btnOp12) {
				String[] opciones = {"Guardar", "Seleccionar"};
				int resultado = JOptionPane.showOptionDialog(null, "Escoger accion que desea realizar", "Opcion a elegir", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
				if(lblFrecActual.getText().equals("AM")) {
					if(resultado==0) {//Guardar
						save12 = Double.parseDouble(txtFrecuencia.getText());
						}
					else if(resultado==1) {//Seleccionar
						if(save12!=0) {
							txtFrecuencia.setText(String.valueOf(save12));
							}
						}
					}
				else if(lblFrecActual.getText().equals("FM")) {
					if(resultado==0) {//Guardar
						save12Fm = Double.parseDouble(txtFrecuencia.getText());
					}
					else if(resultado==1) {//Seleccionar
						if(save12Fm!=0) {
							txtFrecuencia.setText(String.valueOf(save12Fm));
						}
					}
				}
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
					btnAm.setEnabled(true);
					btnFm.setEnabled(true);
					}	
				
			
				
			}
			
				
			}
			
		}
	}
	
	
