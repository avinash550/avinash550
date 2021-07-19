package avimaven.MavenJava;

import org.testng.annotations.Test;

public class SecondTest {
	
	@Test(priority = 1)
	public void secondFunction1()
	{
		System.out.println("This is displayed from second function 1 of Second Class");
	}
	
	@Test(priority = 2)
	public void secondFunction2()
	{
		System.out.println("This is displayed from second function 2 of Second Class");
	}
}
