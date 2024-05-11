package ej7;

import java.time.LocalTime;
import java.util.List;

public abstract class FileSystem {
		
	protected String nombre;
	protected String nombreCompleto = "/";
	protected LocalTime fechaCreacion;	
	
	public FileSystem() {
		this.fechaCreacion = LocalTime.now();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public LocalTime getFechaCreacion() {
		return fechaCreacion;
	}
	
	public abstract List<FileSystem> getElementos();
	
	public abstract void agregarElemento(FileSystem elemento);

	public abstract int tamanoTotalOcupado();

	public abstract Archivo archivoMasGrande();
	
	public abstract Archivo archivoMasNuevo();

	public abstract FileSystem buscar(String nombre);    
	
	public abstract List<FileSystem> buscarTodos(String nombre);

	public abstract String listadoDeContenido();
	

}
