package ar.unrn.tp5.modelo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class EnArchivo implements Rest {

	private Rest restCall;

	public EnArchivo(Rest restCall) {
		this.restCall = restCall;
	}

	@Override
	public String run() {
		// TODO Auto-generated method stub

		String contenido = this.restCall.run();

		try {

			String ruta = "C:\\Users\\valen\\Desktop\\datos de blog.txt";
			File file = new File(ruta);

			// Si el archivo no existe es creado
			if (!file.exists()) {

				file.createNewFile();
			}
			Files.write(Paths.get(ruta), this.restCall.run().getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return contenido;

	}

}
