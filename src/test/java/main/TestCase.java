package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCase {
	SampleProject sm;
	@SuppressWarnings("static-access")
	@Test
	public void testHello() {
		sm = new SampleProject();
		
		assertEquals("Hello World!",sm.printHello());
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testAdd() {
		sm = new SampleProject();
		int a = 3+46;
		assertEquals(a,sm.add(3, 46));
	}

}
