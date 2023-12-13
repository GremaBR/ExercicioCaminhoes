package LevantamentoMeteorologico;

public class Pluviometro {
	String tipo;
	int peso;
	int capacidade;

	public Pluviometro(String i, int peso, int capacidade) {
		this.tipo = i;
		this.peso = peso;
		this.capacidade = capacidade;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public int getCapacidade() {
		return capacidade;
	}
	
	public String getTipo() {
		return tipo;
	}
}
