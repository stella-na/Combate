package combate;

import java.util.Random;

public class Luta {
	//Atributos
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	//M�todos P�blicos
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		}else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}		
	}
	public void lutar() {
		if (this.aprovada) {
			System.out.println("--- Desafiado ---");
			this.desafiado.apresentar();
			System.out.println("--- Desafiante ---");
			this.desafiante.apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			
			switch(vencedor) {
				case 0: // Empate
					System.out.println("Empatou!");
					desafiado.empatarLuta();
					desafiante.empatarLuta();
					break;
				case 1: // Desafiado venceu
					System.out.println("Vit�ria de " + this.desafiado.getNome());
					desafiado.ganharLuta();
					desafiante.perderLuta();
					break;
				case 2: // Desafiante venceu
					System.out.println("Vit�ria de " + this.desafiante.getNome());
					desafiado.perderLuta();
					desafiante.ganharLuta();
					break;
			}		
		}else {
			System.out.println("A luta n�o pode acontecer!");
		}
		
	}
	//M�todos Especiais
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
	public boolean isAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
}
