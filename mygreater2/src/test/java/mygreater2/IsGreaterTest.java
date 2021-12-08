package mygreater2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class IsGreaterTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsGreater() {
		Isgreater greater = new Isgreater();
		assertTrue("Num 1 is greater than Num 2", greater.isGreater(4, 3));
	}

}
