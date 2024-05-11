package oo2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import ej7.*;

class FileSystemTest {

	FileSystem fs;
	Archivo arc1, archivoMasGrande, arc3, archivoMasNuevo;
	Directorio dir1, dir2, dir2_1; 
	
	@BeforeEach
	void setUp() throws Exception {
		arc1 = new Archivo("archivo 1", 3);
		archivoMasGrande = new Archivo("mas grande", 6);
		arc3 = new Archivo("archivo 3", 4);
		
		dir1 = new Directorio("dir1");
		dir1.agregarElemento(arc1);
		
		dir2 = new Directorio("dir2");
		dir2_1 = new Directorio("dir2_1");
		dir2.agregarElemento(dir2_1);
		dir2_1.agregarElemento(archivoMasGrande);
		dir2.agregarElemento(arc3);
		
		fs = new Directorio(true);		
		fs.agregarElemento(dir1);
		fs.agregarElemento(dir2);
	}	
	
	@Test
	void testNombreCompleto() {
		System.out.println(archivoMasGrande.getNombreCompleto());
	}

	@Test
	void testTamanioTotalOcupado() {
		assertEquals(13, fs.tamanoTotalOcupado());		
	}
	
	@Test
	void testArchivoMasGrande() {	
		assertEquals(archivoMasGrande, fs.archivoMasGrande());
	}
	
	@Test
	void testArchivoMasNuevo() {
		archivoMasNuevo = new Archivo("archivo nuevo", 2);
		dir1.agregarElemento(archivoMasNuevo);
		assertEquals(archivoMasNuevo, fs.archivoMasNuevo());
	}
		
	@Test
	void testListadoDeContenido() {
		assertEquals("/dir1/\n"
				+ "/dir1/archivo 1/\n"
				+ "/dir2/\n"
				+ "/dir2/dir2_1/\n"
				+ "/dir2/dir2_1/archivo mas grande/\n"
				+ "/dir2/archivo 3/\n", fs.listadoDeContenido());
	}
	
	@Test
	void testBuscar() {
		assertEquals(archivoMasGrande, fs.buscar("grande"));
		assertEquals(null, fs.buscar("archivo perdido"));
	}
	
	@Test
	void testBuscarTodos() {		
		List<FileSystem> lista = new ArrayList<FileSystem>();
		lista.add(arc1);
		lista.add(arc3);
		assertEquals(lista, fs.buscarTodos("archivo"));
	}

}
