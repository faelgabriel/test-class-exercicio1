package br.rgabriel.exercicio1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculoSalarioTest {

	private CalculoSalario calculoSalario;
	private static final double DELTA = 1e-15;

	@Before
	public void init() {
		this.calculoSalario = new CalculoSalario(160, 150, 3);
	}

	@Test
	public void testSalarioBruto() {
		assertEquals(24150.00, this.calculoSalario.salarioBruto(), DELTA);
	}

	@Test
	public void testDescontoInss() {
		assertEquals(2173.50, this.calculoSalario.descontoInss(), DELTA);
	}

	@Test
	public void testDescontoIr() {
		assertEquals(1690.50, this.calculoSalario.descontoIr(), DELTA);
	}

	@Test
	public void testSalarioLiquido() {
		assertEquals(20286.00, this.calculoSalario.salarioLiquido(), DELTA);
	}
}
