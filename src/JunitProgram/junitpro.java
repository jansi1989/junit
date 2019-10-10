package JunitProgram;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class junitpro {

@BeforeClass
public static void LaunchBrowser() {
	System.out.println("Launch");
	
}
	@AfterClass
    public static void ClaseBrowser() {
		System.out.println("close");
	}
	@Before
	public void strattime() {
		System.out.println("Start");
	}
	@After
	public void EndTime() {
		System.out.println("End");
	}
	@Test
	public void aTest() {
		System.out.println("A");
	}
	@Test
	public void cTest() {
		System.out.println("C");
	}
}

