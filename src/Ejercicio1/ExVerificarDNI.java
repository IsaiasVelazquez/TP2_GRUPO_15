package Ejercicio1;

public class ExVerificarDNI extends RuntimeException{
	
	public ExVerificarDNI() {
		
	}

	@Override
	public String getMessage() {

		return "Ingrese 8 caracteres numéricos para el DNI.";
	}
	
	
}
