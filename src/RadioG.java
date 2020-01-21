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
import java.awt.event.ActionEvent;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class RadioG extends JFrame {

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
	private int n1 = 0,n2 = 1,n3 = 2,n4 = 3,n5 = 4,n6 = 5,n7 = 6,n8 = 7,n9 = 8,n10 =9, n11 = 10, n12 = 11, n13 = 12, n14 = 13, n15 = 14, n16 = 15, n17 = 16, n18 = 17, n19 = 18, n20 = 19;
	private String c1 = "Yellow" ,c2 = "paradise", c3 = "hello", c4 = "sound of silence", c5 = "need you now", c6 = "Stars", c7 = "touch", c8 = "heartless", c9 = "dinamic", c10 = "to you";
	private String c11 = "Yellow" ,c12 = "paradise",c13 = "why?", c14 = "hello", c15 = "sound of silence", c16 = "need you now", c17 = "Stars", c18 = "touch", c19 = "heartless", c20 = "dinamic";
	
	
	ModelRadio mod = new ModelRadio();
	RadioE ip = new RadioE();
	private JTextField textField;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioG frame = new RadioG();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RadioG() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 755, 510);
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
		
		textField = new JTextField();
		textField.setBounds(34, 23, 510, 90);
		panelListFav.add(textField);
		textField.setColumns(10);
		
		btnSave = new JButton("save");
		btnSave.setBounds(612, 195, 84, 25);
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
		btnOp1.setBounds(0, 335, 68, 25);
		oyente op1 = new oyente();
		btnOp1.addActionListener(op1);
		contentPane.add(btnOp1);
		
		btnOp2 = new JButton("2");
		btnOp2.setBounds(107, 335, 68, 25);
		oyente op2 = new oyente();
		btnOp2.addActionListener(op2);
		contentPane.add(btnOp2);
		
		btnOp3 = new JButton("3");
		btnOp3.setBounds(232, 335, 68, 25);
		oyente op3 = new oyente();
		btnOp3.addActionListener(op3);
		contentPane.add(btnOp3);
		
		btnOp4 = new JButton("4");
		btnOp4.setBounds(358, 335, 68, 25);
		oyente op4 = new oyente();
		btnOp4.addActionListener(op4);
		contentPane.add(btnOp4);
		
		btnOp5 = new JButton("5");
		btnOp5.setBounds(483, 335, 68, 25);
		oyente op5 = new oyente();
		btnOp5.addActionListener(op5);
		contentPane.add(btnOp5);
		
		btnOp6 = new JButton("6");
		btnOp6.setBounds(610, 335, 61, 25);
		oyente op6 = new oyente();
		btnOp1.addActionListener(op6);
		contentPane.add(btnOp6);
		
		btnOp7 = new JButton("7");
		btnOp7.setBounds(0, 373, 68, 25);
		oyente op7 = new oyente();
		btnOp7.addActionListener(op7);
		contentPane.add(btnOp7);
		
		btnOp8 = new JButton("8");
		btnOp8.setBounds(107, 373, 70, 25);
		oyente op8 = new oyente();
		btnOp8.addActionListener(op8);
		contentPane.add(btnOp8);
		
		btnOp9 = new JButton("9");
		btnOp9.setBounds(232, 373, 68, 25);
		oyente op9 = new oyente();
		btnOp9.addActionListener(op9);
		contentPane.add(btnOp9);
		
	    btnOp10 = new JButton("10");
		btnOp10.setBounds(358, 373, 68, 25);
		oyente op10 = new oyente();
		btnOp10.addActionListener(op10);
		contentPane.add(btnOp10);
		
		btnOp11 = new JButton("11");
		btnOp11.setBounds(483, 373, 68, 25);
		oyente op11 = new oyente();
		btnOp11.addActionListener(op11);
		contentPane.add(btnOp11);
		
		btnOp12 = new JButton("12");
		btnOp12.setBounds(610, 373, 61, 25);
		oyente op12 = new oyente();
		btnOp12.addActionListener(op12);
		contentPane.add(btnOp12);
		
		btnOnOff = new JButton("On/Off");
		btnOnOff.setBounds(612, 13, 97, 25);
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
				JOptionPane.showMessageDialog(null, "Este boton deberia de subir la frecuencia");
			}
			if(e.getSource() == btnBajarF) {
				JOptionPane.showMessageDialog(null, "Este boton deberia de bajar la frecuencia");
			}
			
			if(e.getSource() == btnFm) {
				JOptionPane.showMessageDialog(null, "Este boton deberia de cambiar de frecuencia AM a FM o quedarse en FM");
			}
			if(e.getSource() == btnAm) {
				JOptionPane.showMessageDialog(null, "este boton cambia la frecuencia a AM o la deja en AM");
			}
			
			if(e.getSource() == btnOp1) {
				JOptionPane.showMessageDialog(null, "Este boton pone la frecuencia guardada en el boton 1");
			}
			if(e.getSource() == btnOp2) {
				JOptionPane.showMessageDialog(null, "Este boton pone la frecuencia guardada en el boton 2");
			}
			if(e.getSource() == btnOp3) {
				JOptionPane.showMessageDialog(null, "Este boton pone la frecuencia guardada en el boton 3");
			}
			if(e.getSource() == btnOp4) {
				JOptionPane.showMessageDialog(null, "Este boton pone la frecuencia guardada en el boton 4");
			}
			if(e.getSource() == btnOp5) {
				JOptionPane.showMessageDialog(null, "Este boton pone la frecuencia guardada en el boton 5");
			}
			if(e.getSource() == btnOp6) {
				JOptionPane.showMessageDialog(null, "Este boton pone la frecuencia guardada en el boton 6");
			}
			if(e.getSource() == btnOp7) {
				JOptionPane.showMessageDialog(null, "Este boton pone la frecuencia guardada en el boton 7");
			}
			if(e.getSource() == btnOp8) {
				JOptionPane.showMessageDialog(null, "Este boton pone la frecuencia guardada en el boton 8");
			}
			if(e.getSource() == btnOp9) {
				JOptionPane.showMessageDialog(null, "Este boton pone la frecuencia guardada en el boton 9");
			}
			if(e.getSource() == btnOp10) {
				JOptionPane.showMessageDialog(null, "Este boton pone la frecuencia guardada en el boton 10");
			}
			if(e.getSource() == btnOp11) {
				JOptionPane.showMessageDialog(null, "Este boton pone la frecuencia guardada en el boton 11");
			}
			if(e.getSource() == btnOp12) {
				JOptionPane.showMessageDialog(null, "Este boton pone la frecuencia guardada en el boton 12");
			}
			
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
	
