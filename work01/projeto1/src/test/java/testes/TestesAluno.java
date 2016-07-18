package testes;

import org.junit.Assert;
import org.junit.Test;

import com.control.CalculosAluno;

public class TestesAluno {

	@Test
	public void testarCalculoMedia(){
		Double valor1 = 8.;
		Double valor2 = 6.;
		Double valorEsperado = 7.;
		Double resultado = 0.;
		
		resultado = new CalculosAluno().calcularMedia(valor1, valor2);
		
		Assert.assertEquals(valorEsperado, resultado);
		
	}
	
	
}
