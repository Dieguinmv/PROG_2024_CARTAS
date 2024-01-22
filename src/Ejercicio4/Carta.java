package Ejercicio4;

public class Carta {
	
	private char valor;
	private char palo;
	
	
	
	



	@Override
	public String toString() {
		return  "["+valor + palo + "]";
	}


	public char getPalo() {
		return palo;
	}
	
	
	public char getValor() {
		return valor;
	}

	public void setValor(char valor) {
		this.valor = valor;
	}

	public void setPalo(char palo) {
		this.palo = palo;
	}
	
	
}
