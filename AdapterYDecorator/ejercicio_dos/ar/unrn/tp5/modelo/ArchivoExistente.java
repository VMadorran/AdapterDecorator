package ar.unrn.tp5.modelo;

import java.io.File;

public class ArchivoExistente implements Reporte {

	private Reporte reporte;

	public ArchivoExistente(Reporte reporte) {
		this.reporte = reporte;
	}

	@Override
	public void export(File file) throws IllegalArgumentException {
		// TODO Auto-generated method stub

		if (file.exists()) {
			throw new IllegalArgumentException("El archivo ya existe...");
		}

		this.reporte.export(file);

	}

}
