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
	
	private RadioE rad;
	double[] favoritosfm = new double[11];
	double[] favoritosam = new double[11];
	
	
	public ModelRadio() {
		rad = new RadioE();
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
		boolean p = rad.isOnOff();
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
		boolean p = rad.isOnOff();
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
		boolean boton = rad.isOnOff();
		boolean cambiar;
		if(boton == true) {
			cambiar = false;
			rad.setOnOff(cambiar);
		}
		else if(boton == false) {
			cambiar = true;
			rad.setOnOff(cambiar);
		}
		
	}

	@Override
	public void avanzar() {
		System.out.println(rad.isAmFm()+"Esto es al entrar a avanzar");
		boolean holaa = rad.isAmFm();
		if(holaa==false) { //Caso en el que la frecuencia sea AM
			if (rad.getFrecuenciaAm()!=1610) {
				//rad.setFrecuenciaAm(530);
				double am = rad.getFrecuenciaAm();
				System.out.println(rad.getFrecuenciaAm()+"Numero antes de sumar");
				double salida = am+10;
				rad.setFrecuenciaAm(salida);
				System.out.println(rad.getFrecuenciaAm()+"Numero despues de sumar");
			}
			else {
				rad.setFrecuenciaAm(530);
				System.out.println("No entra a hacer la suma");
			}
		}
		else if (rad.isAmFm()==true) { //Caso en el que la frecuencia sea FM
			if (rad.getFrecuenciaFm()!=107.9) {
				System.out.println("Esta entrando a la FM");
				double fm = rad.getFrecuenciaFm();
				fm =  (fm + 0.2);
				rad.setFrecuenciaFm(fm);
			}
			else
				rad.setFrecuenciaFm(87.9);
		System.out.println(rad.getFrecuenciaAm());
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
		if (rad.isAmFm()) { //caso de que sea fm
			//double[] favoritosfm = new double[11];
			double favFm = rad.getFrecuenciaFm();
			int guardar = boton;
			favoritosfm[guardar] = favFm;
		}
		else if (!rad.isAmFm()) { //caso que sea am
			//double[] favoritosam = new double[11];
			double favAm = rad.getFrecuenciaAm();
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
		System.out.println(rad.isAmFm());
		boolean hola = rad.isAmFm();
		if (hola==true) { //caso que sea fm
			JOptionPane.showMessageDialog(null, "Mensaje de prueba");

			if(favoritosfm[boton] == 0) {
				JOptionPane.showMessageDialog(null, "No hay una emisora almacenada en este boton");
			}
			else {
				int frecseleccionada = (int) favoritosfm[boton];
				rad.setFrecuenciaAm((float) favoritosfm[frecseleccionada]);
			}
		}
		else {
			
		}
	}

}
