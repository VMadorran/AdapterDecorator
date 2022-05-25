package ar.unrn.tp5.modelo;

public class Especial implements Combo {
	private String componentes;
	private double precio;

	public Especial(String componentes, double precio) {

		this.componentes = componentes;
		this.precio = precio;
	}

	@Override
	public String componentes() {
		// TODO Auto-generated method stub
		return this.componentes;
	}

	@Override
	public double precioFinal() {
		return this.precio;
		// TODO Auto-generated method stub

	}

}
