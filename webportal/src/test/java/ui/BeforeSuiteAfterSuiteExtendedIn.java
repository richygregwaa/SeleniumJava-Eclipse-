package ui;


import org.testng.annotations.Test;

import common.CommonDataSetup;

//Created Testng1.xml by highlighting this class in Package Explorer and 
//right-clicking selecting TestNG > Convert to TestNG.

//Note the use of extends below which incorporates CommonDataSetup which is stored
//under the package 'common'. CommonDataSetup has a @BeforeSuite and @AfterSuite

//Added 'extends CommonDataSetup' to all classes mentioned in testng.xml
//Added testng.xml to mastertestng.xml
//Now right-click mastertestng1.xml and Run As TestNG Suite



public class BeforeSuiteAfterSuiteExtendedIn extends CommonDataSetup{

	
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
