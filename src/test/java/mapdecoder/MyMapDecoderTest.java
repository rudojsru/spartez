/*
   This file is provided exclusively for the purpose of Spartez Online Assessment.
   Unauthorized distribution of this file, derived work or information about its
   content, via any medium, is strictly prohibited.
 */
package test.java.mapdecoder;

import main.java.mapdecoder.MyMapDecoder;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class MyMapDecoderTest {

	private MyMapDecoder mapDecoder;

	@Before
	public void testSetup() throws Exception {
		mapDecoder = new MyMapDecoder();
	}

	@Test
	public void decodeMap() throws Exception {
		//given
		final String input = "one=1&two=2";

		//when
		Map<String, String> result = mapDecoder.decode(input);

		//then
		Map<String, String> expected = new HashMap<>();
		expected.put("one", "1");
		expected.put("two", "2");

		assertEquals(expected, result);
	}

	@Test
	public void decoderZeroString(){
		//given
		final String input="";
		//when
		Map<String,String> result=mapDecoder.decode(input);
		//then
		Map<String, String> expected = new HashMap<>();
		assertEquals(result, expected);
	}
	@Test
	public void decoderNull(){
		//given
		final String input=null;
		//when
		Map<String,String> result=mapDecoder.decode(input);
		//then
		assertEquals(null, result);
	}
	@Test
	public void decoderBadString(){
		//given
		final String input="one1&two=2";
		//when
		Map<String, String> result=mapDecoder.decode(input);
		//then
		Map<String, String> expected = new HashMap<>();
		expected.put("two","2");
		assertEquals(expected, result);
	}

	@Test
	public void decoderBadEmpersant(){
		//given
		final String input="one=1two=2";
		//when
		Map<String, String> result=mapDecoder.decode(input);
		//then
		Map<String, String> expected = new HashMap<>();
		assertEquals(expected, result);
	}

	/*
		Add more tests here if you like
	*/

}