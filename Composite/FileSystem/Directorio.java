package ej7;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Directorio extends FileSystem {

	List<FileSystem> elementos;
	
	public Directorio(String nombre) {
		super();
		
		if(nombre != "/") {
			this.nombre = nombre;
			this.nombreCompleto = this.getNombreCompleto() + nombre + "/";
		}
		elementos = new ArrayList<FileSystem>();
	}
	
	public Directorio(boolean EsRoot) {
		super();	
		if(!EsRoot) {
			this.nombre = "Nuevo Directorio";
			this.nombreCompleto = this.getNombreCompleto() + "Nuevo Directorio" + "/";		
		}
		elementos = new ArrayList<FileSystem>();
	}
	
	public void agregarElemento(FileSystem elemento)
	{
		elemento.setNombreCompleto(this.getNombreCompleto() + elemento.getNombre() + "/");
		elementos.add(elemento); 
	}
	
	@Override
	public List<FileSystem> getElementos() {
		return this.elementos;
	}

	@Override
	public int tamanoTotalOcupado() {
		return elementos.stream().mapToInt(e -> e.tamanoTotalOcupado()).sum();
	}

	@Override
	public Archivo archivoMasGrande() {
		
        int maxTamano = 0;
        Archivo archivoMásGrande = null;

        for (FileSystem elemento : elementos) {
            Archivo archivoActual = elemento.archivoMasGrande();
            if (archivoActual != null && archivoActual.tamanoTotalOcupado() > maxTamano) {
            	maxTamano = archivoActual.tamanoTotalOcupado();
            	archivoMásGrande = archivoActual;
            }
        }
        
        return archivoMásGrande;	    
	}
	
	@Override
	public LocalTime getFechaCreacion() {
		LocalTime newestDate = LocalTime.MIN;

        for (FileSystem component : elementos) {
        	LocalTime currentFileDate = component.getFechaCreacion();
            if (currentFileDate.isAfter(newestDate)) {
                newestDate = currentFileDate;
            }
        }

        return newestDate;
    }

	@Override
	public Archivo archivoMasNuevo() {
		LocalTime FechaMasNueva = LocalTime.MIN;
        Archivo ArchivoMasNuevo = null;

        for (FileSystem elemento : elementos) {
            Archivo archivoActual = elemento.archivoMasNuevo();
            if (archivoActual != null && archivoActual.getFechaCreacion().isAfter(FechaMasNueva)) {
            	FechaMasNueva = archivoActual.getFechaCreacion();
                ArchivoMasNuevo = archivoActual;
            }
        }

        return ArchivoMasNuevo;
	}
	
	@Override
	public FileSystem buscar(String nombre) {
		for (FileSystem elemento : elementos) {
			FileSystem archivo = elemento.buscar(nombre);
			if (archivo != null) {
				return archivo;
			}
		}
		return null;
		//return elementos.stream().filter(e -> e.getNombreCompleto().contains(nombre))
				//.findFirst().orElse(null);
	} 

	@Override
	public List<FileSystem> buscarTodos(String nombre) {
		for (FileSystem elemento : elementos) {
			List<FileSystem> archivos = elemento.buscarTodos(nombre);
			if (archivos != null) {
				return archivos;
			}
		}
		return null;
		//return elementos.stream().filter(d -> d.getNombre().contains(nombre)).collect(Collectors.toList());
	}

	@Override
	public String listadoDeContenido() {
		StringBuilder builder = new StringBuilder();
		//return this.elementos.stream().map(e -> e.toString()).toString();
		
        for (FileSystem elemento : elementos) {
            builder.append(elemento.getNombreCompleto()).append("\n");  
            if(elemento.getElementos() != null && elemento.getElementos().size() > 0) {
            	builder.append(elemento.listadoDeContenido());            	
            }
        }
        return builder.toString();
	}
	
}
