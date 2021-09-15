package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.client.Main;

public class TestCase1 {

	@Test
	public void testAdd()
	{
		int num1=10;int num2=10;
		assertEquals(20,Main.add(num1, num2));
	}
	
	@Test
	public void testCompare()
	{
		int num1=10;int num2=10;
		assertEquals(true, Main.compare(num1, num2));
	}
}
