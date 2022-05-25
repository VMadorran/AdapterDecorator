package ar.unrn.tp5.modelo;

import java.io.File;

public class ArchivoVacio implements Reporte {

	private Reporte reporte;

	public ArchivoVacio(Reporte reporte) {
		this.reporte = reporte;
	}

	@Override
	public void export(File file) {
		// TODO Auto-generated method stub

		if (file == null) {
			throw new IllegalArgumentException("File es NULL; no puedo exportar...");
		}

		this.reporte.export(file);

	}

}
