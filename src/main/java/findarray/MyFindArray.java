/*
   This file is provided exclusively for the purpose of Spartez Online Assessment.
   Unauthorized distribution of this file, derived work or information about its
   content, via any medium, is strictly prohibited.
 */
package main.java.findarray;

public class MyFindArray implements main.java.findarray.FindArray {

    @Override
    public int findArray(int[] array, int[] subArray) {
        //	throw new UnsupportedOperationException("Please implement me!");
        if (array.length < subArray.length) {
            return -1;
        }
        boolean flag = false;
        int wykonanyWarunek=0;


            for (int i = 0; i < array.length; i++) {
                if (array[i] == subArray[0]) {
                     int licznik=0;
                     int i2=i;
                     if(subArray.length-1==0){
                         flag = true;
                         wykonanyWarunek=i2;
                     }

                    while ( subArray.length-1>licznik
                            && array.length-1>i
                            && array[i]==subArray[licznik]) {
                        i++; licznik++;
                        if(array[i]==subArray[licznik]){
                            if(subArray.length-1==licznik){
                                flag = true;
                                wykonanyWarunek=i2;
                            }
                        }else{
                            flag=false;
                            i--;
                            break;
                        }
                    }
                }
            }


        if (flag == false) {
            return -1;
        }

        return wykonanyWarunek;
    }

}
