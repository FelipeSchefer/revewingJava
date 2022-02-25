package aula;
public class ControleRemote implements Controlador{
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	public ControleRemote() {
		this.volume = 5;
		this.ligado = false;
		this.tocando = false;
	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean isLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean isTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	@Override
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);		
	}

	@Override
	public void abrirMenu() {
		if(this.isLigado()) {
			System.out.println("");
			System.out.println("[# ---- MENU ---- #]");
			System.out.println("Esta ligado: " + this.isLigado()); 
			System.out.println("Volume: " + this.getVolume());
			System.out.println("Esta tocando: " + this.isTocando());
			
			for(int i = 0; i != this.getVolume(); i++) {
				System.out.print("[#]");
			}
			System.out.println("");
		}
		
	}

	@Override
	public void fecharMenu() {
		System.out.println("Esta fechado");
		
	}

	@Override
	public void maisVolume() {
		if(this.isLigado()) {
			this.setVolume(this.getVolume() + 1);
			this.abrirMenu();
		}
		
	}

	@Override
	public void menosVolume() {
		if(this.isLigado()) {
			this.setVolume(this.getVolume() - 1);
			this.abrirMenu();
		}
		
	}
	

	@Override
	public void ligarMudo() {
		if(this.isLigado() && this.getVolume() > 0) {
			this.setVolume(0);
			this.abrirMenu();
		}
		
	}

	@Override
	public void desligarMudo() {
		if(this.isLigado() && this.getVolume() == 0) {
			this.setVolume(5);
			this.abrirMenu();
		}
		
	}

	@Override
	public void play() {
		if(!(this.isTocando()) && this.isLigado()) {
			this.setTocando(true);
			System.out.println("Esta tocando: " + this.isTocando());
		}
		else {
			System.out.println("Não consegui reproduzir");
		}
	}

	@Override
	public void pause() {
		if(this.isTocando() && this.isLigado()) {
			this.setTocando(false);
			System.out.println("Esta pausado: " + this.isTocando());
		}
		else {
			System.out.println("Nao consegui pausar");
		}
		
	}
	
	
	
	
}