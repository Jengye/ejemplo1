package tema4_repaso;

	public class Bicicleta {
	
		private int velocidadActual;
		private int platoActual;
		private int piñonActual;
	
	
	
	public Bicicleta(int velocidadActual, int platoActual, int piñonActual) {
			super();
			this.velocidadActual = velocidadActual;
			this.platoActual = platoActual;
			this.piñonActual = piñonActual;
		}

	public void acelerar() {
		velocidadActual*=2;
	}

	public void frenar() {
		velocidadActual/=2;
	}
	public void cambiarPlato(int plato) {
		platoActual=plato;
	}
	public void cambiarPiñon(int piñon) {
		piñonActual=piñon;
	}

	@Override
	public String toString() {
		return "ejercicio_uno_bicicleta [velocidadActual=" + velocidadActual + ", platoActual=" + platoActual
				+ ", piñonActual=" + piñonActual + "]";
	}
	
	
	
	}


