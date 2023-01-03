import java.util.Date;

import javax.xml.crypto.Data;

abstract public class Pessoa {

	protected String nome;
	protected String cpf;
	protected String rg;
	public Date nascimento;
	public Pessoa (String nome){
		
	}
	
	abstract void imprimir(String nome);
		
	


	
	
}
