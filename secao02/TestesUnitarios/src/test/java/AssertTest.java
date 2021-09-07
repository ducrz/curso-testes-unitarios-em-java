

import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.entidades.Usuario;


public class AssertTest {

	@Test
	public void test(){
		Assert.assertTrue(true);
		Assert.assertFalse(false);
		
		/**É possível adicionar uma String no início
		que será apresentada caso ocorra um erro.
		Assert.assertEscolhida("String", entrada, entrada)
		**/
		
		Assert.assertEquals("Erro de comparação", 1, 1);
		
		Assert.assertEquals(0.51234, 0.512, 0.001);
		Assert.assertEquals(Math.PI, 3.14, 0.01);
		
		int i = 5;
		Integer i2 = 5;
		Assert.assertEquals(Integer.valueOf(i), i2);
		Assert.assertEquals(i, i2.intValue());
		
		/**Prestar atenção na ordem de esperado e atual
		 * no local correto **/
		Assert.assertEquals("bola", "bola");
		Assert.assertNotEquals("bola", "casa");
		Assert.assertTrue("bola".equalsIgnoreCase("Bola"));
		Assert.assertTrue("bola".startsWith("bo"));
		
		Usuario u1 = new Usuario("Usuario 1");
		Usuario u2 = new Usuario("Usuario 1");
		Usuario u3 = null;
		
		//Não funcionará sem o método equals na classe usuario
		Assert.assertEquals(u1, u2);
		
		Assert.assertSame(u2, u2);
		Assert.assertNotSame(u1, u2);
		
		Assert.assertNull(u3);
		Assert.assertNotNull(u2);
	}
}