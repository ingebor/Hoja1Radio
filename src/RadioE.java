
public class RadioE {
	private boolean onOff;
	private boolean amFm;
	private double frecuenciaAm;
	private double frecuenciaFm;

	public RadioE() {
		onOff = false;
		amFm = true;
		frecuenciaAm = 530;
		frecuenciaFm = 1100;
	}
	
	public RadioE(boolean onOff, boolean amFm, float frecuenciaAm, float frecuenciaFm) {
		this.onOff = onOff;
		this.amFm = amFm;
		this.frecuenciaAm = frecuenciaAm;
		this.frecuenciaFm = frecuenciaFm;
	}

	/**
	 * @return the onOff
	 */
	public boolean getOnOff() {
		return onOff;
	}

	/**
	 * @param onOff the onOff to set
	 */
	public void setOnOff(boolean onOff) {
		this.onOff = onOff;
	}

	/**
	 * @return the amFm
	 */
	public boolean getAmFm() {
		return amFm;
	}

	/**
	 * @param amFm the amFm to set
	 */
	public void setAmFm(boolean amFm) {
		this.amFm = amFm;
	}

	/**
	 * @return the frecuenciaAm
	 */
	public double getFrecuenciaAm() {
		return frecuenciaAm;
	}

	/**
	 * @param frecuenciaAm the frecuenciaAm to set
	 */
	public void setFrecuenciaAm(double frecuenciaAm) {
		this.frecuenciaAm = frecuenciaAm;
	}

	/**
	 * @return the frecuenciaFm
	 */
	public double getFrecuenciaFm() {
		return frecuenciaFm;
	}

	/**
	 * @param frecuenciaFm the frecuenciaFm to set
	 */
	public void setFrecuenciaFm(double frecuenciaFm) {
		this.frecuenciaFm = frecuenciaFm;
	}

	@Override
	public String toString() {
		return "RadioE [onOff=" + onOff + ", amFm=" + amFm + ", frecuenciaAm=" + frecuenciaAm + ", frecuenciaFm="
				+ frecuenciaFm + "]";
	}

	
}
