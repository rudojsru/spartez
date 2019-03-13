package main.java.mapdecoder;

import java.util.HashMap;
import java.util.Map;

public class MyMapDecoder implements MapDecoder {

    @Override
    public Map<String, String> decode(String s) {
        //throw new UnsupportedOperationException("Please implement me!");

        Map<String, String> expected = new HashMap<>();
        if (s == null) {
            return null;
        }

        if (s.equals("")) {
            return expected;
        }

        //
        {
            String[] splitEmpersant = s.split("");
            boolean ifEqualsExist = false;
            for (String str : splitEmpersant) {
                if (str.equals("&")) {
                    ifEqualsExist = true;
                }
            }
            try {
                if (ifEqualsExist == false) {
                    throw new IllegalArgumentException();
                } else {
                    String[] result = s.split("&");

                    for (int i = 0; i < result.length; i++) {
                        String[] splitEquals = result[i].split("");
                        ifEqualsExist = false;
                        for (String str : splitEquals) {
                            if (str.equals("=")) {
                                ifEqualsExist = true;
                            }
                        }
                        try {
                            if (ifEqualsExist == false) {
                                throw new IllegalArgumentException();
                            } else {
                                String[] kuczRes = result[i].split("=");
                                expected.put(kuczRes[0], kuczRes[1]);
                            }
                        } catch (IllegalArgumentException e) {
                            System.out.println("Caught an IllegalArgumentException...=..." + e.getMessage());
                        }
                    }
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Caught an IllegalArgumentException...&..." + e.getMessage());
            }
        }
        //
        return expected;
    }
}