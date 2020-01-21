import java.awt.List;
import java.util.ArrayList;


public class ModelRadio implements RadioInterface{
	
	private Frecuencia[] listadoFrecuenciaAm;
	private Frecuencia[] listadoFrecuenciaFm;
	private Frecuencia[] listadoFav;
	private Frecuencia frec;
	private RadioE rad;
	
	
	public ModelRadio() {
		rad = new RadioE();
		frec = new Frecuencia();
		listadoFrecuenciaAm = new Frecuencia[30];
		listadoFrecuenciaFm = new Frecuencia[30];
		listadoFav = new Frecuencia[12];
		
	}

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
		int num = frec.getNum();
		int seguir = num;
		int prueba = num;
		
		if (seguir >= 30) {
			prueba = 1;
			frec.setNum(prueba);
		}
		else {
			prueba += 1;
			frec.setNum(prueba);
		}
	}

	@Override
	public void guardar(int boton) {
		int top12 = boton;
		int favEmisora = frec.getNum();
		this.listadoFav[top12] = listadoFav[favEmisora];
	}

	@Override
	public void seleccionarEmisora(int boton) {
		
		
	}

}
