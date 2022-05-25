package ar.unrn.tp5.main;

import ar.unrn.tp5.modelo.AdaptadorMotor;
import ar.unrn.tp5.modelo.Comun;
import ar.unrn.tp5.modelo.Economico;
import ar.unrn.tp5.modelo.Electrico;

public class MainMotor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var comun = new Comun();
		var economico = new Economico();
		var electrico = new Electrico();
		var adaptador = new AdaptadorMotor(electrico);

		System.out.println(comun.arrancar());
		System.out.println(comun.acelerar());
		System.out.println(comun.apagar());
		System.out.println("\n");
		System.out.println(economico.arrancar());
		System.out.println(economico.arrancar());
		System.out.println(economico.apagar());
		System.out.println("\n");
		System.out.println(adaptador.arrancar());
		System.out.println(adaptador.acelerar());
		System.out.println(adaptador.apagar());

	}

}
