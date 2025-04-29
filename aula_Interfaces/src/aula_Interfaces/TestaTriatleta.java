package aula_Interfaces;

public class TestaTriatleta {

	public static void main(String[] args) {

		Triatleta triatleta = new Triatleta("Kelvyn");

		triatleta.aquecer();
		triatleta.nadar();
		triatleta.pedalar();
		triatleta.correr();
		triatleta.cansou();

	}

}
