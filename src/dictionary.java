import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class dictionary {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("BIENVENIDO AL DICCIONARIO");
		HashMap<String, String> diccionario = new HashMap<>();
		List<String> list = new ArrayList<>();
		diccionario.put("draw up", "redactar");
		diccionario.put("discouraged", "desanimado");
		diccionario.put("yearly", "anualmente");
		diccionario.put("apiece", "cada uno");
		diccionario.put("Potential", "potencial");
		diccionario.put("chewing gum", "Chicle");
		diccionario.put("earth", "tierra");
		diccionario.put("retreat", "retirada");
		diccionario.put("oil", "aceite");
		diccionario.put("whealth", "riqueza");
		diccionario.put("prayer", "oracion");
		diccionario.put("staple", "grapa");
		diccionario.put("reliability", "confiabilidad");
		diccionario.put("attorney", "abogado");
		diccionario.put("string", "cuerda");
		diccionario.put("importer", "importador");
		diccionario.put("palm tree", "palmera");
		diccionario.put("endurecer", "toughen");
		diccionario.put("reliave", "aliviar");
		diccionario.put("bathrobe", "toalla");
		int contador=0;
		for (String letra: diccionario.keySet()) {
			list.add(letra);
		}

		for (int i = 0; i < 5; i++) {
			int numero = (int) (Math.random()*diccionario.size());
			String palabraIngles=list.get(numero);
			System.out.println("Cual es la traduccion de:"+ palabraIngles);
			String palabra =leer.next();
			if(diccionario.get(palabraIngles).equalsIgnoreCase(palabra)) {
				contador++;
			}
		}
		System.out.println("Su total de aciertos fue de: "+contador + " palabras, las malas fueron:  "+(5-contador));
	}

}
