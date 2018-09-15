package br.rgabriel.exercicio1;

public class CalculoSalario {
	private Double horasTrabalhadas;
	private Double salarioHora;
	private Integer dependentes;

	public CalculoSalario(double horasTrabalhadas, double salarioHora, int dependentes) {
		this.horasTrabalhadas = horasTrabalhadas;
		this.salarioHora = salarioHora;
		this.dependentes = dependentes;
	}

	public Double salarioBruto() {
		return this.horasTrabalhadas * this.salarioHora + (50 * this.dependentes);
	}

	public Double descontoInss() {
		if (this.salarioBruto() <= 1000) {
			return this.salarioBruto() * 8.5/100;
		}
		return this.salarioBruto() * 9/100;
	}

	public Double descontoIr() {
		if (this.salarioBruto() <= 500) {
			return (double) 0;
		}
		if (this.salarioBruto() > 500 && this.salarioBruto() <= 1000) {
			return this.salarioBruto() * 5/100;
		}
		return this.salarioBruto() * 7/100;

	}

	public Double salarioLiquido() {
		return this.salarioBruto() - this.descontoInss() - this.descontoIr();
	}


}
