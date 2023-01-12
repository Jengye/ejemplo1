package tema4_repaso;

public class BicicletaMontaña extends Bicicleta {
	protected int suspension;

	public void cambiarSuspension(int suspension) {
		this.suspension = suspension;
	}

	public BicicletaMontaña(int velocidadActual, int platoActual, int piñonActual, int suspension) {
		super(velocidadActual, platoActual, piñonActual);
		this.suspension = suspension;
	}
}
