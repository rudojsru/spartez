/*
   This file is provided exclusively for the purpose of Spartez Online Assessment.
   Unauthorized distribution of this file, derived work or information about its
   content, via any medium, is strictly prohibited.
 */
package findarray;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyFindArrayTest {

	private FindArray findArray;

	@Before
	public void testSetup() throws Exception {
		findArray = new MyFindArray();
	}

	@Test
	public void findArrayFromTaskDescription() throws Exception {
		//given
		final int[] array = {4, 9, 3, 7, 8};
		final int[] subArray = {3, 7};

		//when
		int result = findArray.findArray(array, subArray);

		//then
		assertEquals(2, result);
	}

	/*
		Add more tests here if you like
	*/
}