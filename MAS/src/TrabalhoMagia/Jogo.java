package TrabalhoMagia;

public class Jogo {

	public static void main(String[] args) {
		MagiaEscura ms1 = new MagiaEscura("Haduken");
		MagiadeLuz ml1 = new MagiadeLuz("Stalaktuqem");
		MagiaEspecial me1 = new MagiaEspecial("Fatalit");
		Jogador matheus = new Jogador("Matheus", ms1, ml1);

		//matheus.listaMagia.add(ms1);
		System.out.println(matheus.listaMagia.size());
		
		matheus.mostrarMagia();
		
		AcessoBd b1 = new AcessoBd();
		b1.salvarBanco(matheus);
		b1.salvarMagia(me1);
		b1.salvarMagia(ml1);
		b1.salvarMagia(ms1);
		System.out.println(b1.listaMagia.size());
		System.out.println(b1.listaJogador.size());
		
		b1.ListarJogador_Magia();
	}

}
