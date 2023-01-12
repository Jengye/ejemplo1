package tema4_repaso;

public class mi_bicicleta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Bicicleta miBicicleta = new Bicicleta (50,8,6);
	Bicicleta tuBicicleta = new Bicicleta (50,7,9);
	miBicicleta.acelerar();
	tuBicicleta.frenar();
	
	System.out.println(miBicicleta);
	}

}
