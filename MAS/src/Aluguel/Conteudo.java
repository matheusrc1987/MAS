package Aluguel;

import java.util.ArrayList;

abstract public class Conteudo {
	private String nome;
	private String descricao;
	protected ArrayList<Ator> atores = new ArrayList<Ator>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	void armazenarAtores(Ator ator) {
		
		atores.add(ator);
	}
	
}
