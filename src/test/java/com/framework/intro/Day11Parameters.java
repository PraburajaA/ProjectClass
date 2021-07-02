package com.framework.intro;

import org.testng.annotations.Test;

public class Day11Parameters extends Day4Base {
	
	@Test(priority = 5)
	private void test1() {
		System.out.println("Test 1");
	}
	
	@Test(priority = -5 , enabled = false)
	private void test2() {
		System.out.println("Test 2");
	}
	
	@Test(priority = -2 , invocationCount = 5)
	private void test4() {
		System.out.println("Test 4");
	}
	
	@Test(priority = 2)
	private void test3() {
		System.out.println("Test 3");
	}
	

}
