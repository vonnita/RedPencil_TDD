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

		assertFalse(promoRedpencil.isActivated(.05, .31, 10.0, 10.0,30));
	}

	/*
	 * Testing if sale is activated by a price reduction of 5%
	 * 
	 */
	@Test
	public void test2() {
		Redpencil promoRedpencil = new Redpencil();

		assertTrue(promoRedpencil.isActivated(.05, .31, 9.5, 10.0,31));
	}

	/*
	 * Testing if sale is activated by price
	 * at most 30% reduction
	 */
	@Test
	public void test3() {
		Redpencil promoRedpencil = new Redpencil();

		assertTrue(promoRedpencil.isActivated(.05, .31, 6.9, 10.0,31));
	}

	/*
	 * Testing if the original price 
	 * was stable/stayed the original 
	 * price for at least 30days
	 * then activate price reduction
	 */
	@Test
	public void test4() {
		Redpencil promoRedpencil = new Redpencil();

		assertTrue(promoRedpencil.isActivated(.05, .31, 6.9, 10.0, 31));
	}

	/*
	 * Testing if the original price  
	 * was not stable for less
	 * than 30 days.
	 * No price reduction.
	 */
	@Test
	public void test5() {
		Redpencil promoRedpencil = new Redpencil();

		assertFalse(promoRedpencil.isActivated(.05, .31, 6.9, 10.0, 29));
	}
	
	
}
