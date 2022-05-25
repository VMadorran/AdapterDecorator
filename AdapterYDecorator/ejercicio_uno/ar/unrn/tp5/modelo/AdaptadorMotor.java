package ar.unrn.tp5.modelo;

public class AdaptadorMotor implements Motor {

	private Electrico motorElectrico;

	public AdaptadorMotor(Electrico motorElectrico) {
		this.motorElectrico = motorElectrico;
	}

	@Override
	public String arrancar() {
		// TODO Auto-generated method stub
		return this.motorElectrico.activar() + "\n" + "Arrancando motor eléctrico";
	}

	@Override
	public String acelerar() {
		// TODO Auto-generated method stub

		return this.motorElectrico.moverMasRapido();
	}

	@Override
	public String apagar() {
		// TODO Auto-generated method stub
		return this.motorElectrico.detener() + "\n" + this.motorElectrico.deconectar() + "\n"
				+ "Apagando motor electrico";
	}

}
