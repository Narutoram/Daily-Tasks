package com.demo.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestLogic {
 
	    @Test  
	    public void testFindMax(){  
	        assertEquals(4,Calculation.findMax(new int[]{1,3,4,5}));  
	       // assertEquals(-1,Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));  
	    }  

}
