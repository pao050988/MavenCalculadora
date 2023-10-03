package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class CalculadoraTest extends TestCase {
	Main calculadora = new Main();


	@Test
	public void testSuma() {
		assertEquals(15, calculadora.suma(10,5));
	}
	@Test
	public void testResta() {
		assertEquals(5, calculadora.resta(10,5));
	}
	@Test
	public void testMultiplicar() {
		assertEquals(50, calculadora.multiplicar(10,5));
	}
	@Test
	public void testDivision() {
		assertEquals(2.0, calculadora.division(10,5));
	}
}