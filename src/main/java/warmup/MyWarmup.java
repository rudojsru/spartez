/*
   This file is provided exclusively for the purpose of Spartez Online Assessment.
   Unauthorized distribution of this file, derived work or information about its
   content, via any medium, is strictly prohibited.
 */
package main.java.warmup;

public class MyWarmup implements Warmup {
    public static void main(String[] args) {
        MyWarmup myWarmup = new MyWarmup();
        int array1[] ={1,2,3,0,-1};
        int array2[] ={1,4,4,1};
        int array3[] ={ };
        System.out.println(myWarmup.findMax(array1));
        System.out.println(myWarmup.findMax(array2));
        System.out.println(myWarmup.findMax(array3));
    }

    @Override
    public  int findMax(int[] array) {

            if (array.length <= 0) {
                return -1;
            }
            int max = 0;
            int numberInArray = 0;
            boolean flag = false;
            for (int i = 0; i < array.length; i++) {
                if (max <= array[i]) {
                    if (max == array[i]) {
                        flag = true;
                    }
                    if(max<array[i]){
                        flag=false;
                    }
                    max = array[i];
                    numberInArray = i-1;

                }
            }
            if(flag ==true){
                return numberInArray;
            }else return max;

    }
}
