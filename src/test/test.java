package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.entornos.nombreCompleto.algoritmos.Algoritmo;

class test {

static Algoritmo A;
	
	@BeforeAll
	static void arreglos() {
		A = new Algoritmo() {};
	}

	@Test
	void testFibonacci() {
		assertEquals(1 , A.fibonacci(1));
		assertEquals(5 , A.fibonacci(5));
		assertEquals(55 , A.fibonacci(10));
		
	}

	@Test
	void testFactorial() {
		assertEquals(2, A.factorial(2));
		assertEquals(1, A.factorial(1 ));
		assertEquals( 6, A.factorial(3));
	}

	@Test
	void testPrimo() {
		assertEquals(true, A.primo(2));
		assertEquals(false, A.primo(6));
		assertEquals(true, A.primo(7));
	}
	
	@Test
	void testFalloFibonacci() {
		assertThrows(IllegalArgumentException.class, () -> {
			A.fibonacci(-2);
		});
	}
	
	@Test
	void testFallofactorial() {
		assertThrows(IllegalArgumentException.class, () -> {
			A.factorial(-2);
		});
	}
	
	@Test
	void testFalloPrimo() {
		assertThrows(IllegalArgumentException.class, () -> {
			A.primo(-2);
		});
	}
	
	
	

}
