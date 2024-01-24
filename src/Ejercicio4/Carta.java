package Ejercicio4;

public class Carta {
	
	private char valor;
	private char palo;
	private boolean bocaArriba;
	
	
	
	
	@Override
	public String toString() {
		String devolver =   "["+valor + palo;
		
		if(bocaArriba) {
			devolver += "]";
		}
		
		else devolver += "*]";
		
		return devolver;
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


	public boolean isBocaArriba() {
		return bocaArriba;
	}

	public void setBocaArriba(boolean bocaArriba) {
		this.bocaArriba = bocaArriba;
	}
	
	
	
}
