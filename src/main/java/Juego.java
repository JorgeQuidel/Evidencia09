public class Juego {

	private Dado dado1;
	private Dado dado2;

	public void jugar() {
		inicializarDados();
		lanzarDados();
		comprobarResultado();
	}

	private void inicializarDados(){
		dado1 = new Dado();
		dado2 = new Dado();
	}

	private void lanzarDados() {
		dado1.lanzar();
		dado2.lanzar();
	}

	private void comprobarResultado() {
		int sumaCaras = calcularResultado();
		if(esGanador(sumaCaras)){
			System.out.println("Sacaste "+ sumaCaras +"\nGanaste!");
		}else {
			System.out.println("Sacaste "+ sumaCaras +"\nPediste!");
		}
	}

	private int calcularResultado(){
		int caraDado1 = dado1.getCaraSuperior();
		int caraDado2 = dado2.getCaraSuperior();
		return Calculadora.sumar(caraDado1, caraDado2);
	}

	private boolean esGanador(int sumaCaras) {
		return sumaCaras == 7;
	}
}