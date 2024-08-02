package Sample_Repo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Test
public class Program5 {
		@Test
		public void Strictlevelcomplarison()
		{
			String expectedValue ="raja";
			String actualValue ="Raja";
			SoftAssert sf=new SoftAssert();
			sf.assertEquals(actualValue, expectedValue);
			System.out.println("assertion passed!!");
			sf.assertAll();
		}
		@Test
		public void Containslevelcomplarison()
		{
			String expectedValue ="raja";
			String actualValue ="Maharaja";
			SoftAssert sf=new SoftAssert();
			sf.assertTrue(actualValue.contains(expectedValue));
			System.out.println("Contains passed!!");
			sf.assertAll();
		}
		}
