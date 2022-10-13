package com.demo.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class JunitDemo {

	@Test
	@Disabled
	void test() {
		fail("Not yet implemented");
	}
	
	   @Test
	   public void testAdd() {
	      String str = "Junit is working fine";
	      assertEquals("Junit is working fine",str);
	   }

}
