package JunitProgram;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class ignore {
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
		@Ignore
		@Test
		public void cTest() {
			System.out.println("C");
		}
		@Test
		public void bTest() {
			System.out.println("B");
	}
}


