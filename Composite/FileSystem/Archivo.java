package ej7;

import java.util.ArrayList;
import java.util.List;

public class Archivo extends FileSystem {
	
	protected Integer tamano;
	
	public Archivo(String nombre, int tamano) {
		super();
		this.nombre = nombre;
		this.nombreCompleto = this.getNombreCompleto() + nombre + "/";
		this.tamano = tamano;
	}
	
	@Override
	public List<FileSystem> getElementos() {
		return null;
	}

	@Override
	public int tamanoTotalOcupado() {
		return this.tamano;
	}

	@Override
	public Archivo archivoMasGrande() {
		return this;
	}

	@Override
	public Archivo archivoMasNuevo() {
		return this;
	}

	@Override
	public FileSystem buscar(String nombre) {
		if(this.nombre.contains(nombre)) {
			return this;
		}
		else {
			return null;			
		}
	}

	@Override
	public List<FileSystem> buscarTodos(String nombre) {
		List<FileSystem> lista;
		if (this.getNombre().contains(nombre)) {
			lista = new ArrayList<FileSystem>();
			lista.add(this);
			return lista;
		} 
		else {
			return null;			
		}
	}

	@Override
	public String listadoDeContenido() {
		return this.getNombreCompleto();
	}

	@Override
	public void agregarElemento(FileSystem elemento) {
		System.out.println("No se puede agregar elemento " + elemento.getNombre() + " a un Archivo");
	}
	
	
}
