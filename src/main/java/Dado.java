public class Dado {
	private int caraSuperior;

	public int getCaraSuperior() {
		return caraSuperior;
	}

	public void lanzar() {
		caraSuperior = (int)(Math.random()*6 +1);
	}
}