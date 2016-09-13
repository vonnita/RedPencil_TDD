package com.pillar.redpencil;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RedPencilTest {

	@Before
	public void setUp() throws Exception {
	}
/*
 * Testing if sale is activated by 
 * by price reduction 
 */
	@Test
	public void test() { 
		Redpencil  promoRedpencil = new Redpencil();

		 assertFalse(promoRedpencil.isActivated(.05,.31,10.0,10.0));
		
		
	}

}
