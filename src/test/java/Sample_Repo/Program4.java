package Sample_Repo;

import org.testng.Assert;
import org.testng.annotations.Test;
@Test
public class Program4 {
@Test
public void Strictlevelcomplarison()
{
	String expectedValue ="raja";
	String actualValue ="Raja";
	Assert.assertEquals(actualValue, expectedValue);
	System.out.println("assertion passed!!");
}
@Test
public void Containslevelcomplarison()
{
	String expectedValue ="raja";
	String actualValue ="Maharaja";
	Assert.assertTrue(actualValue.contains(expectedValue));
	System.out.println("Contains passed!!");
}
}

