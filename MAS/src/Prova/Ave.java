package Prova;

import java.util.ArrayList;

abstract class Ave {

	private String nome;
	private String tipo;
	private int idadeMaxima;
	private ArrayList<Regiao> listaRegioes;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getIdadeMaxima() {
		return idadeMaxima;
	}
	public void setIdadeMaxima(int idadeMaxima) {
		this.idadeMaxima = idadeMaxima;
	}
	public ArrayList<Regiao> getListaRegioes() {
		return listaRegioes;
	}
	public void setListaRegioes(ArrayList<Regiao> listaRegioes) {
		this.listaRegioes = listaRegioes;
	}
	
	
	
}
