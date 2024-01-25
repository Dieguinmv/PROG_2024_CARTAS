package Ejercicio4;

public class Start {

	public static void main(String[] args) {
		
		Baraja baraja= new Baraja();
		System.out.println(baraja);
		
		Carta carta = new Carta();
		
		
		baraja.voltearCarta('A', 'C');
		
		
		baraja.voltearCarta('2', 'C');
		baraja.voltearCarta('5', 'C');
		baraja.voltearCarta('6', 'C');
		
		System.out.println(baraja);
		
	}

}
