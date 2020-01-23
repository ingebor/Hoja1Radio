import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class ModelRadio implements RadioInterface{
	
	//private ArrayList[] favFrecuenciaAm;
	//private ArrayList[] favFrecuenciaFm;
	//private ArrayList[] listadoFav;
	//private ArrayList frec;
	//private RadioE rad;
	
	private RadioE radio;
	
	private RadioE rad;
	double[] favoritosfm = new double[11];
	double[] favoritosam = new double[11];
	
	

	public ModelRadio() {
		radio = new RadioE();
	}
	
	public RadioE getRadio() {
		return radio;
	}

	public void setRadio(RadioE radio) {
		this.radio = radio;
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


	@Override
	public String estacionActual() { //aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaCambiar
		String est = "";
		boolean p = radio.getOnOff();
		if(p = false) {
			est = "apagado";
		}
		else {
			est = "encendido";
		}
		
		return est;
	}

	@Override
	public boolean estado() {
		boolean est = false;
		boolean p = radio.getOnOff();
		if(p = false) {
			est = false;
		}
		else {
			est = true;
		}
		
		return est;
	}

	@Override
	public void onOff() {
		boolean boton = radio.getOnOff();
		boolean cambiar;
		if(boton == true) {
			cambiar = false;
			radio.setOnOff(cambiar);
		}
		else if(boton == false) {
			cambiar = true;
			radio.setOnOff(cambiar);
		}
		
	}

	@Override
	public void avanzar() {
		System.out.println(radio.getAmFm()+"Esto es al entrar a avanzar");
		boolean hola = radio.getAmFm();
		System.out.println(hola+" *********************************");
		if(hola==false) { //Caso en el que la frecuencia sea AM
			if (radio.getFrecuenciaAm()!=1610) {
				//rad.setFrecuenciaAm(530);
				float am = (float) radio.getFrecuenciaAm();
				System.out.println(radio.getFrecuenciaAm()+"Numero antes de sumar");
				float salida = am+10;
				radio.setFrecuenciaAm(salida);
				System.out.println(radio.getFrecuenciaAm()+"Numero despues de sumar");
		System.out.println(rad.getAmFm()+"Esto es al entrar a avanzar");
			}
			else {
				radio.setFrecuenciaAm(530);
				System.out.println("No entra a hacer la suma");
			}
		}
		else if (radio.getAmFm()==true) { //Caso en el que la frecuencia sea FM
			if (rad.getFrecuenciaFm()!=107.9) {
				System.out.println("Esta entrando a la FM");
				System.out.println(radio.getFrecuenciaFm()+" frecuencia fm actual");
				double fm = radio.getFrecuenciaFm();
				fm =  (fm + 0.2);
				radio.setFrecuenciaFm(fm);
				System.out.println(radio.getFrecuenciaFm()+" fm despues de sumar");
			}
			else
				radio.setFrecuenciaFm(87.9);
		System.out.println(radio.getFrecuenciaFm());
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

	@Override
	public void guardar(int boton) {
		if (radio.getAmFm()) { //caso de que sea fm
			//double[] favoritosfm = new double[11];
			double favFm = radio.getFrecuenciaFm();
			int guardar = boton;
			favoritosfm[guardar] = favFm;
		}
		else if (!radio.getAmFm()) { //caso que sea am
			//double[] favoritosam = new double[11];
			double favAm = radio.getFrecuenciaAm();
			int guardaram = boton;
			favoritosam[guardaram] = favAm;
		}
		//ArrayList favoritos = new ArrayList(12);
		//int top12 = boton;
		//float favEmisora = rad.getFrecuenciaAm();
		//this.listadoFav[top12] = listadoFav[favEmisora];
	}

	@Override
	public void seleccionarEmisora(int boton) {
		//JOptionPane.showMessageDialog(null, "Mensaje de prueba");
		System.out.println(radio.getAmFm());
		boolean hola = radio.getAmFm();
		if (hola==true) { //caso que sea fm
			JOptionPane.showMessageDialog(null, "Mensaje de prueba");

			if(favoritosfm[boton] == 0) {
				JOptionPane.showMessageDialog(null, "No hay una emisora almacenada en este boton");
			}
			else {
				int frecseleccionada = (int) favoritosfm[boton];
				radio.setFrecuenciaAm((float) favoritosfm[frecseleccionada]);
			}
		}
		else {
			
		}
	}

}
