package ar.unrn.tp5.modelo;

public class Adicional implements Combo {

	private String componentes;
	private double precio;
	private Combo combo;

	public Adicional(String componentes, double precio, Combo combo) {

		this.componentes = componentes;
		this.precio = precio;
		this.combo = combo;
	}

	@Override
	public String componentes() {
		// TODO Auto-generated method stub
		String componentes = this.componentes + " + " + this.combo.componentes();
		return componentes;
	}

	@Override
	public double precioFinal() {
		// TODO Auto-generated method stub
		double precioFinal = this.precio + this.combo.precioFinal();
		return precioFinal;
	}

}
