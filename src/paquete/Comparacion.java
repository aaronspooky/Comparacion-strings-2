package paquete;

public class Comparacion {

	public static void main(String[] args) {
		
		//Metodo startsWith() - Inicio de cadena, endsWith() - Final de cadena
		String ft = new String("Felicidades");
		if(ft.startsWith("Fel")){
			System.out.println("Cadena "+ft+ " comienza por \"fel\"");
		}
		
		//Metodo replace() - String replace(char,char)
		String cad = "El prueblo del valle";
		System.out.println(cad.replace(' ', '#'));
		//Se sustituye todo caracter ' ' por #
	}

}
