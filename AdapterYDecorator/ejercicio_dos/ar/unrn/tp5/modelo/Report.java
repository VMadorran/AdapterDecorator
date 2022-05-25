package ar.unrn.tp5.modelo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Report implements Reporte {
	private String reporte;

	public Report(String reporte) {
		this.reporte = reporte;
	}

	public void export(File file) {

		try {
			Files.write(file.toPath(), this.reporte.getBytes());

		} catch (IOException e) {
			throw new RuntimeException("No se pudo exportar", e);
		}

	}
}
