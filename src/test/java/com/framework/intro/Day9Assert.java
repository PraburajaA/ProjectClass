package com.framework.intro;

import org.junit.Assert;
import org.junit.Test;

public class Day9Assert {
	
	@Test
	public void test1() {
		Assert.assertTrue(true);
		Assert.assertTrue(false);
	}
	
	@Test
	public void test2() {
		Assert.assertTrue(true);
		Assert.assertTrue(false);
		System.out.println("Test2");
		Assert.assertTrue(true);
	}
	
	@Test
	public void test3() {
		Assert.assertTrue(true);
		Assert.assertTrue(false);
		System.out.println("Test2");
		Assert.assertTrue(true);
	}
	
	@Test
	public void test4() {
		Assert.assertTrue(true);
		Assert.assertTrue(false);
	}
	
}
