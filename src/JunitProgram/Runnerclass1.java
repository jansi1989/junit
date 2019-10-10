package JunitProgram;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Runnerclass1 {
	 public static void main(String[] args) {
		 Result rs = JUnitCore.runClasses(assClass.class,stuPro.class,emp.class);
		 System.out.println("RunCount:" +rs.getRunCount());
		 System.out.println("FailureCount:" +rs.getFailureCount());
		 System.out.println("IgnoreCount" +rs.getIgnoreCount());
		 System.out.println("RunTime" +rs.getRunTime());
		 List<Failure> failed = rs.getFailures();
	     for (Failure X : failed) {
			System.out.println(X);


	 }
}
}