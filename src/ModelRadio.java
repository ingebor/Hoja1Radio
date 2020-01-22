import java.awt.List;
import java.util.ArrayList;


public class ModelRadio implements RadioInterface{
	
	//private ArrayList[] favFrecuenciaAm;
	//private ArrayList[] favFrecuenciaFm;
	//private ArrayList[] listadoFav;
	//private ArrayList frec;
	//private RadioE rad;
	
	RadioE rad = new RadioE();
	
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
		if(rad.getAmFM()==false) { //Caso en el que la frecuencia sea AM
			if (rad.getFrecuenciaAm()!=1610) {
				rad.setFrecuenciaAm(530);
				float am = rad.getFrecuenciaAm();
				System.out.println(rad.getFrecuenciaAm());
				float salida = am+10;
				rad.setFrecuenciaAm(salida);
				System.out.println(rad.getFrecuenciaAm());
			}
			else
				rad.setFrecuenciaAm(530);
		}
		else { //Caso en el que la frecuencia sea FM
			if (rad.getFrecuenciaFm()!=107.9) {
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
		if (rad.getAmFM()) { //caso de que sea fm
			ArrayList favoritosfm = new ArrayList(12);
			double favFm = rad.getFrecuenciaFm();
			
		}
		ArrayList favoritos = new ArrayList(12);
		int top12 = boton;
		float favEmisora = rad.getFrecuenciaAm();
		//this.listadoFav[top12] = listadoFav[favEmisora];
	}

	@Override
	public void seleccionarEmisora(int boton) {
		
		
	}

}
