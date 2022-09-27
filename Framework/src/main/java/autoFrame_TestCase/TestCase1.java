package autoFrame_TestCase;

import org.testng.annotations.Test;

import autoFrame_BasePackage.BaseInit;

public class TestCase1 extends BaseInit{
	
	@Test
	public void testCase1() {
		
		System.out.println("This is Test1");
		logs.info("This is test1");
	}

}
