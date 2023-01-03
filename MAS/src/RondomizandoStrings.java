import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RondomizandoStrings {

	public static void main(String[] args) {
		
		
		// randomizar palavras
		/*List<String> participantes = Arrays.asList("Matheus Reis", "Aurelio", "Matheus Barcellos", "Eduarda", "Vinicius", "João");
		Collections.shuffle(participantes);
		System.out.println(participantes);
		
		// randomizar letras
		String nomes = "123456";
		Random gerador = new Random();
		System.out.println(nomes.charAt(gerador.nextInt(nomes.length())));
		*/
		
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Matheus Reis");
		lista.add("Aurelio");
		lista.add("Matheus Barcellos");
		lista.add("Eduarda");
		lista.add("João");
		lista.add("Vinicius");
		
		Collections.shuffle(lista);
		System.out.println(lista);

		
		
		
	}

}
