/**
 * @author Ingebor Rubio 19003, Andres Say 19705
 * @date 22/01/20
 * Hoja de trabajo 1, interfaces
 * Algoritmos y Estructuras de Datos
 */

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class ModelRadio implements RadioInterface{
	
	private boolean onOff;
	private boolean amFm;
	private double frecuenciaAm;
	private double frecuenciaFm;
	double[] favoritosfm = new double[11];
	double[] favoritosam = new double[11];
	
	
	/**
	 * Constructor
	 */
	public ModelRadio() {
		onOff = false;
		amFm = true;
		frecuenciaAm = 530;
		frecuenciaFm = 87.9;
	}
	
	/**
	 * Constructor
	 * @param onOff
	 * @param amFm
	 * @param frecuenciaAm
	 * @param frecuenciaFm
	 */
	public ModelRadio(boolean onOff, boolean amFm, float frecuenciaAm, float frecuenciaFm) {
		this.onOff = onOff;
		this.amFm = amFm;
		this.frecuenciaAm = frecuenciaAm;
		this.frecuenciaFm = frecuenciaFm;
	}
	
	
	
	/*public ModelRadio(ArrayList[] favFrecuenciaAm, ArrayList[] favFrecuenciaFm, ArrayList frec, RadioE rad) {
		super();
		this.favFrecuenciaAm = favFrecuenciaAm;
		this.favFrecuenciaFm = favFrecuenciaFm;
		this.frec = frec;
		this.rad = rad;
	}*/

	/*public ModelRadio() {
		rad = new RadioE();
		//frec = new Frecuencia();
		favFrecuenciaAm = new ArrayList(12);
		favFrecuenciaFm = new Frecuencia[30];
		//listadoFav = new Frecuencia[12];
		
	}*/

	/*public ModelRadio() {
		super();
		
		// TODO Auto-generated constructor stub
	}*/

	/**
	 * 
	 */
	@Override
	public String estacionActual() { //aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaCambiar
		String est = "";
		boolean p = onOff;
		if(p = false) {
			est = "apagado";
		}
		else {
			est = "encendido";
		}
		
		return est;
	}

	/**
	 * Ver el estado de la radio, si esta encendida o apagada
	 */
	@Override
	public boolean estado() {
		boolean est = false;
		boolean p = onOff;
		if(p = false) {
			est = false;
		}
		else {
			est = true;
		}
		
		return est;
	}

	/**
	 * Encender o apagar la radio
	 */
	@Override
	public void onOff() {
		boolean boton = onOff;
		boolean cambiar;
		if(boton == true) {
			cambiar = false;
			onOff=cambiar;
		}
		else if(boton == false) {
			cambiar = true;
			onOff=cambiar;
		}
		
	}

	/**
	 * Avanzar en las emisoras, sumar a la emisora actual
	 */
	@Override
	public void avanzar() {
		System.out.println(amFm+"Esto es al entrar a avanzar");
		boolean hola = amFm;
		if(hola==false) { //Caso en el que la frecuencia sea AM
			if (frecuenciaAm!=1610) {
				float am = (float) frecuenciaAm;
				System.out.println(frecuenciaAm+"Numero antes de sumar");
				float salida = am+10;
				frecuenciaAm=salida;
				System.out.println(frecuenciaAm+"Numero despues de sumar");
			}
			else {
				frecuenciaAm=530;
			}
		}
		else if (amFm==true) { //Caso en el que la frecuencia sea FM
			if (frecuenciaFm!=107.9) {
				System.out.println("Esta entrando a la FM");
				System.out.println(frecuenciaFm+" frecuencia fm actual");
				double fm = frecuenciaFm;
				fm =  (fm + 0.2);
				frecuenciaFm=fm;
				System.out.println(frecuenciaFm+" fm despues de sumar");
			}
			else
				frecuenciaFm=87.9;
		System.out.println(frecuenciaFm);
		}
		
		/*int num = frec.getNum();
		int seguir = num;
		int prueba = num;
		
		if (seguir >= 30) {
			prueba = 1;
			frec.setNum(prueba);
		}
		else {
			prueba += 1;
			frec.setNum(prueba);
		}*/
	}

	/**
	 * guardar una radio
	 * @param int boton, numero del boton presionado
	 */
	@Override
	public void guardar(int boton) {
		if (amFm) { //caso de que sea fm
			double favFm = frecuenciaFm;
			int guardar = boton;
			favoritosfm[guardar] = favFm;
		}
		else if (amFm) { //caso que sea am
			double favAm = frecuenciaAm;
			int guardaram = boton;
			favoritosam[guardaram] = favAm;
		}
		
	}

	/**
	 * Seleccionar un boton y poner la emisora 
	 * @param int boton, numero del boton seleccionado
	 */
	@Override
	public void seleccionarEmisora(int boton) {
		//JOptionPane.showMessageDialog(null, "Mensaje de prueba");
		System.out.println(amFm);
		boolean hola = amFm;
		if (hola==true) { //caso que sea fm
			JOptionPane.showMessageDialog(null, "Mensaje de prueba");

			if(favoritosfm[boton] == 0) {
				JOptionPane.showMessageDialog(null, "No hay una emisora almacenada en este boton");
			}
			else {
				int frecseleccionada = (int) favoritosfm[boton];
				frecuenciaAm =(float) favoritosfm[frecseleccionada];
			}
		}
		else {
			
		}
	}
	public void cambiarFrecuencia() {
		if(amFm==true) {
			amFm=false;
		}
		else
			amFm=true;
		// TODO Auto-generated method stub
		
	}

	public boolean getOnOff() {
		return onOff;
	}

	public void setOnOff(boolean onOff) {
		this.onOff = onOff;
	}

	public boolean getAmFm() {
		return amFm;
	}

	public void setAmFm(boolean amFm) {
		this.amFm = amFm;
	}

	public double getFrecuenciaAm() {
		return frecuenciaAm;
	}

	public void setFrecuenciaAm(double frecuenciaAm) {
		this.frecuenciaAm = frecuenciaAm;
	}

	public double getFrecuenciaFm() {
		return frecuenciaFm;
	}

	public void setFrecuenciaFm(double frecuenciaFm) {
		this.frecuenciaFm = frecuenciaFm;
	}


}
