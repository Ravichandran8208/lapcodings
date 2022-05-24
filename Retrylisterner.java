package testing;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class Retrylisterner {
	public class RetryLIstner implements IAnnotationTransformer{
		
		public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		
			annotation.setRetryAnalyzer( testing.RetryFailedTests.class);
			
		}

	}

}
