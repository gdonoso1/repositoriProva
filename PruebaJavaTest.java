package prueba1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PruebaJavaTest {
	PruebaJava num;

	@Before
	public void crearNums() {
		num = new PruebaJava(0, 1, 2);
	}

	@Test
	public void test1() {		
		Assert.assertEquals(2, num.calcularMayor(), 0);
	}

}