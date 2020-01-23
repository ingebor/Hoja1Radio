
public class RadioE {

	private boolean onOff;
	private boolean amFm; //false es AM y true es FM
	private float frecuenciaAm;
	private double frecuenciaFm;
	
	
	public RadioE(boolean onOff, boolean amFm, float frecuenciaAm, double frecuenciaFm) {
		super();
		this.onOff = onOff;
		this.amFm = amFm;
		this.frecuenciaAm = frecuenciaAm;
		this.frecuenciaFm = frecuenciaFm;
	}
	public RadioE() {
		onOff = false;
		amFm = false;
		frecuenciaAm = 530;
		frecuenciaFm = 86.9;
		// TODO Auto-generated constructor stub
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
	public float getFrecuenciaAm() {
		return frecuenciaAm;
	}
	public void setFrecuenciaAm(float frecuenciaAm) {
		this.frecuenciaAm = frecuenciaAm;
	}
	public double getFrecuenciaFm() {
		return frecuenciaFm;
	}
	public void setFrecuenciaFm(double frecuenciaFm) {
		this.frecuenciaFm = frecuenciaFm;
	}
	
	
	
	
}
