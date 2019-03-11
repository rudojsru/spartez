/*
   This file is provided exclusively for the purpose of Spartez Online Assessment.
   Unauthorized distribution of this file, derived work or information about its
   content, via any medium, is strictly prohibited.
 */
package test.java.findarray;

import main.java.findarray.FindArray;
import main.java.findarray.MyFindArray;
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
		final int[] array = {4, 3, 3, 7, 8};
		final int[] subArray = {3, 7};

		//when
		int result = findArray.findArray(array, subArray);

		//then
		assertEquals(2, result);
	}

	@Test
	public void findArrayMinusOne(){
		final int[] array ={7,8,9};
		final int [] subArray ={8,9,10};

		int result = findArray.findArray(array, subArray);
		assertEquals(-1,result);
	}

	@Test
	public void findArraySubOne(){
		final int[] array ={1,3,5};
		final int [] subArray ={1};

		int result= findArray.findArray(array,subArray);
		assertEquals(0,result);
	}

	@Test
	public void findArrayMoreZero(){
		final int[] array ={0,0,3,7,0,3,7,0};
		final int [] subArray ={3,7};

		int result= findArray.findArray(array,subArray);
		assertEquals(5,result);
	}

	/*
		Add more tests here if you like
	*/
}