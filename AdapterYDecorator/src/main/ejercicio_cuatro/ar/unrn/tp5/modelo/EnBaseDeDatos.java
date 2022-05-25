package ar.unrn.tp5.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EnBaseDeDatos implements Rest {

	private static String URL_DB = "jdbc:mysql://localhost:3306/";
	protected static String DB = "decorator_cuatro";
	protected static String user = "root";
	protected static String pass = "";
	protected static Connection conn = null;
	private Rest restCall;

	public EnBaseDeDatos(Rest restCall) {
		this.restCall = restCall;
	}

	@Override
	public String run() {
		// TODO Auto-generated method stub

		String contenido = this.restCall.run();

		this.connect();
		try {
			PreparedStatement statement = conn.prepareStatement("insert into contenido_blog(contenido)values(?)");

			statement.setString(1, contenido);
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			this.disconnect();
		}

		return contenido;
	}

	private void connect() {
		try {
			conn = DriverManager.getConnection(URL_DB + DB + "?useSSL=false", user, pass);
		} catch (SQLException sqlEx) {
			System.out.println("No se ha podido conectar a " + URL_DB + DB + ". " + sqlEx.getMessage());
			System.out.println("Error al cargar el driver");
		}
	}

	private void disconnect() {
		if (conn != null) {
			try {
				conn.close();
				conn = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}