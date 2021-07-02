package com.framework.intro;

import org.junit.*;

public class Day8Junit {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("BeforeClass--->Driver Initialization");

	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("AfterClass--->Close Driver");

	}
	
	@Test
	public void test1() {
		System.out.println("Test1--->Buisness Logic");

	}
	@Test
	public void test2() {
		System.out.println("Test2--->Buisness Logic");

	}
	@Before
	public void before() {
		System.out.println("Before--->Test Execution Start Time");

	}
	@After
	public void after() {
		System.out.println("After--->Test Execution End Time");

	}
	
}
