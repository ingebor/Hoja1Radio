

import java.util.Scanner;
 
public class PrincipalC{
	//Metodo main. Interaccion con usuario y despliegue a pantalla de informacion relacionada al catalogo
	public static void main(String[] args){
		Scanner teclado1 = new Scanner(System.in);		//Scanner para ingresos de tipo String
		Scanner teclado2 = new Scanner(System.in);	    //Scanner para int
		Scanner teclado3 = new Scanner(System.in);
		RadioE rad = new RadioE();
		ModelRadio mod = new ModelRadio();
		System.out.println("-------------------------Bienvenido------------------");
		System.out.println("porfavor llene la informacion del personal de trabajo");
		
		boolean seguir = true;
		
		
		while(seguir) {
			System.out.println("-------------------------Bienvenido------------------");
			System.out.println("1. AM/FM n\2. ver Frecuencia Actual n\3. Guardar frecuencia n\4. Apagar/encender\n5. Salir \n6. probar");
			int opcion = teclado2.nextInt();
			
			if (opcion == 1) {
				System.out.println("----------Seleccione---------");
				System.out.println("1. AM/ 2.FM");
				int amfm = teclado2.nextInt();
				boolean h = false;
				if(amfm == 1) {
					h = false;
				}
				else {
					h = true;
				}
				
				rad.setAmFm(h);
				//clase.set..()
				}
			if(opcion == 2) {
				if(rad.isAmFm() == false) {
					System.out.println(rad.getFrecuenciaAm());
				}
				else if(rad.isAmFm() == true) {
					System.out.println(rad.getFrecuenciaFm());
				}
				
			}
			if(opcion == 3) {
				
				
				
				System.out.println("En esta opcion guardara la frecuencia actual en algunos de los espacios");
				System.out.println("eliga una opcion: 1-2-3-4-5-6-7-8-9-10-11-12");
				int hola = teclado2.nextInt();
				
			}
			if(opcion == 4) {
				System.out.println("1. Apagar 2.Ecender");
			}
			if(opcion == 5) {
				System.out.println("¿Que boton desea presionar?");
				System.out.println("1-2-3-4-5-6-7-8-9-10-11-12");
				int o = teclado2.nextInt();
				
				
			}
			if(opcion == 6) {
				seguir = false;
			}
		}
	}
}
