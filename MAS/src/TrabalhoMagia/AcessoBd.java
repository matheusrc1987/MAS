package TrabalhoMagia;

import java.util.ArrayList;

public class AcessoBd {

	static ArrayList<Magia> listaMagia = new ArrayList<Magia>();
	static ArrayList<Jogador> listaJogador = new ArrayList<Jogador>();
	
	
	public Jogador recuperarJogador() {
		Jogador jogador = new Jogador(null);
		System.out.println("Jogador " + jogador.getNome() + " criado com sucesso");
		return jogador;
	}
	
		
	void salvarBanco (Jogador jogador) {
		System.out.println("Jogador : " + jogador.getNome());
		
		listaJogador.add(jogador);
	}
	
	void salvarMagia (Magia magia) {
		
		
		listaMagia.add(magia);
		
	}
	
	void ListarJogador_Magia() {
		System.out.print("Jogador(es): ");
		for (Jogador i : listaJogador) {
			System.out.print(i.getNome() + ";");
		}
		System.out.println(" ");
		System.out.print("Magia(s): ");
		for (Magia i : listaMagia) {
			System.out.print(i.getNomeMagia() + ";");
		}
	}
	
}
