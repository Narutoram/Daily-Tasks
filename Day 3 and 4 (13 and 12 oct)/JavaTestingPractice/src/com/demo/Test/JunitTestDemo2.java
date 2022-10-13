package com.demo.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTestDemo2 {

	
	 @Test
	   public void test() {
	      int num = 5;
	      String temp = null;
	      String str = "Junit is working fine";

	      assertEquals("Junit is working fine", str);
	      
	      assertFalse(num > 6);

	      assertNotNull(temp);
	   }

}
