package ar.edu.utn.intermedio.java.ejercicio2;

public class MainVehiculos {
	public static void main(String[] args) {
		Moto m = new Moto();
		m.setVelocidadMaxima(125);
		m.setCantidadRuedas(3);
		System.out.println(m.velocidadMaximaPorRueda());
		
		Automovil a = new Automovil();
		a.setVelocidadMaxima(125);
		a.setCantidadRuedas(3);
		System.out.println(a.velocidadMaximaPorRueda());
		
	}
}
