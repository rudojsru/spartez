
package main.java.mapdecoder;

import java.util.Map;

public class MyMapDecoder implements MapDecoder {

	@Override
	public Map<String, String> decode(String s) {
		  //throw new UnsupportedOperationException("Please implement me!");
        if (s == null) {
            return null;
        }
        Map<String, String> expected = new HashMap<>();
        String[] result = s.split("&");
        if (result.length <= 0) {
            return expected;
        }

        for (int i = 0; i < result.length; i++) {
            String[] kuczRes = result[i].split("=");
            expected.put(kuczRes[0], kuczRes[1]);

        }
        return expected;
    }

}
