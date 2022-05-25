package ar.unrn.tp5.main;

import ar.unrn.tp5.modelo.EnArchivo;
import ar.unrn.tp5.modelo.EnBaseDeDatos;
import ar.unrn.tp5.modelo.RestCall;

public class MainCallRest {
	public static void main(String[] args) {

		var archivo = new EnArchivo(new RestCall("https://jsonplaceholder.typicode.com/posts"));
		archivo.run();

		var baseDeDatos = new EnBaseDeDatos(new RestCall("https://jsonplaceholder.typicode.com/posts"));
		baseDeDatos.run();

		var doble = new EnBaseDeDatos(new EnArchivo(new RestCall("https://jsonplaceholder.typicode.com/posts")));
		doble.run();
	}
}
