package com.pillar.redpencil;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RedPencilTest {

	@Before
	public void setUp() throws Exception {
	}

	/*
	 * Testing if sale is not activated by by no price reduction
	 */
	@Test
	public void test() {
		Redpencil promoRedpencil = new Redpencil();

		assertFalse(promoRedpencil.isActivated(.05, .31, 10.0, 10.0));
	}

	/*
	 * Testing if sale is activated by a price reduction of 5%
	 * 
	 */
	@Test
	public void test2() {
		Redpencil promoRedpencil = new Redpencil();

		assertTrue(promoRedpencil.isActivated(.05, .31, 9.5, 10.0));
	}

}
