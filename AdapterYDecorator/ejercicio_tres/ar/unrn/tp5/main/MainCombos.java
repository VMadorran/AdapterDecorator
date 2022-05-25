package ar.unrn.tp5.main;

import ar.unrn.tp5.modelo.Adicional;
import ar.unrn.tp5.modelo.Basico;
import ar.unrn.tp5.modelo.Familiar;

public class MainCombos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var comboAdicional = new Adicional("gaseosa", 150,
				(new Adicional("Papas medianas", 350, new Basico("Hamburguesa + papas chicas + gaseosa", 1500))));
		var comboFamiliar = new Adicional("2 hamburguesas simples", 1000, (new Adicional("2 Papas medianas", 700,
				new Familiar("4 hamburguesas + 4 papas chicas + 2 gaseosas grandes + 2 gaseosas chicas", 3000))));

		System.out.println("Componentes: " + comboAdicional.componentes());
		System.out.println("Precio final: " + comboAdicional.precioFinal());

		System.out.println("Componentes: " + comboFamiliar.componentes());
		System.out.println("Precio final: " + comboFamiliar.precioFinal());
	}

}
