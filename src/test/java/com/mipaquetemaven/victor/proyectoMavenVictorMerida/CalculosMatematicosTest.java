package com.mipaquetemaven.victor.proyectoMavenVictorMerida;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;



class CalculosMatematicosTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}


	@DisplayName(value = "Potencia")
	@ParameterizedTest
	@CsvSource(value = { "1,1,1", "2,2,4", "2,10,1024","5,11,48828125" })
	public void potenciaTest(int base, int exponente, int resultadoEsperado) {
		assertEquals(resultadoEsperado, CalculosMatematicos.potencia(base, exponente));
	}

	@ParameterizedTest
	@ValueSource(ints = { 2, 5, 19, 79, 199 })
	void esPrimoTest(int numero) {
		System.out.println(numero);
		assertTrue(CalculosMatematicos.esPrimo(numero));
	}
	
	@ParameterizedTest
	@ValueSource(ints = { 4, 8,100,777555222,1991,1115 })
	void esNoPrimoTest(int numero) {
		System.out.println(numero);
		assertFalse(CalculosMatematicos.esPrimo(numero));
	}
	
	
	@DisplayName(value = "Factorial")
	@ParameterizedTest
	@CsvSource(value = { "3,6", "4,24", "10,3628800", "5,120", "50,-1" })
	public void factorialTest(int numero, int resultadoEsperado) {
		assertEquals(resultadoEsperado, CalculosMatematicos.factorial(numero));
	}
}
