package ar.unrn.tp5.modelo;

public class Familiar implements Combo {

	private String componentes;
	private double precio;

	public Familiar(String componentes, double precio) {

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
		// TODO Auto-generated method stub
		return this.precio;
	}

}
