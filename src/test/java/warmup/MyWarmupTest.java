/*
   This file is provided exclusively for the purpose of Spartez Online Assessment.
   Unauthorized distribution of this file, derived work or information about its
   content, via any medium, is strictly prohibited.
 */
package test.java.warmup;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyWarmupTest {

	private Warmup warmup;

	@Before
	public void testSetup() throws Exception {
		warmup = new MyWarmup();
	}

	@Test
	public void findMaxFromTaskDescription() throws Exception {
		//given
		final int[] array = {1, 2, 3, 0, -1};

		//when
		int result = warmup.findMax(array);

		//then
		assertEquals(2, result);
	}

	/*
		Add more tests here if you like
	*/
}