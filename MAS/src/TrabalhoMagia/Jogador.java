package TrabalhoMagia;

import java.util.ArrayList;

public class Jogador {

	private String nome;
	private Magia magia;
	
	
	static ArrayList <Magia> listaMagia;
	
	public Jogador (Magia m3) {
	listaMagia.add(m3);
		

	}
	
	public Jogador (String nome, Magia m1, Magia m2) {
		listaMagia = new ArrayList<Magia>();
		listaMagia.add(m1);
		listaMagia.add(m2);
		this.nome = nome;

	}
	
	void mostrarMagia() {
		System.out.print("Magia: ");
		
		for (Magia i: listaMagia) {
			System.out.print(i.getNomeMagia() + ";");


		}
		
		System.out.println(" ");
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Magia getMagia() {
		return magia;
	}
	//public void setMagia(Magia magia) {
		//this.magia = magia;
	//}

	
	
	
	
}
