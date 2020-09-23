package ui;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// To see the BeforeClass annotation. Right-click here then select the following:
// Run As TestNG Test > Run Configurations > Class radio button 

// To see the BeforeGroup annotation. Right-click here then select the following:
// Run As TestNG Test > Run Configurations > Groups > Browse > regression 


@Test(groups = "user-registration1")
public class AnnotationsBeforeGroupsBeforeClass {

	@BeforeClass
	public void beforeClass() {
		System.out.println("Run this before class");

	}

	@AfterClass
	public void afterClass() {
		System.out.println("Run this after class");

	}

	@BeforeGroups(value="regression")
	public void beforeGroup() {
		System.out.println("Run this method before regression group");

	}

	@AfterGroups(value="regression")
	public void afterGroup() {
		System.out.println("Run this method after regression group");

	}

	
	@Test(priority = 1, groups = "regression")
	public void aTest1() {
		System.out.println("test1");

	}

	@Test(priority = 2, groups = "regression")
	public void bTest2() {
		System.out.println("test2");
	}

	@Test(priority = 3, groups = { "regression", "bvt" })
	public void bTest3() {
		System.out.println("test3");
	}

	@Test(priority = 4, groups = "bvt")
	public void bTest4() {
		System.out.println("test4");
	}

}
