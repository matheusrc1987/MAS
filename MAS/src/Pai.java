
public class Pai extends Pessoa {

	public Pai(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	void imprimir(String nome) {
		System.out.println(super.nome + " é pai de " +this.nome);
		
	}

}
