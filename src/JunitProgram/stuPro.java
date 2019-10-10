package JunitProgram;

import org.junit.Assert;
import org.junit.Test;

public class stuPro {
	@Test
	public void aTest() {
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		System.out.println("A");
	}
	@Test
	public void bTest() {
		Assert.assertTrue(true);
		Assert.assertTrue(false);
		Assert.assertTrue(true);
		System.out.println("B");
	}	
	@Test
	public void cTest() {
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		System.out.println("C");	
	}
	@Test
	public void eTest() {
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		System.out.println("E");
	
	}


}
