/*
   This file is provided exclusively for the purpose of Spartez Online Assessment.
   Unauthorized distribution of this file, derived work or information about its
   content, via any medium, is strictly prohibited.
 */
package findarray;

public class MyFindArray implements FindArray {

    @Override
    public int findArray(int[] array, int[] subArray) {
        //	throw new UnsupportedOperationException("Please implement me!");
        if (array.length < subArray.length) {
            return -1;
        }
        int licznik = 0;
        boolean flag = false;
        while (subArray.length > licznik) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == subArray[licznik]) {
                    flag = true;
                }
            }
            if (flag == false) {
                return -1;
            }
            licznik++;

        }
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == subArray[0])
                licznik = i;
        }
        return licznik;
    }

}
