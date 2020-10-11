// Example of dependency with ' dependsOnMethods="userRegistration" ' and ' always run=true ' (false by default)
// Following classes are used together: Listeners, DependencyTest, testng7
package ui;
import org.testng.Assert;
import org.testng.annotations.Test;



public class DependencyTest {

	@Test
	public void userRegistration()
	{
		System.out.println("This is test 1");
		Assert.assertTrue(false);
	}

	
	@Test(dependsOnMethods="userRegistration",alwaysRun=true)
	public void userSearch()
	{
		System.out.println("This is test 2");
	}


	@Test
	public void reporterTest3()
	{
		System.out.println("This is test 3");
	}

	
	@Test
	public void reporterTest4()
	{
		System.out.println("This is test 4");
	}


}
