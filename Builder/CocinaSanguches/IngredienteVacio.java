package ej22;

public class IngredienteVacio implements IngredienteContent {

	@Override
	public String getNombre() {
		return "No Posee";
	}

	@Override
	public double getPrecio() {
		return 0;
	}

}
