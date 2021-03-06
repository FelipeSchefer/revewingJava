package aula;

import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovado;
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if((l1.getCategoria().equals(l2.getCategoria())) && l1 != l2) {
			this.aprovado = true;
			this.desafiado = l1;
			this.desafiante = l2;
		}
		else {
			this.aprovado = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}
	
	public void lutar() {
		if(this.aprovado) {
			System.out.println("## Desafiante ##");
			this.desafiante.apresentacao();
			
			System.out.println("## Desafiado ##");
			this.desafiado.apresentacao();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			
			switch(vencedor) {
				case 0:
					System.out.println("-------------------------------------");
					System.out.println("Empate");
					this.desafiante.empatarLuta();
					this.desafiado.empatarLuta();
					System.out.println("");
					break;
					
				case 1:
					System.out.println("-------------------------------------");
					System.out.println("Vitoria do " + this.desafiante.getNome());
					this.desafiante.ganharLuta();
					this.desafiado.perderLuta();
					System.out.println("");
					break;
					
				case 2:
					System.out.println("-------------------------------------");
					System.out.println("Vitoria do " + this.desafiado.getNome());
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
					System.out.println("");
					break;				
			}
			
		}
		else {
			System.out.println("");
			System.out.println("A luta n?o pode acontecer");
		}
	}

	public Lutador getDesafiado() {
		return desafiado;
	}
	
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}
	
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
	
	
	
}
