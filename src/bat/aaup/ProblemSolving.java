package bat.aaup;

import java.util.ArrayList;
import java.util.Random;

public class ProblemSolving {

    public static void main(String[] args) {

    }

     // for array
    public static void swap(int index, int index2, int[] a) {
        int t=a[index2];
        a[index2]=a[index];
        a[index]=t;
    }
    //for Arraylist
    public static void swap(int index, int index2, ArrayList<Integer> a) {
        int t= a.get(index2);
        a.set(index2, a.get(index));
        a.set(index, t);
    }
    private static void addRandomNumbers(ArrayList<Integer> a, int noOfElements, int bound) {
        Random rand = new Random();
        for (int i = 0; i < noOfElements; i++) {
            a.add(rand.nextInt(bound));
        }
    }
    public static void printArray(ArrayList<Integer> a) {

        for (int i = 0; i < a.size(); i++) {
            Integer y = a.get(i);
            System.out.print(y + "\t");
        }

        System.out.println();
    }
    static boolean isSorted(ArrayList<Integer> array) {
        for (int i = 0; i < array.size() - 1; i++) {
            if (array.get(i) > array.get(i + 1))
                return false;
        }
        return true;
    }
    private static void copyArrays(int[] a, int start, int end, int[] temp) {
        for (int i = start; i <= end; i++) {
            temp[i- start]= a[i];
        }
    }
}
