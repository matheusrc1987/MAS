package Aluguel;

import java.util.ArrayList;

public class Serie extends Conteudo {
	
	static ArrayList<Episodio> ep1 = new ArrayList<Episodio>();
	
	
	public int getquantEpsodio() {
		
	return this.ep1.size();
	
		
	}

	int getQuanttotalMinutos() {
				
		int tempoTotal = 0;
		
		for(int i = 0; i<ep1.size(); i++) {
			Episodio episodio = ep1.get(i);
			tempoTotal += episodio.getTempoMinutos();
		}
		return tempoTotal;
	}
	
	
}
