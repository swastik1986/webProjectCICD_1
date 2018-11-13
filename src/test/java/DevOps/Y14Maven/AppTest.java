package DevOps.Y14Maven;

import org.junit.Test;

public class AppTest
{
	
	@Test
	public void mytest()
	{
	int p = 1;
	int q = 2;
	
	Addition_Y14 testadd = new Addition_Y14();
	
	int r = testadd.addition(p, q);
	
	if (r!=4)
	{
		System.out.println("failed");
	}
	}
}
