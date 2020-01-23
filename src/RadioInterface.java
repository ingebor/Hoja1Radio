/**
 * @author Ingebor Rubio 19003, Andres Say 19705
 * @date 22/01/20
 * Hoja de trabajo 1, interfaces
 * Algoritmos y Estructuras de Datos
 */

public interface RadioInterface {
	public String estacionActual();
	public boolean estado();
	public void onOff();
	public void avanzar();
	public void guardar(int boton);
	public void seleccionarEmisora(int boton);
}
