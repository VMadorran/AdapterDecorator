package ar.unrn.tp5.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.nio.file.Paths;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ar.unrn.tp5.modelo.ArchivoExistente;
import ar.unrn.tp5.modelo.ArchivoVacio;
import ar.unrn.tp5.modelo.Report;

public class ReporteTest {

	@Test
	public void archivoVacio() {

		IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {

			File archivo = null;

			var reporte = new ArchivoVacio(new Report("Reporte vacio"));

			reporte.export(archivo);
		});

		Assertions.assertEquals("File es NULL; no puedo exportar...", thrown.getMessage());
	}

	@Test
	public void archivoExistente() {

		IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {

			File archivo = new File("C:\\Users\\valen\\Desktop\\archivo existente.txt");

			var reporte = new ArchivoExistente(new ArchivoVacio(new Report("Reporte existente")));

			reporte.export(archivo);
		});

		Assertions.assertEquals("El archivo ya existe...", thrown.getMessage());

	}

	@Test
	public void archivoNuevo() {

		var reporte = new ArchivoExistente(new ArchivoVacio(new Report("Reporte en archivo nuevo")));

		String path = "C:\\Users\\valen\\Desktop\\Archivo.txt";
		reporte.export(new File(path));
		File archivo = Paths.get(path).toFile();

		assertEquals(true, archivo.isFile());

	}

}
