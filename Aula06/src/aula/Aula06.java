package aula;
public class Aula06 {
	public static void main(String[] args) {
		ControleRemote controle = new ControleRemote();
		
		controle.ligar();
		controle.abrirMenu();
		controle.ligarMudo();
		controle.desligarMudo();
		controle.play();
		controle.pause();
		
		controle.desligar();
		controle.abrirMenu();


	}
}
