package ej15;

public class File implements Manager{
	
	private String nombre;
	private String extension;
	private int tamanio;
	
	public File(String nombre, String extension, int tamanio) {
		this.nombre = nombre;
		this.extension = extension;
		this.tamanio = tamanio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	@Override
	public String prettyPrint() {
		return "File Info: ";
	}

}
