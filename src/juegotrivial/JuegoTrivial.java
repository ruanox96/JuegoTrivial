package juegotrivial;

import javax.swing.JOptionPane;

public class JuegoTrivial {

	public static void main(String[] args) {
		System.out.println("\r\n"
				+ "      _                    __ _                    _____             _               _               _    \r\n"
				+ "   _ | |  _  _     ___    / _` |   ___      o O O |_   _|    _ _    (_)    __ __    (_)    __ _     | |   \r\n"
				+ "  | || | | +| |   / -_)   \\__, |  / _ \\    o        | |     | '_|   | |    \\ V /    | |   / _` |    | |   \r\n"
				+ "  _\\__/   \\_,_|   \\___|   |___/   \\___/   TS__[O]  _|_|_   _|_|_   _|_|_   _\\_/_   _|_|_  \\__,_|   _|_|_  \r\n"
				+ "_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| {======|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| \r\n"
				+ "\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'./o--000'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-' \r\n"
				+ "");
		System.out.println("BIENVENIDO AL TRIVIAL, VAMOS A PONER A PRUEBA TUS CONOCIMIENTOS GENERALES, CADA RESPUESTA BUENA TE DA 1 PUNTO \n"
				+ "CADA RESPUESTA FALLADA TE QUITA 1 PUNTO, SOLO PUEDES PERMITIRTE FALLAR 2 PARA GANAR, MUCHA SUERTE :D");
		int cont=0;
		String pregunta1;
		//1
		pregunta1 = JOptionPane.showInputDialog("� Qui�n fue el primer presidente de la democracia espa�ola tras el franquismo?");
		if (pregunta1.equalsIgnoreCase("Adolfo Suarez")) {
			System.out.println("Respuesta correcta");
			cont++;
		} else {
			System.out.println("Respuesta incorrecta");
			if (cont != 0) {
				cont--;
			}
		}
		System.out.println("Ahora mismo tienes: " + cont + " puntos");
		//2
		pregunta1 = JOptionPane.showInputDialog("�En qu� a�o el hombre pis� la Luna por primera vez?");
		if (pregunta1.equalsIgnoreCase("1969")) {
			System.out.println("Respuesta correcta");
			cont++;
		} else {
			System.out.println("Respuesta incorrecta");
			if (cont != 0) {
				cont--;
			}
		}
		System.out.println("Ahora mismo tienes: " + cont + " puntos");
		//3
		pregunta1 = JOptionPane.showInputDialog(" �A partir de qu� suceso consideramos que termina la Edad Antigua y empieza la Edad Media?");
		if (pregunta1.equalsIgnoreCase("la caida del Imperio Romano de Occidente") || pregunta1.equalsIgnoreCase("caida del Imperio Romano de Occidente")) {
			System.out.println("Respuesta correcta");
			cont++;
		} else {
			System.out.println("Respuesta incorrecta");
			if (cont != 0) {
				cont--;
			}
		}
		System.out.println("Ahora mismo tienes: " + cont + " puntos");
		//4
		pregunta1 = JOptionPane.showInputDialog(" �Qui�n fue el primer presidente de Estados Unidos?");
		if (pregunta1.equalsIgnoreCase("George Washington")) {
			System.out.println("Respuesta correcta");
			cont++;
		} else {
			System.out.println("Respuesta incorrecta");
			if (cont != 0) {
				cont--;
			}
		}
		System.out.println("Ahora mismo tienes: " + cont + " puntos");
		//5
		pregunta1 = JOptionPane.showInputDialog(" �Cu�ntos a�os dur� la Guerra de los Cien A�os?");
		if (pregunta1.equalsIgnoreCase("116")) {
			System.out.println("Respuesta correcta");
			cont++;
		} else {
			System.out.println("Respuesta incorrecta");
			if (cont != 0) {
				cont--;
			}
		}
		System.out.println("Ahora mismo tienes: " + cont + " puntos");
		//6
		pregunta1 = JOptionPane.showInputDialog(" �En qu� a�o se cre� la Organizaci�n de las Naciones Unidas?");
		if (pregunta1.equalsIgnoreCase("1945")) {
			System.out.println("Respuesta correcta");
			cont++;
		} else {
			System.out.println("Respuesta incorrecta");
			if (cont != 0) {
				cont--;
			}
		}
		System.out.println("Ahora mismo tienes: " + cont + " puntos");
		//7
		pregunta1 = JOptionPane.showInputDialog("  �Qu� carabela no volvi� del viaje en el que Col�n arrib� a Am�rica por primera vez?");
		if (pregunta1.equalsIgnoreCase("la santa maria") || pregunta1.equalsIgnoreCase("santa maria")) {
			System.out.println("Respuesta correcta");
			cont++;
		} else {
			System.out.println("Respuesta incorrecta");
			if (cont != 0) {
				cont--;
			}
		}
		System.out.println("Ahora mismo tienes: " + cont + " puntos");
		//8
		pregunta1 = JOptionPane.showInputDialog(" �C�mo se apellidaban los dos exploradores que dieron la primera vuelta al mundo?");
		if (pregunta1.equalsIgnoreCase("Magallanes-Elcano")) {
			System.out.println("Respuesta correcta");
			cont++;
		} else {
			System.out.println("Respuesta incorrecta");
			if (cont != 0) {
				cont--;
			}
		}
		System.out.println("Ahora mismo tienes: " + cont + " puntos");
		//9
		pregunta1 = JOptionPane.showInputDialog(" �Qu� isla sirvi� de prisi�n para Napole�n tras su derrota en la batalla de Waterloo?");
		if (pregunta1.equalsIgnoreCase("La isla de Santa Elena") || pregunta1.equalsIgnoreCase("isla de Santa Elena")) {
			System.out.println("Respuesta correcta");
			cont++;
		} else {
			System.out.println("Respuesta incorrecta");
			if (cont != 0) {
				cont--;
			}
		}
		System.out.println("Ahora mismo tienes: " + cont + " puntos");
		//10
		pregunta1 = JOptionPane.showInputDialog("�En qu� idioma est�n escritos los manuscritos m�s antiguos pertenecientes a la parte de la Biblia que hoy conocemos como Nuevo Testamento?");
		if (pregunta1.equalsIgnoreCase("griego") || pregunta1.equalsIgnoreCase("griego antiguo")) {
			System.out.println("Respuesta correcta");
			cont++;
		} else {
			System.out.println("Respuesta incorrecta");
			if (cont != 0) {
				cont--;
			}
		}
		System.out.println("Ahora mismo tienes: " + cont + " puntos");
		
		if (cont >= 7) {
			System.out.println("Enhorabuena, tienes 7 puntos o mas, has ganado el juego");
		} else {
			System.out.println("Lo siento, tienes menos de 7 puntos, has perdido el juego");
		}

	}


}
